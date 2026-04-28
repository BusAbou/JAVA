package goosegame.cell;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NormalCellTest {

    @Test
    public void normalCellIsCorrectAtCreationTest(){
        NormalCell c = new NormalCell(5);
        assertEquals(5, c.getIndex());
        assertEquals(null, c.getPlayer());
    }
    
    @Test
    public void normalCellCanLeaveTest(){
        NormalCell c = new NormalCell(3);
        assertTrue(c.canLeave());
    }
    
    @Test
    public void normalCellBounceReturnsZeroTest(){
        NormalCell c = new NormalCell(2);
        assertEquals(0, c.bounce(4));
        assertEquals(0, c.bounce(6));
    }   
}
