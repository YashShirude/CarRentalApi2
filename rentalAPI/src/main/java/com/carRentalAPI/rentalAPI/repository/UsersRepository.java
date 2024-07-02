package com.carRentalAPI.rentalAPI.repository;

import com.carRentalAPI.rentalAPI.model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<UserDetails, String> {
}
