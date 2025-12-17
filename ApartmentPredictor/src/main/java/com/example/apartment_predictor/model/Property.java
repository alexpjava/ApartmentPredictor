package com.example.apartment_predictor.model;

<<<<<<< HEAD
import jakarta.persistence.Id;

=======
>>>>>>> 07e2c87d814e0ab2b303641bfd3af0f8560a24a6
import java.util.UUID;

public abstract class Property {

<<<<<<< HEAD
    @Id
    private String id;
    private double area;
    private int locationRating;
    private String address;
    private Long price;

    // Default constructor
    Property() {

    }
    // Constructor with all fields
    private Property(double area, int locationRating, String address, Long price) {
        this.id = UUID.randomUUID().toString();
        this.area = area;
        this.locationRating = locationRating;
        this.address = address;
        this.price = price;
    }


    /**
     * Calculates the price of the property.
     * <p>
     * This method must be implemented by all subclasses,
     * as the price calculation depends on the specific
     * type of property.
     *
     * @return the calculated property price
     */
    public abstract double calculatePrice();



=======
    protected String id;
    protected double area;
    protected int locationRating;


    public abstract double calculateRenovationCost( double costXm4);
>>>>>>> 07e2c87d814e0ab2b303641bfd3af0f8560a24a6
}
