package goosegame.cell;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TeleportationCellTest {

    @Test
    public void teleportationCellIsCorrectAtCreationTest(){
        TeleportationCell c = new TeleportationCell(6, 12);
        assertEquals(6, c.getIndex());
        assertEquals(12, c.getTargetIndex());
        assertEquals(null, c.getPlayer());
    }
    
    @Test
    public void teleportationCellCanLeaveTest(){
        TeleportationCell c = new TeleportationCell(6, 12);
        assertTrue(c.canLeave());
    }
    
    @Test
    public void teleportationCellBounceTest(){
        TeleportationCell c = new TeleportationCell(6, 12);
        assertEquals(6, c.bounce(3));
        
        TeleportationCell c2 = new TeleportationCell(19, 7);
        assertEquals(-12, c2.bounce(5)); 
    }


}
