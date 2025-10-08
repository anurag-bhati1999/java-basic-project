
public class Game {

    private Snake snake;
    private Board board;
    private int food[][];
    private PlayerStrategy playerStrategy;
    private int foodIndex;
    private int currScore;

    public Game(int width, int height, int food[][], PlayerStrategy playerStrategy) {
        this.snake = new Snake();
        this.board = Board.getInstance(width, height);
        this.food = food;
        this.playerStrategy = playerStrategy;
        this.foodIndex = 0;
        this.currScore = 0;
    }

    public void play() {
        boolean isGameRunning = true;

        int height = board.getHeight();
        int width = board.getWidth();

        while (isGameRunning) {
            Position head = snake.body.peekFirst();
            Position tail = snake.body.peekLast();
            Position next = playerStrategy.getNextPosition(head);

            int row = next.row;
            int col = next.col;

            if (row < 0 || col < 0 || row > height || col > width) {
                System.out.println("You crossed boundary");
                isGameRunning = false;
                continue;
            }

            if (snake.positions.containsKey(next)
                    && !(next.col == tail.col
                    && next.row == tail.row)) {
                isGameRunning = false;
                System.out.println("You ate yourself");
                continue;
            }

            int nextRow = next.row;
            int nextCol = next.col;

            boolean ateFood = foodIndex < food.length
                    && food[foodIndex][0] == nextRow
                    && food[foodIndex][1] == nextCol;

            if (ateFood) {
                foodIndex++;
            } else {
                // remove taile
                this.snake.body.removeLast();
                this.snake.positions.remove(tail);
            }

            this.snake.body.addFirst(next);
            this.snake.positions.put(next, true);

            this.currScore = this.snake.body.size() - 1;
            printPosistions();

        }
    }

    private void printPosistions() {
        System.out.println("Score is " + this.currScore);
        System.out.println("Positions " + snake.body);
        System.out.println("......XXXX.....");

    }

}
