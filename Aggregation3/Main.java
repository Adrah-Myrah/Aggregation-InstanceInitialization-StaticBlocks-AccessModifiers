package Aggregation3;

public class Main {
    public static void main(String[]args){
        Building building = new Building("Acacia Mall","Kololo",690);
        Restaurant restaurant = new Restaurant("Java House", "Kololo",building);

        restaurant.restaurantInfo();
        building.buildingInfo();

    }
}
