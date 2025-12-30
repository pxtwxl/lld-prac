package org.example.Model;

public class Player {
    String name;
    boolean isWhiteSide;

    public Player(String playerName,boolean isWhite) {
        this.name = playerName;
    }

    public String getName() {
        return name;
    }

    public boolean isWhiteSide() {
        return isWhiteSide;
    }
}
