package goosegame.cell;

import goosegame.Cell;

/** the object TrapCell inherits from Cell */
public class TrapCell extends Cell{

    /**
     * creates a new trap cell
     * @param index cell index
     */
    public TrapCell(int index){
        super(index);
    }

    /**
     * player can't leave this cell
     * @return false
     */
    public boolean canLeave(){
        return false;
    }

    /**
     * bonus bounce 
     * @param dice dice
     * @return number of bounce
     */
    public int bounce(int dice){
        return 0;
    }

     /**
     * Return the fact that the player can't move
     */

    public String msg(){
        return "( En prison )";

    }

}
