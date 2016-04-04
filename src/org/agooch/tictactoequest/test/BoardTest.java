package org.agooch.tictactoequest.test;

import org.agooch.tictactoequest.Board;
import org.agooch.tictactoequest.CpuPlayerImpl;
import org.agooch.tictactoequest.Player;
import org.testng.annotations.*;
import static org.testng.Assert.*;

public class BoardTest {
    @Test
    public void testGetHorizontalLines() throws Exception {
        Player p1 = new CpuPlayerImpl("CPU1", 'x');
        Player p2 = new CpuPlayerImpl("CPU2", 'o');
        Player[][] cells = new Player[][] {
                {p1, null, null},
                {null, p2, null},
                {null, null, p1}
        };
        Board b = new Board(cells);
        assertEquals(cells, b.getHorizontalLines());
    }

    @Test
    public void testGetVerticalLines() throws Exception {
        Player p1 = new CpuPlayerImpl("CPU1", 'x');
        Player p2 = new CpuPlayerImpl("CPU2", 'o');
        Player[][] cells = new Player[][] {
                {p1, p2, null},
                {null, null, null},
                {null, null, null}
        };
        Player[][] rotated = new Player[][] {
                {null, null, p1},
                {null, null, p2},
                {null, null, null}
        };
        Board b = new Board(cells);
        Player[][] verticals = b.getVerticalLines();
        assertEquals(rotated, verticals);
    }

    @Test
    public void testGetDiagonalLines() throws Exception {
        Player p1 = new CpuPlayerImpl("CPU1", 'x');
        Player p2 = new CpuPlayerImpl("CPU2", 'o');
        Player[][] cells = new Player[][] {
                {p1, p2, null},
                {null, null, null},
                {null, null, null}
        };
        Board b = new Board(cells);
        Player[][] diagonals = new Player[][] {
                {p1, null, null},
                {null, null, null}
        };
        assertEquals(b.getDiagonalLines(), diagonals);
    }

    @Test
    public void testIsFull() throws Exception {
        Player p1 = new CpuPlayerImpl("CPU1", 'x');
        Player p2 = new CpuPlayerImpl("CPU2", 'o');

        Board b = new Board();
        assertFalse(b.isFull());

        Player[][] cells = new Player[][] {
                {p1, p2, p1},
                {p2, p1, p2},
                {p2, p2, p1}
        };
        b = new Board(cells);
        assertTrue(b.isFull());
    }

    @Test
    public void testIsCellAvailable() throws Exception {
        Player p1 = new CpuPlayerImpl("CPU1", 'x');
        Player p2 = new CpuPlayerImpl("CPU2", 'o');

        Board b = new Board();
        assertTrue(b.isCellAvailable(new int[] {1, 2}));

        Player[][] cells = new Player[][] {
                {p1, p2, p1},
                {p2, p1, p2},
                {p2, p2, p1}
        };
        b = new Board(cells);
        assertFalse(b.isCellAvailable(new int[] {1, 2}));
    }

    @Test
    public void testTakeCell() throws Exception {
        Player p1 = new CpuPlayerImpl("CPU1", 'x');
        Player p2 = new CpuPlayerImpl("CPU2", 'o');

        Board b = new Board();
        b.takeCell(p1, new int[] {1, 2});
        assertFalse(b.isCellAvailable(new int[] {1, 2}));
        assertEquals(p1, b.getCell(new int[] {1, 2}));
    }

}
