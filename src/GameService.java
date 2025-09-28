
import java.util.*;

public class GameService {

    private Board board;
    private List<Player> players;
    private Map<String, Integer> positions;

    public GameService(Board board, List<Player> players) {
        this.board = board;
        this.players = players;
        this.positions = new HashMap<String, Integer>();
        for(Player player : players){
            String id = player.getId();
            this.positions.put(id,0);
        }
    }

    public List<Player> getPlayers() {
        return players;
    }

    public Board getBoard() {
        return board;
    }

    public Map<String, Integer> getPlayerPositions() {
        return positions;
    }

    public int getPositionOfPlayer(Player player) {
        String id = player.getId();
        return positions.get(id);
    }

    public void setPositionOfPlayer(Player player, int position) {
        String id = player.getId();
        positions.put(id, position);
    }

    public int getNewPosition(int oldPosition, int score) {
        if (oldPosition + score > board.getSize()) {
            return oldPosition;
        }

        int newPosition = oldPosition + score;
        boolean noSnakeAndLadder = true;
        do {
            for (Snake snake : board.getSnakes()) {
                if (newPosition == snake.getStart()) {
                    newPosition = snake.getEnd();
                    noSnakeAndLadder = false;
                    break;
                }
            }

            for (Ladder ladder : board.getLadders()) {
                if (newPosition == ladder.getEnd()) {
                    newPosition = ladder.getEnd();
                    noSnakeAndLadder = false;
                }
            }
        } while (noSnakeAndLadder);

        return newPosition;
    }

    public void playGame() {
        boolean won = false;
        while (!won) {
            for (Player player : players) {
                int score = DiceService.rollDice();
                int oldPosition = this.getPositionOfPlayer(player);
                int newPosition = getNewPosition(oldPosition, score);
                setPositionOfPlayer(player, newPosition);
                System.out.println("Player " + player.getName()
                        + " score " + score + " position " + newPosition);

                if (newPosition == board.getSize()) {
                    System.err.println("Player " + player.getName() + " won.");
                    won = true;
                    break;
                }
            }
        }
    }

}
