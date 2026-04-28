package goosegame.cell;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TrapCellTest {
@Test
    public void trapCellIsCorrectAtCreationTest(){
        TrapCell c = new TrapCell(31);
        assertEquals(31, c.getIndex());
        assertEquals(null, c.getPlayer());
    }
    
    @Test
    public void trapCellCannotLeaveTest(){
        TrapCell c = new TrapCell(52);
        assertFalse(c.canLeave());
    }
    
    @Test
    public void trapCellBounceReturnsZeroTest(){
        TrapCell c = new TrapCell(31);
        assertEquals(0, c.bounce(4));
        assertEquals(0, c.bounce(6));
    }

}
