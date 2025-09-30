
public class Board {

    final int size = 3;
    Symbol positions[][];
    boolean isGameCompleted;
    Symbol winningSymbol;

    public Board() {
        int i, j;
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                positions[i][j] = Symbol.E;
            }
        }
        this.isGameCompleted = false;
    }

    public boolean isValidMove(Position position) {
        int x = position.x;
        int y = position.y;

        if (x >= 0 && y >= 0
                && x < this.size && y < this.size
                && this.positions[x][y] == Symbol.E) {

            return true;
        }

        return false;
    }

    public Symbol findWinningSymbol() {
        int i, j;
        // Symbol positions[][] = this.positions;

        //all rows
        for (i = 0; i < this.size; i++) {
            if (isWinningLine(positions[i])) {
                return positions[i][0];
            }
        }

        // all columns
        for (i = 0; i < size; i++) {
            Symbol column[] = new Symbol[size];
            for (j = 0; j < size; j++) {
                column[j] = positions[j][i];
            }
            if (isWinningLine(column)) {
                return positions[0][i];
            }
        }

        //1st diagonal
        Symbol dig1[] = new Symbol[size];
        i = 0;
        j = 0;
        while (i < size && j < size) {
            dig1[i] = positions[i++][j++];
        }
        if (isWinningLine(dig1)) {
            return positions[0][0];
        }

        //2nd 
        Symbol dig2[] = new Symbol[size];
        i = 0;
        j = size - 1;
        while (i < size && j >= 0) {
            dig2[i] = positions[i++][j--];
        }
        if (isWinningLine(dig2)) {
            return positions[0][size - 1];
        }

        return null;
    }

    private boolean isWinningLine(Symbol line[]) {
        Symbol first = line[0];
        for (Symbol x : line) {
            if (x != first) {
                return false;
            }
        }

        return true;
    }

    public void printBoard() {
        System.out.println("......BOARD_START.......");
        int i, j;
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                System.err.print(positions[i][j] + "  ");
            }
            System.out.println("");
        }
        System.out.println("......BOARD_END.......");
    }

    public void changeGameStatus() {
        Symbol winSymbol = this.findWinningSymbol();
        if (winSymbol != null) {
            this.isGameCompleted = true;
            this.winningSymbol = winSymbol;
        } else {
            if (this.isBoardFull()) {
                this.isGameCompleted = true;
            }
        }
    }

    private boolean isBoardFull() {
        int i, j;
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                if (positions[i][j] == Symbol.E) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean isGameCompleted() {
        return this.isGameCompleted;
    }

    public Symbol getWinningSymbol() {
        return this.winningSymbol;
    }

}
