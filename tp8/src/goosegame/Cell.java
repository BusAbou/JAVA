package goosegame;

/** the object cell for our board */
public abstract class Cell{
    
    /** cell index */
    protected int index;
    /** player on the cell */
    protected Player player;

    /**
     * Creates a new cell
     * @param index cell index
     */
    public Cell(int index){
        this.index = index;
        this.player = null;
    }

    /**
     * return cell index
     * @return cell index
     */
    public int getIndex(){
        return this.index;
    }

    /**
     * return player on the cell
     * @return player on the cell
     */
    public Player getPlayer(){
        return this.player;
    }

    /**
     * set a new player on the cell
     * @param newPlayer new player
     */
    public void setPlayer(Player newPlayer){
        this.player = newPlayer;
    }

    /**
     * remove a player from the cell
     */
    public void removePlayer(){
        this.player = null;
    }

    /**
     * abstract method returns true if player can leave cell
     * @return true if player can leave cell
     */
    public abstract boolean canLeave();

    /**
     * number of bounce
     * @param dice
     * @return number of bounce
     */
    public abstract int bounce(int dice);

     /**
     * String representation of the cell
     */

    public abstract String msg();
}

   