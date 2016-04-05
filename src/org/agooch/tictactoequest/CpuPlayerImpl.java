package org.agooch.tictactoequest;

import java.util.Random;

public final class CpuPlayerImpl extends BasePlayerImpl {
    private static final Random random = new Random();

    public CpuPlayerImpl(String name, char marker) {
        super(name, marker);
    }

    @Override
    public int[] nextTurn(Game game) {
        int size = game.getBoard().getSize();
        return new int[] {
                random.nextInt(size),
                random.nextInt(size)
        };
    }

    @Override
    public Hero chooseHero(Hero[] heroes) {
        int i = new Random().nextInt(heroes.length);
        return heroes[i];
    }

}
