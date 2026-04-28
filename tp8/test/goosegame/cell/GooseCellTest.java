package goosegame.cell;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GooseCellTest {


    @Test
    public void gooseCellIsCorrectAtCreationTest(){
        GooseCell c = new GooseCell(9);
        assertEquals(9, c.getIndex());
        assertEquals(null, c.getPlayer());
    }
    
    @Test
    public void gooseCellCanLeaveTest(){
        GooseCell c = new GooseCell(5);
        assertTrue(c.canLeave());
    }
    
    @Test
    public void gooseCellBounceReturnsDiceValueTest(){
        GooseCell c = new GooseCell(9);
        assertEquals(3, c.bounce(3));
        assertEquals(5, c.bounce(5));
    }
    
}
