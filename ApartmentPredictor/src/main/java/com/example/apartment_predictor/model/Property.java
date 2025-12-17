package com.example.apartment_predictor.model;

import java.util.UUID;

public abstract class Property {

    protected String id;
    protected double area;
    protected int locationRating;


    public abstract double calculateRenovationCost( double costXm4);
}
