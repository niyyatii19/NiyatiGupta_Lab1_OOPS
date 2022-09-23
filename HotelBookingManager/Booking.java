package com.HotelBookingManager;

public class Booking {
    private Customer customer;
    private double totalCost;
    private Room room;
    private BookingDuration bookingDuration;

    public Booking(Customer customer, double totalCost, Room room, BookingDuration bookingDuration) {
        this.customer = customer;
        this.totalCost = totalCost;
        this.room = room;
        this.bookingDuration = bookingDuration;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public Room getRoom() {
        return room;
    }

    public BookingDuration getBookingDuration() {
        return bookingDuration;
    }
}
