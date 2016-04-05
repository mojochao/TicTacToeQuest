package org.agooch.tictactoequest;

public final class Game {
    private final Hero[] heroes = new Hero[] {
            new RockHeroImpl(),
            new PaperHeroImpl(),
            new ScissorsHeroImpl()
    };
    private final Board board = new Board();
    private final Player firstPlayer;
    private final Player secondPlayer;
    private Player currentPlayer = null;
    private Player winningPlayer = null;

    public Game(Player player1, Player player2) {
        this.firstPlayer = player1;
        this.secondPlayer = player2;
    }

    public void play() {
        System.out.println("game begins");
        while (!isGameOver()) {
            nextPlayer();
            currentPlayer.takeTurn(this);
            board.display();
        }
        if (winningPlayer != null) {
            System.out.println(String.format("%s wins the game", winningPlayer.getName()));
        } else {
            System.out.println("game ends in a draw");
        }
    }

    private void nextPlayer() {
        if (currentPlayer == null) {
            currentPlayer = firstPlayer;
        }
        else {
            currentPlayer = currentPlayer == firstPlayer ? secondPlayer : firstPlayer;
        }
    }

    private boolean isGameOver() {
        winningPlayer = checkWinner();
        return winningPlayer != null || board.isFull();
    }

    private Player checkWinner() {
        Player winner = checkLines(board.getHorizontalLines());
        if (winner != null) return winner;

        winner = checkLines(board.getVerticalLines());
        if (winner != null) return winner;

        return checkLines(board.getDiagonalLines());
    }

    private Player checkLines(Player[][] lines) {
        for (Player[] line : lines) {
            if (containsAll(line, firstPlayer)) return firstPlayer;
            if (containsAll(line, secondPlayer)) return secondPlayer;
        }
        return null;
    }

    private boolean containsAll(Player[] line, Player player) {
        for (Player cell : line) {
            if (cell != player) return false;
        }
        return true;
    }

    public boolean isValidTurn(Player player, int[] turn) {
        return board.isCellAvailable(turn);
    }

    public void playTurn(Player attacker, int[] turn) {
        System.out.println(String.format("%s invading cell [%d, %d]", attacker.getName(), turn[0], turn[1]));

        Player defender = attacker == firstPlayer ? secondPlayer : firstPlayer;

        Hero attackerHero = attacker.chooseHero(heroes);
        Hero defenderHero = defender.chooseHero(heroes);

        System.out.println(String.format("%s attacks with %s", attacker.getName(), attackerHero.getName()));
        System.out.println(String.format("%s defends with %s", defender.getName(), defenderHero.getName()));

        if (attackerHero.defeats(defenderHero)) {
            System.out.println(String.format("%s wins the cell", attacker.getName()));
            board.takeCell(currentPlayer, turn);
        } else {
            System.out.println(String.format("%s loses the cell", attacker.getName()));
        }
    }
}
