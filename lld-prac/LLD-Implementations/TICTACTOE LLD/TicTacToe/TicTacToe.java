package org.example.TicTacToe;

interface BoardGame {
    void play();
}

public class TicTacToe implements BoardGame {

    private Board board;
    private Player playerO;
    private Player playerX;
    private static Player currentPlayer;
    private GameContext context;

    public TicTacToe(PlayerStrategy xStrategy,PlayerStrategy oStrategy,int rows,int cols) {
        board = new Board(rows,cols);
        playerX = new Player(Symbol.X,xStrategy);
        playerO = new Player(Symbol.O,oStrategy);
        currentPlayer = playerX;
        context = new GameContext();
    }

    @Override
    public void play() {
        do {
            board.printBoard();

            Position move = currentPlayer.makeMove(board);
            board.makeMove(move,currentPlayer.getSymbol());

            board.checkGameState(context);
            switchPlayer();
        } while (!context.isGameOver());

        announceResult();
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == playerX) ? playerO : playerX;
    }

    public static Player getCurrentPlayer() {
        return currentPlayer;
    }

    private void announceResult() {
        GameState state = context.getCurrentState();

        if(state instanceof OWonState) {
            System.out.println("Player O Wins !!");
        } else if(state instanceof XWonState) {
            System.out.println("Player X Wins !!");
        } else {
            System.out.println("Its a Draw !!");
        }
    }
}
