package org.agooch.tictactoequest;

public interface Hero {
    boolean defeats(Hero opponent);
    boolean defeatedBy(Hero opponent);

    String getName();
    String getPrompt();
    char getSelector();

}
