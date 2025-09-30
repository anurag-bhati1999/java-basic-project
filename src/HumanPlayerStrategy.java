
import java.util.Scanner;


public class HumanPlayerStrategy implements PlayerStrategy {

    public Position makeMove(Board board) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y= scanner.nextInt();
        Position position = new Position(x,y);

        return position;
    }
}
