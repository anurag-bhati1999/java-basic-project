
import java.util.*;

public class GameService{
    private Board board;
    private List<Player>players;
    private Map<String,Integer>positions;

    public GameService(Board board, List<Player>players){
        this.board = board;
        this.players = players;
    }

    public List<Player> getPlayers(){
        return  players;
    }

    public Board getBoard(){
        return board;
    }

    public Map<String, Integer> getPlayerPositions(){
        return positions;
    }

    public int getPositionOfPlayer(Player player){
        String id  = player.getId();
        return positions.get(id);
    }

    public int getNewPosition(int oldPosition, int score ){

    }

    public void playGame(){
        for(Player player : players){
            int score = DiceService.rollDice();
            int oldPosition = this.getPositionOfPlayer(player);
            int newPosition = getNewPosition(oldPosition, score);
        }
    }



}