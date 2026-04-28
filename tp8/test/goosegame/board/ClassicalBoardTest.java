package goosegame.board;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClassicalBoardTest{
    
    @Test 
    public void testNbCells(){
        ClassicalBoard board = new ClassicalBoard();
        assertEquals(63, board.getNbOfCells());
    }

    @Test 
    public void testGooseCellExists(){
        ClassicalBoard board = new ClassicalBoard();
        assertTrue(board.getCell(9) instanceof goosegame.cell.GooseCell);
    }

    @Test 
    public void testTeleportationCell(){
        ClassicalBoard board = new ClassicalBoard();
        assertTrue(board.getCell(6) instanceof goosegame.cell.TeleportationCell);
    }
}
