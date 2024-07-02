package com.carRentalAPI.rentalAPI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "car_details")
public class CarDetails {
    @Id
    private String carId;
    private String numberPlate;
    private String currentCity;
    private String rentPerHr;
    private String model;
    private List<String> rentHistory;
    private String category;

    public CarDetails() {
    }

    public CarDetails(String numberPlate, String currentCity, String rentPerHr, String model, List<String> rentHistory, String category) {
        this.numberPlate = numberPlate;
        this.currentCity = currentCity;
        this.rentPerHr = rentPerHr;
        this.model = model;
        this.rentHistory = rentHistory;
        this.category = category;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getCurrentCity() {
        return currentCity;
    }

    public void setCurrentCity(String currentCity) {
        this.currentCity = currentCity;
    }

    public String getRentPerHr() {
        return rentPerHr;
    }

    public void setRentPerHr(String rentPerHr) {
        this.rentPerHr = rentPerHr;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<String> getRentHistory() {
        return rentHistory;
    }

    public void setRentHistory(List<String> rentHistory) {
        this.rentHistory = rentHistory;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
