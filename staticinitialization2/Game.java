package staticinitialization2;

public class Game {
    static int levelOne;
    int levelTwo;
    static {
        levelOne=80;
        System.out.println("Level One game points:" +" "+ levelOne );
    }
    public Game(int L2){
        int levelTwo = 95;
        System.out.println("Level Two game points:" +" "+ levelTwo);
    }

    public static int getLevelOne() {
        return levelOne;
    }

    public int getLevelTwo() {
        return levelTwo;
    }

    void accessBoth(){
        System.out.println("Level One game points:" + " " + getLevelOne());
        System.out.println("Level Two game points:" + " " + getLevelTwo());
    }
}
