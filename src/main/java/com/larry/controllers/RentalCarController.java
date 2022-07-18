package com.larry.controllers;

import com.larry.models.RentalCar;
import com.larry.models.User;
import com.larry.payload.request.RentalCarRequest;
import com.larry.repository.RentalCarRepository;
import com.larry.repository.UserRepository;
import io.swagger.annotations.Api;
import org.hibernate.annotations.Any;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Api(tags = {"Rental Car"})
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/data/renterCar")
public class RentalCarController {
    @Autowired
    RentalCarRepository RentalCarRepository;

    @Autowired
    UserRepository userRepository;

    Logger logger = LoggerFactory.getLogger(RentalCarController.class);



    @PostMapping("/")
    @PreAuthorize("hasAuthority('PORTAL_USER')")
    String newRentalCar( @RequestBody RentalCarRequest request, @RequestHeader(value = "Authorization") String auth ) {
        logger.trace("method start");
        User user = new User();
        if(request.getOwnerId() != null){
            user =  userRepository.findById(request.getOwnerId()).orElseThrow(() -> new RuntimeException("Error: User is not found."));
        }
        logger.trace(String.valueOf(user));
        RentalCar rentalCar = new RentalCar();
        rentalCar.setAllow_renting(request.isAllow_renting());
        rentalCar.setUser(user);
        rentalCar.setColor("black");
        RentalCarRepository.save(rentalCar);
        return "200";
    }


}
