package org.example;

import org.example.Model.*;
import org.example.Pieces.King;

import java.util.ArrayList;
import java.util.Scanner;

interface BoardGames {

}

public class Game implements BoardGames{
    private Board board;
    private Player player1;
    private Player player2;
    boolean isWhiteTurn;
    private Status status;
    private ArrayList<Move> gameLog;

    public Game(Player player1,Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = Board.getInstance(8);
        this.isWhiteTurn = true;
        this.status = Status.ACTIVE;
        this.gameLog = new ArrayList<>();
    }

    public void start() {
        while (this.status == Status.ACTIVE) {

            if(isWhiteTurn) {
                makeMove(new Move(startCell,endCell),player1);
            } else {
                makeMove(new Move(startCell,endCell),player2);
            }
        }
    }

    public void makeMove(Move move,Player player) {
        if(move.isValidMove()) {
            Piece sourcePiece = move.getStartCell().getPiece();

            if(sourcePiece.canMove(this.board,move.getStartCell(),move.getEndCell())) {
                Piece destinationPiece = move.getEndCell().getPiece();

                if(destinationPiece != null) {

                    if(destinationPiece instanceof King && isWhiteTurn) {
                        this.status = Status.WHITE_WIN;
                        return;
                    }

                    if(destinationPiece instanceof King && !isWhiteTurn) {
                        this.status = Status.BLACK_WIN;
                        return;
                    }

                    destinationPiece.setKilled(true);
                }

                gameLog.add(move);
                move.getEndCell().setPiece(sourcePiece);
                move.getStartCell().setPiece(null);

                isWhiteTurn = !isWhiteTurn;
            }
        }
    }
}
