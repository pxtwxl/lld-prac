package org.example.TicTacToe;

enum Symbol {
X,O,EMPTY
}

public class Board {
    private final int rows;
    private final int cols;
    private Symbol[][] grid;

    Board(int r,int c) {
        this.rows = r;
        this.cols = c;
        grid = new Symbol[r][c];

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                grid[i][j] = Symbol.EMPTY;
            }
        }
    }

    boolean isValidMove(Position pos) {
        return pos.rows >= 0 && pos.rows < rows && pos.cols >= 0 && pos.cols < cols
                && grid[pos.rows][pos.cols] == Symbol.EMPTY;
    }

    void makeMove(Position pos,Symbol symbol) {
        grid[pos.rows][pos.cols] = symbol;
    }

    void checkGameState(GameContext context) {
        for (int i = 0; i < rows; i++) {
            if(grid[i][0] != Symbol.EMPTY && isWinningLine(grid[i])) {
                context.next(TicTacToe.getCurrentPlayer(),true);
                return;
            }
        }

        for (int i = 0; i < cols; i++) {
            Symbol[] column = new Symbol[rows];
            for (int j = 0; j < rows; j++) {
                column[j] = grid[j][i];
            }

            if(column[0] != Symbol.EMPTY && isWinningLine(column)) {
                context.next(TicTacToe.getCurrentPlayer(),true);
                return;
            }
        }

        Symbol[] diagnol1 = new Symbol[Math.min(rows,cols)];
        Symbol[] diagnol2 = new Symbol[Math.min(rows,cols)];

        for (int i = 0; i < Math.min(rows,cols); i++) {
            diagnol1[i] = grid[i][i];
            diagnol2[i] = grid[i][cols - i - 1];
        }

        if(diagnol1[0] != Symbol.EMPTY && isWinningLine(diagnol1)) {
            context.next(TicTacToe.getCurrentPlayer(),true);
            return;
        }

        if(diagnol2[0] != Symbol.EMPTY && isWinningLine(diagnol2)) {
            context.next(TicTacToe.getCurrentPlayer(),true);
            return;
        }
    }

    boolean isWinningLine(Symbol[] line) {
        Symbol frst = line[0];
        for (Symbol s : line) {
            if(s != frst) {
                return false;
            }
        }
        return true;
    }

    public void printBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                Symbol symbol = grid[i][j];
                switch (symbol) {
                    case X:
                        System.out.print(" X ");
                        break;
                    case O:
                        System.out.print(" O ");
                        break;
                    case EMPTY:
                    default:
                        System.out.print(" . ");
                }
                if (j < cols - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < rows - 1) {
                System.out.println("---+---+---");
            }
        }
        System.out.println();
    }
}
