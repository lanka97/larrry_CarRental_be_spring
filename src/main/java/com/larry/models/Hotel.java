package com.larry.models;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "hotel")
public class Hotel {
//    Set<HotelContact> contacts = new HashSet<>();
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer hotel_id;
    @NotBlank
    @Size(max = 20)
    private String hotel_name;
    @NotBlank
    @Email
    private String hotel_email;

    public Hotel() {
    }

    public Hotel(String hotel_name, String hotel_email, Set<String> contact) {
        this.hotel_name = hotel_name;
        this.hotel_email = hotel_email;
    }

//    @OneToMany(targetEntity = HotelContact.class, mappedBy = "hotelId", cascade = CascadeType.ALL)
//    public Set<HotelContact> getContacts() {
//        return contacts;
//    }

//    public void setContacts(Set<HotelContact> contacts) {
//        this.contacts = contacts;
//    }

    public Integer getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(Integer hotel_id) {
        this.hotel_id = hotel_id;
    }

    public String getHotel_name() {
        return hotel_name;
    }

    public void setHotel_name(String hotel_name) {
        this.hotel_name = hotel_name;
    }

    public String getHotel_email() {
        return hotel_email;
    }

    public void setHotel_email(String hotel_email) {
        this.hotel_email = hotel_email;
    }
}