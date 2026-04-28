package goosegame.cell;

import goosegame.Cell;

/** the object GooseCell who inherits from Cell */
public class GooseCell extends Cell {
    
    /**
     * creates a new goosecell
     * @param index cell index
     */
    public GooseCell(int index){
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
        return dice;
    }

     /**
     * Return the name of the classe
     */

    public String msg(){
        return "( Case de l'oie )";

    }
}
