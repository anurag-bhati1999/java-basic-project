
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]) {
        Player player1 = new Player.PlayerBuilder()
                .withName("Anurag")
                .withStrategy(new HumanPlayerStrategy())
                .withSymbol(Symbol.X)
                .build();

        Player player2 = new Player.PlayerBuilder()
                .withName("Yash")
                .withStrategy(new HumanPlayerStrategy())
                .withSymbol(Symbol.O)
                .build();

        List<Player> players = new ArrayList<>(List.of(player1, player2));
        Game game = new Game(players);
        game.play();
    }
}
