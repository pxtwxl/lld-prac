package org.example.TicTacToe;

import java.util.Objects;

public class Position {
    int rows;
    int cols;

    Position(int r,int c) {
        this.rows = r;
        this.cols = c;
    }

    @Override
    public String toString() {
        return "Position{" +
                "rows=" + rows +
                ", cols=" + cols +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return rows == position.rows && cols == position.cols;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rows, cols);
    }
}
