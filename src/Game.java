import java.util.*;

public class Game{
    Board board;
    List<Player>players;

    public Game(List<Player>players){
        this.board = new Board();
        this.players = players;
    }

    public void play(){
        for(Player player : players){
            Position position = player.strategy.makeMove(board);
            board.markPosition(position, player.symbol);
            board.changeGameStatus();
            board.printBoard();
            if(board.isGameCompleted){
                makeAnnouncement(board.getWinningSymbol());
            }
        }
    }

    private void makeAnnouncement(Symbol winningSymbol){
        if(winningSymbol == null){
            System.out.println("Match is draw or interrupted");
        }
        for(Player player : players){
            if(player.symbol == winningSymbol){
                System.out.println("Player "+ player.name + " has won");
            }
        }
        System.out.println("match is draw");
    }

}