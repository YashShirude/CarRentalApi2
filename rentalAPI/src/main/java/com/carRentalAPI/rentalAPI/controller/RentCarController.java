package com.carRentalAPI.rentalAPI.controller;

import com.carRentalAPI.rentalAPI.model.RideDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/car/rent")
public class RentCarController {
    RideDetails rideDetails;

    @GetMapping("{origin}")
    public void originInitializer(@PathVariable("origin") String origin){
        rideDetails.setOrigin(origin);
    }

    @GetMapping("{dest}")
    public void destInitializer(@PathVariable("dest") String dest){
        rideDetails.setDestination(dest);
    }

    @GetMapping("{cat}")
    public void categoryInitializer(@PathVariable("cat") String cat){
        rideDetails.setCategory(cat);
    }

    @GetMapping("{rh}")
    public void hoursInitializer(@PathVariable("rh") String hrs){
        rideDetails.setRequiredHours(hrs);
    }
}
