package org.agooch.tictactoequest;

public class PaperHeroImpl extends BaseHeroImpl {

    public PaperHeroImpl() {
        super("paper", 'p');
    }

    @Override
    public boolean defeats(Hero opponent) {
        return opponent instanceof RockHeroImpl;
    }

    @Override
    public boolean defeatedBy(Hero opponent) {
        return opponent instanceof ScissorsHeroImpl;
    }

}
