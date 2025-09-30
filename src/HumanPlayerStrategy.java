
import java.util.Scanner;


public class HumanPlayerStrategy implements PlayerStrategy {

    public Position makeMove(Board board) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y= scanner.nextInt();
        Position position = new Position(x,y);

        boolean isValid = board.isValidMove(position);
        if(!isValid){
            System.out.println("row " + x + " column " + y + " is invalid.");
        }
        return position;
    }
}
