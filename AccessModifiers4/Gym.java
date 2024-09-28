package AccessModifiers4;

public class Gym {
    private String blockName;
    String openingTime;
    String closingTime;

    protected Gym(String blockName, String openingTime, String closingTime) {
        this.blockName = blockName;
        this.openingTime = openingTime;
        this.closingTime = closingTime;

    }

    private void gymInfo(){
        System.out.println("The gym is on block:" + " " + blockName);
        System.out.println("Gym opening time:" + " " + openingTime);
        System.out.println("Gym closing time:" + " " +  closingTime );
    }
}
