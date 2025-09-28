import java.util.*;
public class DiceService{

    public static int rollDice(){
        Random rand = new Random();
        int num = rand.nextInt(6)+1;
        return num;
    }
}