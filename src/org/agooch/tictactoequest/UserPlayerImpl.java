package org.agooch.tictactoequest;

import java.util.Scanner;

public class UserPlayerImpl extends BasePlayerImpl {

    private static final Scanner input = new Scanner(System.in);

    public UserPlayerImpl(String name, char marker) {
        super(name, marker);
    }

    @Override
    public int[] nextTurn(Game game) {
        System.out.println("Enter x: ");
        int x = input.nextInt();

        System.out.println("Enter y: ");
        int y = input.nextInt();

        return new int[]{x, y};
    }

    @Override
    public Hero chooseHero(Hero[] heroes) {
        Hero selected = null;
        do {
            System.out.println("Enter hero: ");
            for (Hero hero : heroes) {
                System.out.println(hero.getPrompt());
            }
            char selector = input.nextLine().charAt(0);

            for (Hero hero : heroes) {
                if (hero.getSelector() == selector) selected = hero;
            }
        } while (selected == null);
        return selected;
    }

}
