package org.agooch.tictactoequest.test;

import org.agooch.tictactoequest.test.BaseHeroImplTest;
import org.testng.annotations.*;
import static org.testng.Assert.*;

public class RockHeroImplTest extends BaseHeroImplTest {

    @Test
    public void testDefeats() throws Exception {
        assertTrue(rock.defeats(scissors));
        assertFalse(paper.defeats(paper));
    }

    @Test
    public void testDefeatedBy() throws Exception {
        assertTrue(rock.defeatedBy(paper));
        assertFalse(rock.defeatedBy(scissors));
    }

}
