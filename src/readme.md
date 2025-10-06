Snake(start, end) - start, end
Ladder(start, end) - start, end
Board(size, List<snakes>, List<ladder>) -
Player(name, uuid)
GameService(Board ,List<players>, Map<playerUUID, position>) - findNextPosition(), getCurentPosition(), setPositionOfPlayer, play(),
DiceService() - roll()
Main - Create => Snake, ladder, board, players

play - for(players)
        1. roll
        2. get and set position
        3. if win - print
