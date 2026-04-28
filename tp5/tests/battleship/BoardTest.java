package battleship;

import battleship.*;
import battleship.util.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import  java.util.List;

public class BoardTest {
    @Test 
    public void testShotOnEmptyCell() throws InvalidPositionException {
       Board board = new Board(5,5);
       Position pos = new Position(1,1);
       assertEquals(board.ShootAt(pos), ResultShot.MISSED);
    }

    @Test 
    public void testShotOnShip() throws InvalidPositionException{
        Board board = new Board(5,5);
        Ship ship = new Ship(2, Orientation.HORIZONTAL, 
            List.of(new Position(2, 2), new Position(3,2)));
        
        board.putShip(ship, new Position(2, 2), Orientation.HORIZONTAL);
        assertEquals(board.ShootAt(new Position(2,2)), ResultShot.HIT);
    }

    @Test 
    public void testShotPositionValid() {
        Board board = new Board(5, 5);
        Position pos = new Position(-1, 10);

        assertThrows(InvalidPositionException.class, () -> board.ShootAt(pos));
    }

    @Test 
    public void testRepeatShotAtSameCell() throws InvalidPositionException {
        Board board = new Board(5, 5);
        Ship ship = new Ship(2, Orientation.HORIZONTAL, List.of(new Position(1,1)));

        board.putShip(ship, new Position(1, 1), Orientation.HORIZONTAL);

        ResultShot one = board.ShootAt(new Position(1, 1));
        ResultShot second = board.ShootAt(new Position(1, 1));

        assertEquals(ResultShot.HIT, one);
        assertTrue(ResultShot.HIT == second || second == ResultShot.SUNK);
    }
}
