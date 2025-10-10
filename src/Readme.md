Position(x,y) -> equals(), hashCode()
Snake() -> Deque<Position>, HashMap<Position, boolean>
Board -> length, breadth, instance(singleton)
PlayerStrategy -> getNextPosition()
HumanPlayerStrategy -> getNextPosition(CurrPosition)
Game -> Board, snake, int food[][],currFoodIndex,curScore,PlayerStrategy, play()

play() ->
    