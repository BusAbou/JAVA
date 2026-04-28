package battleship;

import battleship.util.Orientation;
import java.util.ArrayList;
import java.util.List;

/**
 * class ship for our game
 */
public class Ship {
   /** the size of the ship */
   private int length;
   /** the orientation of that ship */
   private Orientation orientation;
   /** a arrayList of positions */
   private List<Position> positions;
   /** count the number of shots  */
   private int hits;
   
   /**
    * constructor Ship
    *
    * @param length the size of the ship
    * @param orientation the orientation of that ship
    * @param positions a array of positions
    */
    public Ship(int length, Orientation orientation, List<Position> positions){
        this.length = length;
        this.orientation = orientation;
        this.positions = new ArrayList<>(positions);
        this.hits = 0;
    }

    /**
     * fire on a position belonging to the boat
     */
    public void hit(){
       this.hits++;
    }

    /**
     * check if the boat is completely sunk
     * 
     * @return true if the ship sunk or false otherwise
     */
    public boolean isSunk(){
        return this.hits >= this.length;
    }

    /**
     * check if the position is part of the boat
     * 
     * @param position the position of the ship
     * @return true if occupied or false
     */
    public boolean occupied(Position position){
        return this.positions.contains(position);
    }

    /**
     * recover all occupied positions
     * 
     * @return positions those position
     */
    public List<Position> getPositions(){
        return new ArrayList<>(positions);
    }

    /**
     * get the orientation of the ship
     * 
     * @return orientation the orientation of the ship
     */
    public Orientation getOrientation(){
        return this.orientation;
    }

    /**
     * get the length of the ship
     * 
     * @return length the ship's length
     */
    public int getLength(){
        return this.length;
    }
}
