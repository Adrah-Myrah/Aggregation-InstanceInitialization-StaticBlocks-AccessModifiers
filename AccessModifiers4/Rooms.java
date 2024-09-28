package AccessModifiers4;

public class Rooms  {
    protected String roomFloor;
    protected int roomNumber;

    public Rooms(String roomFloor, int roomNumber) {
        this.roomFloor = roomFloor;
        this.roomNumber = roomNumber;
    }

    protected String getRoomFloor() {
        return roomFloor;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    protected void roomInfo(){
        System.out.println("Room Floor:" + " " + roomFloor );
        System.out.println("Room Number" + " " + roomNumber );
    }
}
