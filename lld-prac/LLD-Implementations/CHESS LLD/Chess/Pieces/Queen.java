package org.example.Pieces;

import org.example.Model.Board;
import org.example.Model.Cell;
import org.example.Model.MovementStrategy;
import org.example.Model.Piece;

public class Queen extends Piece {
    private MovementStrategy strategy;

    public Queen(boolean isWhite) {
        super(isWhite,new QueenMovementStrategy());
    }

    @Override
    public boolean canMove(Board board, Cell startCell, Cell endCell) {
        return strategy.canMove(board, startCell, endCell);
    }
}
