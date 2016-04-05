package org.agooch.tictactoequest;

public class Board {

    private final Player[][] cells;

    public Board(int size) {
        this(new Player[size][size]);
    }

    public Board(Player[][] cells) {
        this.cells = cells;
    }

    public Player[][] getHorizontalLines() {
        return cells;
    }

    public Player[][] getVerticalLines() {
        return rotated(cells);
    }

    public Player[][] getDiagonalLines() {
        int size = cells.length;

        Player[] diag1 = new Player[size];
        for (int i = 0; i < size; ++i) {
            diag1[i] = cells[i][i];
        }

        Player[] diag2 = new Player[size];
        for (int x = 0, y = size - 1; x < size; ++x, --y) {
            diag1[x] = cells[x][y];
        }
        return new Player[][] { diag1, diag2 };
    }

    public void display() {
        for (Player[] line : cells) {
            for (Player player : line) {
                System.out.print(getMarker(player));
                System.out.print(' ');
            }
            System.out.println();
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

    public int getSize() {
        return cells.length;
    }
}
