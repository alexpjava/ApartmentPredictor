package com.example.apartment_predictor.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
<<<<<<< HEAD
public class Apartment extends ResidentialProperty{

    @Id
    protected String id;
    private Integer stories;
    boolean balcony;


=======
public class Apartment extends Property {

    @Id
    protected String id;
    private Long price;
    //private Integer area;
    private Integer bedrooms;
    private Integer bathrooms;
    private Integer stories;
    private String mainroad;
    private String guestroom;
    private String basement;
    private String hotwaterheating;
    private String airconditioning;
    private Integer parking;
    private String prefarea;
    private String furnishingstatus;
    private boolean balcony;
>>>>>>> 07e2c87d814e0ab2b303641bfd3af0f8560a24a6

    @OneToMany(
            mappedBy = "apartment",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER)
    private List<Review> reviews = new ArrayList<>();

    // Default constructor
    public Apartment() {
        this.id = super.id;
    }

    // Constructor with all fields

    public Apartment(String id, Long price, Integer bedrooms, Integer bathrooms, Integer stories, String mainroad, String guestroom, String basement, String hotwaterheating, String airconditioning, Integer parking, String prefarea, String furnishingstatus, boolean balcony, List<Review> reviews) {
        this.id = id;
        this.price = price;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.stories = stories;
        this.mainroad = mainroad;
        this.guestroom = guestroom;
        this.basement = basement;
        this.hotwaterheating = hotwaterheating;
        this.airconditioning = airconditioning;
        this.parking = parking;
        this.prefarea = prefarea;
        this.furnishingstatus = furnishingstatus;
        this.balcony = balcony;
        this.reviews = reviews;
    }


<<<<<<< HEAD
    public double calculatePrice() {
        double basePrice = area * 120 + (bedrooms * 8000);
        return basePrice * (1 + (area * 0.04));
    }

=======
>>>>>>> 07e2c87d814e0ab2b303641bfd3af0f8560a24a6
    // helpers

    public void addReview(Review review) {
        reviews.add(review);
        review.setApartment(this);
    }

    public void removeReview(Review review) {
        reviews.remove(review);
        review.setApartment(null);
    }


    // Getters and Setters
    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public double getArea() {
        return super.area;
    }

    public void setArea(double area) {
        this.area = super.area;
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

    public Integer getStories() {
        return stories;
    }

    public void setStories(Integer stories) {
        this.stories = stories;
    }

    public String getMainroad() {
        return mainroad;
    }

    public void setMainroad(String mainroad) {
        this.mainroad = mainroad;
    }

    public String getGuestroom() {
        return guestroom;
    }

    public void setGuestroom(String guestroom) {
        this.guestroom = guestroom;
    }

    public String getBasement() {
        return basement;
    }

    public void setBasement(String basement) {
        this.basement = basement;
    }

    public String getHotwaterheating() {
        return hotwaterheating;
    }

    public void setHotwaterheating(String hotwaterheating) {
        this.hotwaterheating = hotwaterheating;
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

    public String getPrefarea() {
        return prefarea;
    }

    public void setPrefarea(String prefarea) {
        this.prefarea = prefarea;
    }

    public String getFurnishingstatus() {
        return furnishingstatus;
    }

    public void setFurnishingstatus(String furnishingstatus) {
        this.furnishingstatus = furnishingstatus;
    }

    public String getId() {
        return id;
    }

   /* public void setId(String id) {
        this.id = id;
    }*/


   public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "id=" + id +
                ", price=" + price +
                ", area=" + super.area +
                ", bedrooms=" + bedrooms +
                ", bathrooms=" + bathrooms +
                ", stories=" + stories +
                ", mainroad='" + mainroad + '\'' +
                ", guestroom='" + guestroom + '\'' +
                ", basement='" + basement + '\'' +
                ", hotwater='" + hotwaterheating + '\'' +
                ", airconditioning='" + airconditioning + '\'' +
                ", parking=" + parking +
                ", prefarea='" + prefarea + '\'' +
                ", furnishingstatus='" + furnishingstatus + '\'' +
                ", reviews='" + reviews.size() + '\'' +
                '}';
    }

<<<<<<< HEAD
    // Methods

    /**
     * Calculates the renovation cost for the apartment.
     * <p>
     * This method provides a default renovation cost calculation based on
     * the apartment area and optional features.
     * Subclasses are expected to override this method to provide
     * specific renovation cost logic according to their own requirements.
     *
     * @param balcony indicates whether the apartment has a balcony
     * @param costXm4 renovation cost per square meter
     * @return the calculated renovation cost
     */

    @Override
    public double calculateRenovationCost( double costXm4){

        double priceReform = costXm4 * area;
        if (balcony){
            priceReform = priceReform * 1.5;
        }
        return priceReform;
    }


=======
    //METODES
    @Override
    public double calculateRenovationCost(double costXm4){

       double priceReform = costXm4 * super.area;
       if (balcony){
          priceReform = priceReform * 1.5;
       }
       return priceReform;
    }
>>>>>>> 07e2c87d814e0ab2b303641bfd3af0f8560a24a6
}
