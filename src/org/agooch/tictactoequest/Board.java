package org.agooch.tictactoequest;

public class Board {

    private final Player[][] cells;

    public Board() {
        this(new Player[3][3]);
    }

    public Board(Player[][] cells) {
        this.cells = cells;
    }

    public Player[][] getCells() {
        return cells;
    }

    public Player[][] getHorizontalLines() {
        return cells;
    }

    public Player[][] getVerticalLines() {
        return rotated(cells);
    }

    public Player[][] getDiagonalLines() {
        return new Player[][] {
                { cells[0][0], cells[1][1], cells[2][2] },
                { cells[0][2], cells[1][1], cells[2][0] }
        };
    }

    public void display() {
        for (Player[] line : cells) {
            String output = String.format("%c %c %c",
                    getMarker(line[0]),
                    getMarker(line[1]),
                    getMarker(line[2]));
            System.out.println(output);
        }
        System.out.println();
    }

    public boolean isFull() {
        for (Player[] line : cells) {
            for (Player cell : line) {
                if (cell == null) return false;
            }
        }
        return true;
    }

    public boolean isCellAvailable(int[] cell) {
        int x = cell[0];
        int y = cell[1];
        return cells[x][y] == null;
    }

    public void takeCell(Player player, int[] cell) {
        int x = cell[0];
        int y = cell[1];
        cells[x][y] = player;
    }

    public Player getCell(int[] cell) {
        return cells[cell[0]][cell[1]];
    }

    private Player[][] rotated(Player[][] arr) {
        int width = arr[0].length;
        int depth = arr.length;
        Player[][] rotated = new Player[width][depth];
        for (int i = 0; i < depth; ++i) {
            for (int j = 0; j < width; ++j) {
                rotated[j][depth - i - 1] = arr[i][j];
            }
        }
        return rotated;
    }

    private char getMarker(Player player) {
        return player == null ? '_' : player.getMarker();
    }

}
