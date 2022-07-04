package com.larry.controllers;

import com.larry.models.RentalCar;
import com.larry.payload.request.RentalCarRequest;
import com.larry.repository.RentalCarRepository;
import org.hibernate.annotations.Any;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/data/renterCar")
public class RentalCarController {
    @Autowired
    RentalCarRepository RentalCarRepository;

    Logger logger = LoggerFactory.getLogger(RentalCarController.class);

    @PostMapping("/")
    @PreAuthorize("hasRole('ADMIN')")
    RentalCar newRentalCar() {
        logger.trace("method start");
        RentalCar rentalCar = new RentalCar();
        rentalCar.setColor("black");
        return RentalCarRepository.save(rentalCar);
    }


}
