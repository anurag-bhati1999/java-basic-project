
import java.util.ArrayList;

public class Board{
    private ArrayList<Snake>snakes;
    private  ArrayList<Ladder>ladders;

    public ArrayList<Snake>getSnakes(){
        return snakes;
    }

    public ArrayList<Ladder>getLadders(){
        return ladders;
    }

    public void setSnakes(ArrayList<Snake>snakes){
        this.snakes = snakes;
    }

    public void setLadders(ArrayList<Ladder>ladders){
        this.ladders = ladders;
    }
    
}