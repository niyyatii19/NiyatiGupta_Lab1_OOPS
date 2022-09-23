package com.HotelBookingManager;

public class Room {
    private int roomId;
    private int floor;
    private boolean hasAc;
    private RoomStatus roomStatus;
    private RoomOccupancy occupancy;
    private double acCost;

    public double getAcCost() {
        return acCost;
    }

    public Room(int roomId, int floor, boolean hasAc, RoomStatus roomStatus, RoomOccupancy occupancy) {
        this.roomId = roomId;
        this.hasAc = hasAc;
        this.floor = floor;
        this.roomStatus = roomStatus;
        this.occupancy = occupancy;
        if(hasAc){
            this.acCost = 1000;
        }
    }

    public int getFloor() {
        return floor;
    }

    public void setRoomStatus(RoomStatus roomStatus) {
        this.roomStatus = roomStatus;
    }

    public int getRoomId() {
        return roomId;
    }

    public boolean isHasAc() {
        return hasAc;
    }

    public RoomStatus getRoomStatus() {
        return roomStatus;
    }

    public RoomOccupancy getOccupancy() {
        return occupancy;
    }
}
