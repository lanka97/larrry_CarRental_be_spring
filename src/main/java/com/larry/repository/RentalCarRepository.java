package com.larry.repository;

import com.larry.models.RentalCar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalCarRepository extends JpaRepository<RentalCar, Integer> {
}