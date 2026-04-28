package battleship;

import battleship.util.ResultShot;

/**
 * that cell for the board
 */
public class Cell {
   /** a boat for the cell  */
   private Ship ship;
   /** a boolean for verify if a cell has been shoted */
   private boolean hasBeenShot ;

   /**
    * constructor Cell
    */
    public Cell(){
        this.ship = null;
        this.hasBeenShot = false;
    }

    /**
     * method get ship 
     * 
     * @return ship, the ship at that cell
     */
    public Ship getShip(){
        return this.ship;
    }

    /**
     * method set ship
     * 
     * @param ship, set a ship for the cell
     */
    public void setShip(Ship ship){
        this.ship = ship;
    }

    /**
     * methode to know if a cell has been shoted
     * 
     * @return true or false 
     */
    public boolean getStatus(){
        return this.hasBeenShot;
    }

    /**
     * verify that a cell have ship or not
     * 
     * @return true if the cell has a ship false if not
     */
    public boolean hasShip(){
        return this.ship != null;
    }

    /**
     * shot on the cell and return the result of that shot
     * 
     * @return Shot's result
     */
    public ResultShot takeAShot(){
        if (this.hasBeenShot){
            if(this.ship != null){
                return ResultShot.HIT;
            } else {
                return  ResultShot.MISSED;
            }
        }

        hasBeenShot = true;
        if(this.ship == null){
            return ResultShot.MISSED;
        }

        this.ship.hit();
        return this.ship.isSunk() ? ResultShot.SUNK : ResultShot.HIT;
    }
}
