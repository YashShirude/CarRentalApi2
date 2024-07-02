package com.carRentalAPI.rentalAPI.repository;

import com.carRentalAPI.rentalAPI.model.CarDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarsRepository extends JpaRepository<CarDetails,String> {
}
