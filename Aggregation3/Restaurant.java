package Aggregation3;

public class Restaurant {
     String restaurantName;

     String restaurantAddress;

     Building RestaurantBuilding;

    public Restaurant(String Name, String Address, Building restaurantBuilding){
        restaurantName = Name;
        restaurantAddress = Address;
        RestaurantBuilding = restaurantBuilding;
    }

    void restaurantInfo(){
        System.out.println("Restaurant Name:" + " " + restaurantName);
        System.out.println("Restaurant Address:" + " " + restaurantAddress);
        System.out.println("Restaurant Building:" + " " + RestaurantBuilding.getBuildingName());

    }

}
