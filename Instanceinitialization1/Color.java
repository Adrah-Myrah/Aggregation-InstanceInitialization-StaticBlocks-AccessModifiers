package Instanceinitialization1;

public class Color {
    int colorNumber;
    String colorName;
    {
        colorNumber=350;
        System.out.println("The color number is:"+ " " + colorNumber);

    }
    public Color(){
        colorName="Blue";
        System.out.println("The color name is:" + " " + colorName);
    }

    public String getColorName() {
        return colorName;
    }

    public int getColorNumber() {
        return colorNumber;
    }
}
