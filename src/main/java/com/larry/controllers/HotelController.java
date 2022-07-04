package com.larry.controllers;

import com.larry.models.Hotel;
import com.larry.payload.request.HotelRequest;
import com.larry.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashSet;
import java.util.Set;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/data/hotel")
public class HotelController {
    @Autowired
    HotelRepository hotelRepository;

    @PostMapping
    public String addHotel(@Valid @RequestBody HotelRequest hotelRequest) {
        Set<String> contact = new HashSet<>();
        contact.add("0223565445");
        Hotel hotel = new Hotel( hotelRequest.getHotel_name(),hotelRequest.getHotel_email(),contact);
        hotelRepository.save(hotel);
        return "Public Content.";
    }

    @GetMapping("/user")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public String userAccess() {
        return "User Content.";
    }

    @GetMapping("/mod")
    @PreAuthorize("hasRole('MODERATOR')")
    public String moderatorAccess() {
        return "Moderator Board.";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminAccess() {
        return "Admin Board.";
    }
}
