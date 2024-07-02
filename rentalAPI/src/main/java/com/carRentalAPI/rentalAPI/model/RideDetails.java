package com.carRentalAPI.rentalAPI.model;

public class RideDetails {
    private String origin;
    private String destination;
    private String category;
    private String requiredHours;

    public RideDetails() {
    }

    public RideDetails(String origin, String destination, String category, String requiredHours) {
        this.origin = origin;
        this.destination = destination;
        this.category = category;
        this.requiredHours = requiredHours;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getRequiredHours() {
        return requiredHours;
    }

    public void setRequiredHours(String requiredHours) {
        this.requiredHours = requiredHours;
    }
}
