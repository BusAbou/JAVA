package goosegame;

import static org.junit.Assert.*;
import org.junit.Test;
import goosegame.cell.*;

public class CellTest {

@Test
    public void cellSetAndGetPlayerTest(){
        Cell c = new NormalCell(10);
        Player p = new Player("Timo");
        assertNull(c.getPlayer());
        c.setPlayer(p);
        assertEquals(p, c.getPlayer());
    }
    
    @Test
    public void cellRemovePlayerTest(){
        Cell c = new NormalCell(15);
        Player p = new Player("Leon");
        c.setPlayer(p);
        assertNotNull(c.getPlayer());
        c.removePlayer();
        assertNull(c.getPlayer());
    }
    
    @Test
    public void cellGetIndexTest(){
        Cell c1 = new NormalCell(0);
        Cell c2 = new GooseCell(63);
        assertEquals(0, c1.getIndex());
        assertEquals(63, c2.getIndex());
    }

}
