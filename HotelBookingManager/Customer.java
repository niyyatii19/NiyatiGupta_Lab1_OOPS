package com.HotelBookingManager;

public class Customer {
    private String name;
    private int age;
    private String gender;
    private BookingRequest bookingRequest;
    private BookingDuration bookingDuration;

    public void setBookingRequest(BookingRequest bookingRequest) {
        this.bookingRequest = bookingRequest;
    }

    public void setBookingDuration(BookingDuration bookingDuration) {
        this.bookingDuration = bookingDuration;
    }

    public Customer(String name, int age, String gender, BookingRequest bookingRequest, BookingDuration bookingDuration) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.bookingRequest = bookingRequest;
        this.bookingDuration = bookingDuration;
    }

    public Customer(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public BookingRequest getBookingRequest() {
        return bookingRequest;
    }

    public BookingDuration getBookingDuration() {
        return bookingDuration;
    }
}
