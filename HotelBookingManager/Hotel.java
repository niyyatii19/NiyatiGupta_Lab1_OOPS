package com.HotelBookingManager;

public class Hotel {
    private String hotelName;
    private double rating;
    private Room[][] noOFRooms;
    private int noOfFloors;
    private int roomPerFloor;
    private Address address;
    public Hotel(String hotelName, double rating, Room[][] noOFRooms, int noOfFloors, int roomPerFloor,
                    Address address) {
        this.hotelName = hotelName;
        this.rating = rating;
        this.noOFRooms = noOFRooms;
        this.noOfFloors = noOfFloors;
        this.roomPerFloor = roomPerFloor;
        this.address = address;
    }

    public String getHotelName() {
        return hotelName;
    }

    public double getRating() {
        return rating;
    }

    public Room[][] getNoOFRooms() {
        return noOFRooms;
    }

    public int getNoOfFloors() {
        return noOfFloors;
    }

    public Address getAddress() {
        return address;
    }

    public int getRoomPerFloor() {
        return roomPerFloor;
    }
}
