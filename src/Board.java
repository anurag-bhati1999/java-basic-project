
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

}
