package goosegame.cell;

import goosegame.Cell;

/** the object NormalCell who inherits from Cell */
public class NormalCell extends Cell{

    /**
     * creates a new normal cell
     * @param index cell index
     */
    public NormalCell(int index){
        super(index);
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
        return 0;
    }
     /**
     * Return Nothing
     */

    public String msg(){
        return "";

    }
}
