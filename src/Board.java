
import java.util.ArrayList;

public class Board{
    private ArrayList<Snake>snakes;
    private  ArrayList<Ladder>ladders;
    private final int size = 100;

    public ArrayList<Snake>getSnakes(){
        return snakes;
    }

    public ArrayList<Ladder>getLadders(){
        return ladders;
    }

    public int getSize(){
        return size;
    }

    public void setSnakes(ArrayList<Snake>snakes){
        this.snakes = snakes;
    }

    public void setLadders(ArrayList<Ladder>ladders){
        this.ladders = ladders;
    }
    
}