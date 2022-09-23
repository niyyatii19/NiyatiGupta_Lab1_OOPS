package com.HotelBookingManager;
import java.util.Scanner;

public class HotelManager {
    static Room room11 = new Room(101, 1, false, RoomStatus.NotOccupied, RoomOccupancy.Single);
    static Room room12 = new Room(102, 1, true, RoomStatus.NotOccupied, RoomOccupancy.Single);
    static Room room13 = new Room(103, 1, true, RoomStatus.NotOccupied, RoomOccupancy.Double);
    static Room room14 = new Room(104, 1, false, RoomStatus.NotOccupied, RoomOccupancy.Single);

    static Room room21 = new Room(201, 2, false, RoomStatus.NotOccupied, RoomOccupancy.Single);
    static Room room22 = new Room(202, 2, true, RoomStatus.NotOccupied, RoomOccupancy.Single);
    static Room room23 = new Room(203, 2, true, RoomStatus.NotOccupied, RoomOccupancy.Double);
    static Room room24 = new Room(204, 2, false, RoomStatus.NotOccupied, RoomOccupancy.Single);

    static Room[][] rooms = {{room11, room12, room13, room14},
            {room21, room22, room23, room24}};

    static Address address = new Address("Bangalore", "Karnataka", "ABC", 154320);
    static Hotel hotel = new Hotel("XYZ Hotel", 4.2, rooms, 2, 4, address);

    public static void main(String[] args) {

        BookingRequest bookingRequest;
        BookingDuration bookingDuration;
        Customer customer = new Customer("Alisha", 12, "female");

        Scanner scanner = new Scanner(System.in);
        try{
            while(true) {
            System.out.println();
            System.out.println("**** Another Request *****");
            System.out.println("Enter Occupancy : Single Double Triple");
            String occupancy = scanner.next();
            System.out.println("Enter floor no. only if required else 0");
            int floor = scanner.nextInt();
            System.out.println("Is AC required");
            boolean ac = scanner.nextBoolean();
            bookingRequest = new BookingRequest(RoomOccupancy.valueOf(occupancy), floor, ac);
            Room roomIfAvailable = checkInCustomer(bookingRequest, hotel.getNoOFRooms());
            if (roomIfAvailable != null) {
                Booking bookingDone = bookingPriceAndDetails(roomIfAvailable, customer);
                System.out.println("***** Your Room Details *****");
                System.out.println("Room Number: " + bookingDone.getRoom().getRoomId() + "\n" +
                        "Floor no.:" + bookingDone.getRoom().getFloor() + "\n" +
                        "" + bookingDone.getRoom().getOccupancy() + " occupancy" + "\n" +
                        "Is Ac there? " + bookingDone.getRoom().isHasAc() + "\n" +
                        "Cost: " + bookingDone.getTotalCost() + "/Day");
            } else {
                System.out.println("No such room available");
            }

        }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }

    private static Booking bookingPriceAndDetails(Room room, Customer customer) {
        double totalCost = 0.0;
        if(room.isHasAc()){
            totalCost += room.getAcCost() ;
        }
        totalCost +=  RoomPrice.getPrice(room.getOccupancy());
        return new Booking(customer, totalCost, room, customer.getBookingDuration());
    }

    private static Room checkInCustomer(BookingRequest bookingRequest, Room[][] rooms) {

        Room room = null;

        if(bookingRequest.getFloorPref() != 0){
            int i = bookingRequest.getFloorPref() -1;
            for(int j=0; j<rooms[i].length; j++){
                room = roomAvailable(rooms[i][j], bookingRequest);
                if(room != null )break;
            }
        }
        else{
            for (Room[] value : rooms) {
                for (Room item : value) {
                    room = roomAvailable(item, bookingRequest);
                    if(room != null )break;
                }
            }
        }

        if(room != null)
            room.setRoomStatus(RoomStatus.Occupied);
        return room;
    }

    private static Room roomAvailable(Room room, BookingRequest bookingRequest) {

        if (!room.getRoomStatus().equals(RoomStatus.Occupied) &&
                (room.getOccupancy().equals(bookingRequest.getOccupancyReq()))) {
            if (bookingRequest.isAcReq()) {
                if (room.isHasAc()) {
                    return room;
                }else{
                    return null;
                }
            } else {
                return room;
            }
        }
        return null;
    }

}
