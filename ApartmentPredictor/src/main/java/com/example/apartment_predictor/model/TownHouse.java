package com.example.apartment_predictor.model;

<<<<<<< HEAD
import java.util.UUID;

public class TownHouse extends SingleFamilyHome {
=======
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;
import java.util.UUID;

@Entity
public class TownHouse extends Apartment{

    @Id
    protected String id;
>>>>>>> 07e2c87d814e0ab2b303641bfd3af0f8560a24a6

    boolean pool;
    boolean garage;
    boolean basement;
    boolean hoa;

    public TownHouse() {
        this.id = UUID.randomUUID().toString();
    }

    public TownHouse(boolean pool, boolean garage, boolean basement) {
<<<<<<< HEAD
=======

>>>>>>> 07e2c87d814e0ab2b303641bfd3af0f8560a24a6
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

<<<<<<< HEAD
    public TownHouse(Long price, Integer area, Integer bedrooms, Integer bathrooms, Integer stories, String mainroad, String guestroom, String basement, String hotwaterheating, String airconditioning, Integer parking, String prefarea, String furnishingstatus, boolean pool, boolean garage, boolean basement1) {
        super(price, area, bedrooms, bathrooms, stories, mainroad, guestroom, basement, hotwaterheating, airconditioning, parking, prefarea, furnishingstatus);
        this.id = UUID.randomUUID().toString();
        this.pool = pool;
        this.garage = garage;
        this.basement = basement1;


=======
    public TownHouse(boolean pool, boolean garage, boolean basement, boolean hoa) {
        this.pool = pool;
        this.garage = garage;
        this.basement = basement;
        this.hoa = hoa;
    }

    public TownHouse(String id, Long price, Integer bedrooms, Integer bathrooms, Integer stories, String mainroad, String guestroom, String basement, String hotwaterheating, String airconditioning, Integer parking, String prefarea, String furnishingstatus, boolean balcony, List<Review> reviews, boolean pool, boolean garage, boolean basement1, boolean hoa) {
        super(id, price, bedrooms, bathrooms, stories, mainroad, guestroom, basement, hotwaterheating, airconditioning, parking, prefarea, furnishingstatus, balcony, reviews);
        this.pool = pool;
        this.garage = garage;
        this.basement = basement1;
        this.hoa = hoa;
>>>>>>> 07e2c87d814e0ab2b303641bfd3af0f8560a24a6
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
<<<<<<< HEAD
            priceReform = super.calculateRenovationCost(false, costXm4);
=======
            priceReform = super.calculateRenovationCost(costXm4);
>>>>>>> 07e2c87d814e0ab2b303641bfd3af0f8560a24a6
        }
        return priceReform;
    }

}
<<<<<<< HEAD
=======

>>>>>>> 07e2c87d814e0ab2b303641bfd3af0f8560a24a6
