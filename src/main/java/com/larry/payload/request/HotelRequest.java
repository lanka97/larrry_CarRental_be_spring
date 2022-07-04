package com.larry.payload.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

public class HotelRequest implements Serializable {
    @NotBlank
    @Size(max = 20)
    private final String hotel_name;
    @NotBlank
    @Email
    private final String hotel_email;

    public HotelRequest(String hotel_name, String hotel_email) {
        this.hotel_name = hotel_name;
        this.hotel_email = hotel_email;
    }

    public String getHotel_name() {
        return hotel_name;
    }

    public String getHotel_email() {
        return hotel_email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotelRequest entity = (HotelRequest) o;
        return Objects.equals(this.hotel_name, entity.hotel_name) &&
                Objects.equals(this.hotel_email, entity.hotel_email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hotel_name, hotel_email);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "hotel_name = " + hotel_name + ", " +
                "hotel_email = " + hotel_email + ")";
    }
}
