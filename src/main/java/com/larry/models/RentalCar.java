package com.larry.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
@Entity
@Table(name = "rental_car")
public class RentalCar {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "rental_car_id", nullable = false)
    private Integer id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User owner;

    @Column(length = 20)
    private String car_name;

    @Column(length = 20)
    private String type;

    @Column(length = 20)
    private String engine_num;

    @Column(length = 20)
    private String chassis_num;

    @Column(length = 20)
    private String reg_num;

    @Column(length = 20)
    private String make;

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public String getCar_name() {
        return car_name;
    }

    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEngine_num() {
        return engine_num;
    }

    public void setEngine_num(String engine_num) {
        this.engine_num = engine_num;
    }

    public String getChassis_num() {
        return chassis_num;
    }

    public void setChassis_num(String chassis_num) {
        this.chassis_num = chassis_num;
    }

    public String getReg_num() {
        return reg_num;
    }

    public void setReg_num(String reg_num) {
        this.reg_num = reg_num;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRentals_count() {
        return rentals_count;
    }

    public void setRentals_count(int rentals_count) {
        this.rentals_count = rentals_count;
    }

    public int getEngine_cc() {
        return engine_cc;
    }

    public void setEngine_cc(int engine_cc) {
        this.engine_cc = engine_cc;
    }

    public String getFuel_type() {
        return fuel_type;
    }

    public void setFuel_type(String fuel_type) {
        this.fuel_type = fuel_type;
    }

    public int getFuel_eco() {
        return fuel_eco;
    }

    public void setFuel_eco(int fuel_eco) {
        this.fuel_eco = fuel_eco;
    }

    public int getOdo_count() {
        return odo_count;
    }

    public void setOdo_count(int odo_count) {
        this.odo_count = odo_count;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getInspector_rating() {
        return inspector_rating;
    }

    public void setInspector_rating(int inspector_rating) {
        this.inspector_rating = inspector_rating;
    }

    public String getAdditional_desp() {
        return additional_desp;
    }

    public void setAdditional_desp(String additional_desp) {
        this.additional_desp = additional_desp;
    }

    public boolean isAllow_renting() {
        return allow_renting;
    }

    public void setAllow_renting(boolean allow_renting) {
        this.allow_renting = allow_renting;
    }

    @Column(length = 20)
    private String model;

    @Column
    private int year;

    @Column
    private int rentals_count;

    @Column
    private int engine_cc;

    @Column(length = 20)
    private String fuel_type;

    @Column
    private int fuel_eco;

    @Column
    private int odo_count;

    @Column(length = 20)
    private String color;

    @Column(length = 4)
    private int inspector_rating;

    @Column(length = 1000)
    private String additional_desp;

    @Column
    private Boolean allow_renting;

    public User getUser() {
        return owner;
    }

    public void setUser(User user) {
        this.owner = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}

