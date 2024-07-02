package com.carRentalAPI.rentalAPI.controller;

import com.carRentalAPI.rentalAPI.model.LoginDetails;
import com.carRentalAPI.rentalAPI.service.RentalService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/login")
public class LoginController {

    RentalService rentalService;

    public LoginController(RentalService rentalService) {
        this.rentalService = rentalService;
    }

    @PostMapping
    public String authentication(@RequestBody LoginDetails loginDetails){
        return rentalService.verifyUser(loginDetails);
    }
}
