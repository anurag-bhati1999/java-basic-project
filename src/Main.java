
public class Main {

    public static void main(String args[]) {
        int food[][] = {
            {5, 5}, // Initial food
            {10, 8}, // Second food
            {3, 12}, // Third food
            {8, 17}, // Fourth food
            {12, 3} // Fifth food
        };

        Game game = new Game(15, 20, food, new HumanPlayerStrategy());
        game.play();
    }
}
