package org.agooch.tictactoequest;

import java.util.List;

public interface Player {
    Hero chooseHero(Hero[] heroes);
    String getName();
    char getMarker();
    void takeTurn(Game game);
    int[] nextTurn(Game game);

}

