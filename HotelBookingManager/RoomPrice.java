package com.HotelBookingManager;

public class RoomPrice {
    static private double price;

    static double getPrice(RoomOccupancy occupancy){
        return setPrice(occupancy);
    }

    private static double setPrice(RoomOccupancy occupancy) {
        if(occupancy == RoomOccupancy.Single){
            return 2000;
        }
        else if(occupancy == RoomOccupancy.Double){
            return 3000;
        }
        else{
            return 4000;
        }
    }

}
