package com.HotelBookingManager;

public class BookingRequest {
    private RoomOccupancy occupancyReq;
    private int floorPref;
    private boolean acReq;

    public BookingRequest(RoomOccupancy occupancyReq, int floorPref, boolean acReq) {
        this.occupancyReq = occupancyReq;
        this.floorPref = floorPref;
        this.acReq = acReq;
    }

    public BookingRequest(RoomOccupancy occupancyReq) {
        this.occupancyReq = occupancyReq;
    }

    public BookingRequest(int floorPref) {
        this.floorPref = floorPref;
    }

    public BookingRequest(boolean acReq) {
        this.acReq = acReq;
    }

    public RoomOccupancy getOccupancyReq() {
        return occupancyReq;
    }

    public int getFloorPref() {
        return floorPref;
    }

    public boolean isAcReq() {
        return acReq;
    }
}
