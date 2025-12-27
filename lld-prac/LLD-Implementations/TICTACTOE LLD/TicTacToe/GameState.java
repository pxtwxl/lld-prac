package org.example.TicTacToe;

public interface GameState {
    void next(GameContext context,Player player,boolean hasWon);
    boolean isGameOver();
}

class XTurnState implements GameState {

    @Override
    public void next(GameContext context,Player player,boolean hasWon) {
        if(hasWon) {
            context.setState(player.getSymbol() == Symbol.X ? new XWonState() : new OWonState());
        } else {
            context.setState(new OTurnState());
        }

    }

    @Override
    public boolean isGameOver() {
        return false;
    }
}

class OTurnState implements GameState {

    @Override
    public void next(GameContext context,Player player,boolean hasWon) {
        if(hasWon) {
            context.setState(player.getSymbol() == Symbol.X ? new XWonState() : new OWonState());
        } else {
            context.setState(new XTurnState());
        }

    }

    @Override
    public boolean isGameOver() {
        return false;
    }
}

class XWonState implements GameState {

    @Override
    public void next(GameContext context,Player player,boolean hasWon) {
//        game won , no next state
    }

    @Override
    public boolean isGameOver() {
        return true;
    }
}

class OWonState implements GameState {

    @Override
    public void next(GameContext context,Player player,boolean hasWon) {
//        game won , no next state
    }

    @Override
    public boolean isGameOver() {
        return true;
    }
}

