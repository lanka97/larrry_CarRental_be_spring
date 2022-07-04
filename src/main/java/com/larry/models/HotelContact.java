//package com.larry.models;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "hotel_contact")
//public class HotelContact {
//    @Id
//    @Column(name = "hotel_id", nullable = false)
//    private Integer hotelId;
//
//    @Id
//    @Column(name = "hotel_contact", nullable = false)
//    private Long contact;
//
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "hotel_hotel_id")
//    private Hotel hotel;
//
//    public Hotel getHotel() {
//        return hotel;
//    }
//
//    public void setHotel(Hotel hotel) {
//        this.hotel = hotel;
//    }
//
//
//    @ManyToOne
//    @JoinColumn(name="hotel_ids")
//    public Integer getHotelId() {
//        return hotelId;
//    }
//
//    public void setHotelId(Integer hotelId) {
//        this.hotelId = hotelId;
//    }
//
//    public Long getContact() {
//        return contact;
//    }
//
//    public void setContact(Long contact) {
//        this.contact = contact;
//    }
//}