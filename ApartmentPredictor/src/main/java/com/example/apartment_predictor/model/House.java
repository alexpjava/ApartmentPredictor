package com.example.apartment_predictor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class House extends Apartment {

    @Id
    protected String id;
    private int garageQty;
    private String roofType;
    private String garden;
    private int poolQty;

    public int getPoolQty() {
        return poolQty;
    }

    public void setPoolQty(int poolQty) {
        this.poolQty = poolQty;
    }

    public int getBasementQyy() {
        return basementQyy;
    }

    public void setBasementQyy(int basementQyy) {
        this.basementQyy = basementQyy;
    }

    private int basementQyy;

    public House() {
        this.id = UUID.randomUUID().toString();
    }

    public House(int garageQty, String roofType, String garden) {
        this.id = UUID.randomUUID().toString();
        this.garageQty = garageQty;
        this.roofType = roofType;
        this.garden = garden;
    }

    public int getGarageQty() {
        return garageQty;
    }

    public void setGarageQty(int garageQty) {
        this.garageQty = garageQty;
    }

    public String getRoofType() {
        return roofType;
    }

    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }

    public String getGarden() {
        return garden;
    }

    public void setGarden(String garden) {
        this.garden = garden;
    }

    @Override
    public String toString() {
        return "House{" +
                "garageQty=" + garageQty +
                ", roofType='" + roofType + '\'' +
                ", garden='" + garden + '\'' +
                ", poolQty=" + poolQty +
                ", basementQyy=" + basementQyy +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public double calculateRenovationCost(double costXm4){
        double pricePool = 200 * poolQty;
        double priceGarage = 300 * garageQty;
        double priceBasement = 500 * basementQyy;

        double priceReform = super.calculateRenovationCost(costXm4);
        priceReform = priceReform + pricePool + priceGarage + priceBasement;

        return priceReform;
    }
}
