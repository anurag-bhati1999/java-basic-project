import java.util.*;

public class Snake {
    Deque<Position>body;
    Map<Position, Boolean>positions;

    public Snake(){
        Position init = new Position(0,0);
        body = new ArrayDeque<>();
        body.addFirst(init);

        positions = new HashMap<>();
        positions.put(init, true);
    }

    public Deque<Position> getBody(){
        return body;
    }

    public Map<Position, Boolean>getPositions(){
        return positions;
    }
}