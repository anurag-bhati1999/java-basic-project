
import java.util.*;

public class Game {

    private Board board;
    private List<Player> players;

    public Game(List<Player> players) {
        this.board = new Board();
        this.players = players;
    }

    public void play() {
        boolean completed = false;
        while (!completed) {
            for (Player player : players) {
                Position position = player.getStrategy().makeMove(board);
                board.markPosition(position, player.getSymbol());
                board.changeGameStatus();
                System.out.println(player.getName() + " with symbol " + player.getSymbol() + " turn.");
                board.printBoard();
                System.out.println("");
                if (board.isGameCompleted()) {
                    completed = true;
                    makeAnnouncement(board.getWinningSymbol());
                    break;
                }
            }
        }
    }

    private void makeAnnouncement(Symbol winningSymbol) {
        if (winningSymbol == null) {
            System.out.println("Match is draw or interrupted");
        }
        for (Player player : players) {
            if (player.getSymbol() == winningSymbol) {
                System.out.println("Player " + player.getName() + " has won");
                return;
            }
        }
        System.out.println("match is draw");
    }

}
