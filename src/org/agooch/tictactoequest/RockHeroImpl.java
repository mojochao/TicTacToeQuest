package org.agooch.tictactoequest;

public class RockHeroImpl extends BaseHeroImpl {

    public RockHeroImpl() {
        super("rock", 'r');
    }

    @Override
    public boolean defeats(Hero opponent) {
        return opponent instanceof ScissorsHeroImpl;
    }

    @Override
    public boolean defeatedBy(Hero opponent) {
        return opponent instanceof PaperHeroImpl;
    }

}
