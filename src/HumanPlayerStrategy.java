
import java.util.Scanner;

public class HumanPlayerStrategy implements PlayerStrategy {

    public Position makeMove(Board board) {
        int i;
        Scanner scanner = new Scanner(System.in);
        for (i = 0; i < 3; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Position position = new Position(x, y);

            boolean isValid = board.isValidMove(position);
            if (!isValid) {
                System.out.println("row " + x + " column " + y + " is invalid. Please enter again");
            } else {
                board.changeGameStatus();
                return position;
            }
        }

        board.markGameAsCompleted();
        return null;
    }
}
