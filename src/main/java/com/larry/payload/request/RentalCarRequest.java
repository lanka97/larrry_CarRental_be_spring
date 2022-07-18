package com.larry.payload.request;

import com.larry.models.RentalCar;
import lombok.Data;

import java.io.Serializable;

public class RentalCarRequest{
    private Long ownerId;
    private String car_name;
    private String type;
    private String engine_num;
    private String chassis_num;
    private String reg_num;
    private String make;
    private String model;
    private int year;
    private int rentals_count;
    private int engine_cc;
    private String fuel_type;
    private int fuel_eco;
    private int odo_count;
    private String color;
    private int inspector_rating;
    private String additional_desp;
    private boolean allow_renting;

    public RentalCar getRentalCarObject(){
        RentalCar rentalCar = new RentalCar();
        return  rentalCar;
    }

    public String getCar_name() {
        return car_name;
    }

    public String getType() {
        return type;
    }

    public String getEngine_num() {
        return engine_num;
    }

    public String getChassis_num() {
        return chassis_num;
    }

    public String getReg_num() {
        return reg_num;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getRentals_count() {
        return rentals_count;
    }

    public int getEngine_cc() {
        return engine_cc;
    }

    public String getFuel_type() {
        return fuel_type;
    }

    public int getFuel_eco() {
        return fuel_eco;
    }

    public int getOdo_count() {
        return odo_count;
    }

    public String getColor() {
        return color;
    }

    public int getInspector_rating() {
        return inspector_rating;
    }

    public String getAdditional_desp() {
        return additional_desp;
    }

    public boolean isAllow_renting() {
        return allow_renting;
    }

    public Long getOwnerId() {
        return ownerId;
    }
    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

}
