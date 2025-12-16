package com.example.apartment_predictor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public abstract class ResidentialProperty extends Property {

    @Id
    private String id;
    protected Integer bedrooms;
    private Integer bathrooms;
    private String guestroom;
    private String hotwaterHeating;
    private String airconditioning;
    private Integer parking;
    private String furnishingstatus;
    private String basement;
    private String mainroad;
    private String prefarea;

    public ResidentialProperty(Integer bedrooms, Integer bathrooms, String guestroom, String hotwaterHeating, String airconditioning, Integer parking, String furnishingstatus, String basement, String mainroad, String prefarea) {
        super();
        //this.id = UUID.randomUUID().toString();
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.guestroom = guestroom;
        this.hotwaterHeating = hotwaterHeating;
        this.airconditioning = airconditioning;
        this.parking = parking;
        this.furnishingstatus = furnishingstatus;
        this.basement = basement;
        this.mainroad = mainroad;
        this.prefarea = prefarea;
    }

    public ResidentialProperty() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(Integer bedrooms) {
        this.bedrooms = bedrooms;
    }

    public Integer getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(Integer bathrooms) {
        this.bathrooms = bathrooms;
    }

    public String getGuestroom() {
        return guestroom;
    }

    public void setGuestroom(String guestroom) {
        this.guestroom = guestroom;
    }

    public String getHotwaterHeating() {
        return hotwaterHeating;
    }

    public void setHotwaterHeating(String hotwaterHeating) {
        this.hotwaterHeating = hotwaterHeating;
    }

    public String getAirconditioning() {
        return airconditioning;
    }

    public void setAirconditioning(String airconditioning) {
        this.airconditioning = airconditioning;
    }

    public Integer getParking() {
        return parking;
    }

    public void setParking(Integer parking) {
        this.parking = parking;
    }

    public String getFurnishingstatus() {
        return furnishingstatus;
    }

    public void setFurnishingstatus(String furnishingstatus) {
        this.furnishingstatus = furnishingstatus;
    }

    public String getBasement() {
        return basement;
    }

    public void setBasement(String basement) {
        this.basement = basement;
    }

    public String getMainroad() {
        return mainroad;
    }

    public void setMainroad(String mainroad) {
        this.mainroad = mainroad;
    }

    public String getPrefarea() {
        return prefarea;
    }

    public void setPrefarea(String prefarea) {
        this.prefarea = prefarea;
    }

    @Override
    public String toString() {
        return "ResidentialProperty{" +
                "id='" + id + '\'' +
                ", bedrooms=" + bedrooms +
                ", bathrooms=" + bathrooms +
                ", guestroom='" + guestroom + '\'' +
                ", hotwaterHeating='" + hotwaterHeating + '\'' +
                ", airconditioning='" + airconditioning + '\'' +
                ", parking=" + parking +
                ", furnishingstatus='" + furnishingstatus + '\'' +
                ", basement='" + basement + '\'' +
                ", mainroad='" + mainroad + '\'' +
                ", prefarea='" + prefarea + '\'' +
                '}';
    }

    @Override
    public double calculatePrice() {
        return 0;
    }

    /**
     * Calculates the renovation cost for the property.
     * <p>
     * This method provides a default renovation cost calculation based on
     * the property area and optional features.
     * Subclasses are expected to override this method to provide
     * specific renovation cost logic according to their own requirements.
     *
     * @param area dimensions of area in square meter
     * @return the calculated renovation cost
     */

    public abstract double calculateRenovationCost(double area);

}
