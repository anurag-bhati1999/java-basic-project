import  java.util.*;
public class Main {

    public static void main(String args[]) {
     
        //prepare Board
        Scanner scanner =  new Scanner(System.in);
        int i;

        //snakes
        int numSnakes = scanner.nextInt();
        List<Snake>snakes = new ArrayList<Snake>();
        for(i=0;i<numSnakes;i++){
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            Snake snake = new Snake(start, end);
            snakes.add(snake);
        }

        //ladders
        int numLadders = scanner.nextInt();
        List<Ladder>ladders = new ArrayList<Ladder>();
        for(i=0;i<numLadders;i++){
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            Ladder ladder = new Ladder(start ,end);
            ladders.add(ladder);
        }

        //players
        int numPlayers = scanner.nextInt();
        List<Player>players = new ArrayList<Player>();
        for(i=0;i<numPlayers;i++){
            String name = scanner.nextLine();
            Player player = new Player(name);
            players.add(player);
        }
        
        // board
        Board board = new Board(snakes, ladders);

        //service
        GameService service = new GameService(board, players);
        service.playGame();

    }
}
