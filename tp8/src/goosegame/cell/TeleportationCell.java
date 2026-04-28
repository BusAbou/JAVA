package goosegame.cell;

import goosegame.Cell;

/** the object Teleportation inherits from Cell */
public class TeleportationCell extends Cell{

    /** teleport target */
    private int targetIndex;

    /**
     * creates a new teleportation cell
     * @param index cell index
     */
    public TeleportationCell(int index, int targetIndex){
        super(index);
        this.targetIndex = targetIndex;
    }

    /**
     * target index
     * @return target index
     */
    public int getTargetIndex(){
        return this.targetIndex;
    }

    /**
     * player can leave this cell
     * @return true
     */
    public boolean canLeave(){
        return true;
    }

    /**
     * bonus bounce 
     * @param dice dice
     * @return number of bounce
     */
    public int bounce(int dice){
        return targetIndex - index;
    }

     /**
     * return in String the number of bounces
     */

    public String msg(){
        return " ( Teleportation )";

    }
}
