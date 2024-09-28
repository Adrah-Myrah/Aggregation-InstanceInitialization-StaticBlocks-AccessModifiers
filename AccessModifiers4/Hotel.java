package AccessModifiers4;

class Hotel {
       String hotelName;
       String hotelAddress;
       double hotelRoomCost;

    public Hotel( String hotelName, String hotelAddress, double hotelRoomCost) {
        this.hotelName = hotelName;
        this.hotelAddress = hotelAddress;
        this.hotelRoomCost = hotelRoomCost;
    }

    public void hotelInfo(){
        System.out.println("Hotel Name: " + " " + hotelName);
        System.out.println("Hotel Address: " + " " + hotelAddress);
        System.out.println("Hotel room cost:" + " " + hotelRoomCost);
    }
}
