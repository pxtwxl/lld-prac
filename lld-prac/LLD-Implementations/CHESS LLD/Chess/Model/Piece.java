package org.example.Model;


public abstract class Piece {
    boolean isWhitePiece;
    boolean isKilled = false;
    private MovementStrategy movementStrategy;

    public Piece(boolean isWhite,MovementStrategy movementStrategy) {
        this.isWhitePiece = isWhite;
        this.movementStrategy = movementStrategy;
    }

    public boolean isWhitePiece() {
        return isWhitePiece;
    }

    public boolean isKilled() {
        return isKilled;
    }

    public void setKilled(boolean killed) {
        isKilled = killed;
    }

    public boolean canMove(Board board,Cell startCell,Cell endCell) {
        return movementStrategy.canMove(board,startCell,endCell);
    }
}
