package com.HotelBookingManager;

public class Address {
    private String city;
    private String state;
    private String streetName;
    private int zipCode;

    public Address(String city, String state, String streetName, int zipCode) {
        this.city = city;
        this.state = state;
        this.streetName = streetName;
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getZipCode() {
        return zipCode;
    }
}
