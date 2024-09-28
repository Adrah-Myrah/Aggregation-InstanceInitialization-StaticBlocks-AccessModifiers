package AccessModifiers4;

public class Main {
    public static void main(String[]args) {
        Hotel hotel = new Hotel("Kampala Serena Hotel","Kampala", 2500.0);
        hotel.hotelInfo();

        Rooms room = new Rooms("6th floor", 302);
        System.out.println("Room Floor:"+ " " + room.getRoomFloor());
        System.out.println("Room Number:" + " " + room.getRoomNumber());

        Gym g =new Gym("C", "2:00", "7:00");

    }
}
