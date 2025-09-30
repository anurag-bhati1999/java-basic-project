
public class Board {

    final int size = 3;
    Symbol postions[][];

    public Board() {
        int i, j;
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                postions[i][j] = Symbol.E;
            }
        }
    }

    public boolean isValidMove(Position position) {
        int x = position.x;
        int y = position.y;

        if (x >= 0 && y >= 0
                && x < this.size && y < this.size
                && this.postions[x][y] == Symbol.E) {
            
            return true;
        }

        return false;
    }

}
