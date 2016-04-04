package org.agooch.tictactoequest;

public class ScissorsHeroImpl extends BaseHeroImpl {

    public ScissorsHeroImpl() { super("scissors", 's'); }

    @Override
    public boolean defeats(Hero opponent) {
        return opponent instanceof PaperHeroImpl;
    }

    @Override
    public boolean defeatedBy(Hero opponent) {
        return opponent instanceof RockHeroImpl;
    }

}
