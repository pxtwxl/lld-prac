package org.example.Model;

public class Move {
    Cell startCell , endCell;

    public Move(Cell s , Cell e) {
        this.startCell = s;
        this.endCell = e;
    }

    public boolean isValidMove() {
        return !(startCell.getPiece().isWhitePiece() ==  endCell.getPiece().isWhitePiece());
    }

    public Cell getStartCell() {
        return startCell;
    }

    public Cell getEndCell() {
        return endCell;
    }
}
