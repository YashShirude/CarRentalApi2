package com.carRentalAPI.rentalAPI.service;

import com.carRentalAPI.rentalAPI.exceptions.UserFoundException;
import com.carRentalAPI.rentalAPI.exceptions.UserNotFoundException;
import com.carRentalAPI.rentalAPI.model.LoginDetails;
import com.carRentalAPI.rentalAPI.model.SignUpDetails;
import com.carRentalAPI.rentalAPI.model.UserDetails;
import com.carRentalAPI.rentalAPI.repository.CarsRepository;
import com.carRentalAPI.rentalAPI.repository.UsersRepository;
import org.springframework.stereotype.Service;

import java.nio.charset.Charset;
import java.util.Random;

import static com.carRentalAPI.rentalAPI.model.UserDetails.allUserId;

@Service
public class RentalService {
    CarsRepository carsRepository;
    UsersRepository usersRepository;

    public RentalService(CarsRepository carsRepository) {
        this.carsRepository = carsRepository;
    }

    public RentalService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public String createUserAccount(SignUpDetails signUpDetails) {
        allUserId++;
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));

        UserDetails userDetails = new UserDetails(Long.toString(allUserId), signUpDetails.getInputUsername(), signUpDetails.getInputPassword(), signUpDetails.getInputEmail(),generatedString);
        usersRepository.save(userDetails);
        return "Account successfully created";
    }

    public String verifyUser(LoginDetails loginDetails) {
        String userName = loginDetails.getLoginUsername();
        String password = loginDetails.getLoginPassword();

        if(usersRepository.findById(userName).isEmpty()){
            throw new UserNotFoundException("Invalid Username or Password");
        }else if(usersRepository.getById(userName).getPassword().equals(password)){
            throw new UserFoundException();
        }
        return "";
    }
}
