package org.agooch.tictactoequest.test;

import org.agooch.tictactoequest.test.BaseHeroImplTest;
import org.testng.annotations.*;
import static org.testng.Assert.*;

public class PaperHeroImplTest extends BaseHeroImplTest {
    @Test
    public void testDefeats() throws Exception {
        assertTrue(paper.defeats(rock));
        assertFalse(paper.defeats(scissors));

    }

    @Test
    public void testDefeatedBy() throws Exception {
        assertTrue(paper.defeatedBy(scissors));
        assertFalse(paper.defeatedBy(rock));
    }

}
