public class Board{
    private int width;
    private int height;
    private static Board instance;

    private Board(int width, int height){
        this.width = width;
        this.height = height;
    }

    public static Board getInstance(int  width, int height){
        if(instance == null){
            return new Board(width, height);
        }

        return instance;
    }
}