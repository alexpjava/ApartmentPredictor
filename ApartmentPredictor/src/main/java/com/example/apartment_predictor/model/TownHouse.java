package com.example.apartment_predictor.model;

import java.util.UUID;

public class TownHouse extends Apartment{

    boolean pool;
    boolean garage;
    boolean basement;
    boolean hoa;

    public TownHouse() {
        this.id = UUID.randomUUID().toString();
    }

    public TownHouse(boolean pool, boolean garage, boolean basement) {
        this.id = UUID.randomUUID().toString();
        this.pool = pool;
        this.garage = garage;
        this.basement = basement;
    }

    public boolean isPool() {
        return pool;
    }

    public void setPool(boolean pool) {
        this.pool = pool;
    }

    public boolean isGarage() {
        return garage;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    public boolean isBasement() {
        return basement;
    }

    public void setBasement(boolean basement) {
        this.basement = basement;
    }

    public TownHouse(Long price, Integer area, Integer bedrooms, Integer bathrooms, Integer stories, String mainroad, String guestroom, String basement, String hotwaterheating, String airconditioning, Integer parking, String prefarea, String furnishingstatus, boolean pool, boolean garage, boolean basement1) {
        super(price, area, bedrooms, bathrooms, stories, mainroad, guestroom, basement, hotwaterheating, airconditioning, parking, prefarea, furnishingstatus);
        this.id = UUID.randomUUID().toString();
        this.pool = pool;
        this.garage = garage;
        this.basement = basement1;


    }

    @Override
    public String toString() {
        return "TownHouse{" +
                "pool=" + pool +
                ", garage=" + garage +
                ", basement=" + basement +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public double calculateRenovationCost(double costXm4){
        double priceReform = 0;
        if (hoa) {
            priceReform = super.calculateRenovationCost(false, costXm4);
        }
        return priceReform;
    }

}

