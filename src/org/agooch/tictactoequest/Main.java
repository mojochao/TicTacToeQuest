package org.agooch.tictactoequest;

public final class Main {

    public static void main(String[] args) {
        Player player1, player2;

        if (args.length == 0) {
            player1 = new CpuPlayerImpl("CPU1", 'x');
            player2 = new CpuPlayerImpl("CPU2", 'o');
        } else if (args.length == 1) {
            player1 = new UserPlayerImpl(args[0], 'x');
            player2 = new CpuPlayerImpl("CPU", 'o');
        } else {
            player1 = new UserPlayerImpl(args[0], 'x');
            player2 = new UserPlayerImpl(args[1], '0');
        }
        Game game = new Game(player1, player2);
        game.play();
    }
}
