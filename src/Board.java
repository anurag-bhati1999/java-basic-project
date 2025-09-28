
import java.util.*;

public class Board{
    private List<Snake>snakes;
    private  List<Ladder>ladders;
    private final int size = 100;

    public Board(List<Snake>snakes , List<Ladder>ladders){
        this.snakes = snakes;
        this.ladders = ladders;
    }

    public List<Snake>getSnakes(){
        return snakes;
    }

    public List<Ladder>getLadders(){
        return ladders;
    }

    public int getSize(){
        return size;
    }

    // public void setSnakes(ArrayList<Snake>snakes){
    //     this.snakes = snakes;
    // }

    // public void setLadders(ArrayList<Ladder>ladders){
    //     this.ladders = ladders;
    // }
    
}