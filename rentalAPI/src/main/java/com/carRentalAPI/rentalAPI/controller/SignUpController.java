package com.carRentalAPI.rentalAPI.controller;

import com.carRentalAPI.rentalAPI.model.SignUpDetails;
import com.carRentalAPI.rentalAPI.service.RentalService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/signup")
public class SignUpController {
    RentalService rentalService;

    public SignUpController(RentalService rentalService) {
        this.rentalService = rentalService;
    };

    @PostMapping
    public String createAccount(@RequestBody SignUpDetails signUpDetails){
        return rentalService.createUserAccount(signUpDetails);
    }

}
