package org.example.Model;

public class Cell {
    int row;
    int col;
    Piece piece;
    String label;

    public Cell(int r,int c,Piece p) {
        this.row = r;
        this.col = c;
        this.piece = p;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece p) {
        this.piece = p;
    }
}
