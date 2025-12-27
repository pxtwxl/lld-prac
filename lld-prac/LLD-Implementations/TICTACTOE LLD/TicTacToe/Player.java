package org.example.TicTacToe;

public class Player {
    Symbol symbol;
    PlayerStrategy playerStrategy;

    public Player(Symbol symbol , PlayerStrategy strategy) {
        this.symbol = symbol;
        this.playerStrategy = strategy;
    }

    public Position makeMove(Board board) {
        return playerStrategy.makeMove(board);
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public PlayerStrategy getPlayerStrategy() {
        return playerStrategy;
    }
}
