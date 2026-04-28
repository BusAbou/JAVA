package goosegame.cell;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import goosegame.Player;

public class WaitCellTest {

@Test
    public void waitCellIsCorrectAtCreationTest(){
        WaitCell c = new WaitCell(19, 2);
        assertEquals(19, c.getIndex());
        assertEquals(2, c.remainingTurns());
        assertEquals(null, c.getPlayer());
    }
    
    @Test
    public void waitCellCannotLeaveTest(){
        WaitCell c = new WaitCell(42, 3);
        assertFalse(c.canLeave()); 
        assertFalse(c.canLeave());
        assertTrue(c.canLeave());  
    }
    
    @Test
    public void waitCellResetsWhenPlayerSetTest(){
        WaitCell c = new WaitCell(19, 2);
        Player p = new Player("Timo");
        c.setPlayer(p);
        assertEquals(2, c.remainingTurns());
        c.canLeave(); 
        assertEquals(1, c.remainingTurns());
        
        Player p2 = new Player("Leon");
        c.setPlayer(p2);
        assertEquals(2, c.remainingTurns());
    }
    
    @Test
    public void waitCellBounceReturnsZeroTest(){
        WaitCell c = new WaitCell(19, 2);
        assertEquals(0, c.bounce(4));
        assertEquals(0, c.bounce(6));
    }
    
}
