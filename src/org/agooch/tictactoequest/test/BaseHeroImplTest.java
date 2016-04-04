package org.agooch.tictactoequest.test;

import org.agooch.tictactoequest.Hero;
import org.agooch.tictactoequest.PaperHeroImpl;
import org.agooch.tictactoequest.RockHeroImpl;
import org.agooch.tictactoequest.ScissorsHeroImpl;

public abstract class BaseHeroImplTest {
    protected final Hero rock;
    protected final Hero paper;
    protected final Hero scissors;

    public BaseHeroImplTest() {
        this.rock = new RockHeroImpl();
        this.paper = new PaperHeroImpl();
        this.scissors = new ScissorsHeroImpl();
    }
}
