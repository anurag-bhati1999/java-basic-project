Player(name ,symbol ,stratgey) builder
public enum symbol(X,O,E)
Board(.........size,isGameCompleted,winningSymbol, Map<poistion, symbol>) - isValidPosition(), setPosition(Playe), printBoard,getPosition,findWinningSymbol, getWinnningSymbol, isBoardFull, changeGameStatus
HumanPlayerStrategy - makeMove(Board)
Game(List<players>, ........board ) -play, announceResult
Main - Create player, board, Game, and then play


changeGameStatus
    findWinningSymbol,
    setWinningSymbol,
    isBoardFull 
    markGameCompleted
play  -
    makeMove
    setPosition
    getWinningSymbol - 
        getPlayerFromSymbol
        announceResult
    isBoardFull
    announceResult



