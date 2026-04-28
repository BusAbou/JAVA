package goosegame.cell;

import goosegame.Cell;
import goosegame.Player;

/** the object WaitCell inherits from Cell */
public class WaitCell extends Cell{

    /** turns to wait */
    private final int turnsToWait;
    /** remaining turns to wait */
    private int remainingTurns;

    /**
     * creates a new teleportation cell
     * @param index cell index
     * @param turnsToWait the next cell
     */
    public WaitCell(int index, int turnsToWait){
        super(index);
        this.turnsToWait = turnsToWait;
        this.remainingTurns = turnsToWait;
    }

    /**
     * set a new player on this cell
     * @param player player
     */
    public void setPlayer(Player player){
        super.setPlayer(player);
        this.remainingTurns = turnsToWait;
    }

    /**
     * player can't leave this cell for number of turns
     * @return false
     */
    public boolean canLeave(){
        this.remainingTurns = this.remainingTurns -1;
        return this.remainingTurns == 0;
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
     * get remaining turns
     * @return remaining turns
     */
    public int remainingTurns(){
        return this.remainingTurns;
    }

    /**
     * decrease number of turns to wait by one 
     */
    /**public void decreaseTurns(){
        this.remainingTurns = this.remainingTurns -1;
    }
    */

    /**
     * Return the remaining waiting time
     */

    public String msg(){
        return "( Il reste : " + this.remainingTurns + " a attendre )";

    }
}
