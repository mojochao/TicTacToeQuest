package org.agooch.tictactoequest.test;

import org.agooch.tictactoequest.test.BaseHeroImplTest;
import org.testng.annotations.*;
import static org.testng.Assert.*;

public class ScissorsHeroImplTest extends BaseHeroImplTest {

    @Test
    public void testDefeats() throws Exception {
        assertTrue(scissors.defeats(paper));
        assertFalse(scissors.defeats(rock));
    }

    @Test
    public void testDefeatedBy() throws Exception {
        assertTrue(scissors.defeatedBy(rock));
        assertFalse(scissors.defeatedBy(paper));
    }

}
