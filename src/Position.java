
import java.util.*;

public class Position {

    int row;
    int col;

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    @Override
    public String toString() {
        return "( " + row + " " + col + " )";
    }

    public boolean equals(Object o){
        if(o == this) return true;
        if(o == null || o.getClass() !=this.getClass()) return false;
        Position pos = (Position) o;
        return row == pos.row && col == pos.col;

    }

    public int hashCode() {
        return Objects.hash(row, col);
    }

}
