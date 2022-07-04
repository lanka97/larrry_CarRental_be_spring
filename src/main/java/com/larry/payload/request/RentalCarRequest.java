package com.larry.payload.request;

import com.larry.models.RentalCar;
import lombok.Data;

import java.io.Serializable;

@Data
public class RentalCarRequest implements Serializable {
    private final Long ownerId;
    private final String car_name;
    private final String type;
    private final String engine_num;
    private final String chassis_num;
    private final String reg_num;
    private final String make;
    private final String model;
    private final int year;
    private final int rentals_count;
    private final int engine_cc;
    private final String fuel_type;
    private final int fuel_eco;
    private final int odo_count;
    private final String color;
    private final int inspector_rating;
    private final String additional_desp;
    private final boolean allow_renting;

    public RentalCar getRentalCarObject(){
        RentalCar rentalCar = new RentalCar();
        return  rentalCar;
    }
}
