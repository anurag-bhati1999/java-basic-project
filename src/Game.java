public class Game{
    private Snake snake;
    private Board board;
    private int food[][];

    public Game(int width, int height, int food[][]){
        this.snake = new Snake();
        this.board = Board.getInstance(width, height);
        this.food = food;
    }
}