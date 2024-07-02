package com.carRentalAPI.rentalAPI.controller;

import com.carRentalAPI.rentalAPI.model.CarDetails;
import com.carRentalAPI.rentalAPI.service.RentalService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/car/create")
public class CarCreateController {
    RentalService rentalService;

    public CarCreateController(RentalService rentalService) {
        this.rentalService = rentalService;
    }

    @PostMapping
    public String createCar(@RequestBody CarDetails carDetails){
        return "";
    }
}
