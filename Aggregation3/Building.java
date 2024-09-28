package Aggregation3;

public class Building {
     String buildingName;
     String buildingAddress;
     int buildingAreaCode;

    public Building(String Name, String Address, int AreaCode) {
        this.buildingName = Name;
        this.buildingAddress = Address;
        this.buildingAreaCode = AreaCode;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public String getBuildingAddress() {
        return buildingAddress;
    }

    public int getBuildingAreaCode() {
        return buildingAreaCode;
    }



    void buildingInfo(){
        System.out.println("Building Name:" + " " + buildingName);
        System.out.println("Building Address:" + " " + buildingAddress);
        System.out.println("Building Area Code:" + " " + buildingAreaCode);
    }

}
