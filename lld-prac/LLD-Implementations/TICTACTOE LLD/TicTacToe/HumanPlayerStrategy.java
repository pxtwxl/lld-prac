package org.example.TicTacToe;

import java.util.Scanner;

public class HumanPlayerStrategy implements PlayerStrategy {
    private Scanner scanner;
    private String playerName;

    public HumanPlayerStrategy(String name) {
        this.playerName = name;
        this.scanner = new Scanner(System.in);
    }

    @Override
    public Position makeMove(Board board) {
        while (true) {
            System.out.printf("enter ur move row[0-2] , col[0-2] : ",playerName);

            try {
                int r = scanner.nextInt();
                int c = scanner.nextInt();
                Position move = new Position(r,c);

                if(board.isValidMove(move)) {
                    return move;
                }

                System.out.println("invalid move , try again.");
            } catch (Exception e) {
                System.out.println("Invalid input , enter row n col as num");
                scanner.nextLine();
            }
        }
    }
}
