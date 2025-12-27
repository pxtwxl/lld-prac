package org.example;

import org.example.TicTacToe.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PlayerStrategy xPlayerStrategy = new HumanPlayerStrategy("Player X");
        PlayerStrategy oPlayerStrategy = new HumanPlayerStrategy("Player O");

        TicTacToe game = new TicTacToe(xPlayerStrategy,oPlayerStrategy,3,3);
        game.play();
    }
}