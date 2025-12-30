package org.example;

import org.example.Model.Player;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Player 1",true);
        Player p2 = new Player("Player 2",false);

        Game game = new Game(p1,p2);
        game.start();
    }
}