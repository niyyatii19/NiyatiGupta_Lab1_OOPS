package com.HotelBookingManager;

import java.util.Date;

public class BookingDuration {
    private Date checkIn;
    private int noOfDays;

    public BookingDuration(Date checkIn, int noOfDays) {
        this.checkIn = checkIn;
        this.noOfDays = noOfDays;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public int getNoOfDays() {
        return noOfDays;
    }
}
