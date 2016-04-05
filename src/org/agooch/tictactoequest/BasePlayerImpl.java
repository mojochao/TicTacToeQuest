package org.agooch.tictactoequest;

public abstract class BasePlayerImpl implements Player {
    private final String name;
    private final char marker;

    public BasePlayerImpl(String name, char marker) {
        this.name = name;
        this.marker = marker;
    }

    public String getName() {
        return name;
    }

    public char getMarker() {
        return marker;
    }

    public void takeTurn(Game game) {
        System.out.println(name + " taking turn");
        int[] turn;
        do {
            turn = nextTurn(game);
        } while (!game.isValidTurn(this, turn));
        game.playTurn(this, turn);
    }

}
