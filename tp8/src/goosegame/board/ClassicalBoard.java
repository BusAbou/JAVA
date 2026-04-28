package goosegame.board;

import goosegame.Board;
import goosegame.Cell;
import goosegame.cell.*;

/** the object ClassicalBoard inherits from Cell */
public class ClassicalBoard  extends Board{
    /** a constant NBCELLS that always has 63 */
    private static final int NBCELLS = 63;

    /** the constructor of the class ClassicalBoard */
    public ClassicalBoard(){
        super(NBCELLS);
    }

    /** initializes the class ClassicalBoard */
    protected void initBoard(){
      
        // goose cells 
        int[] goose = {9,18,27,36,45,54};
        for(int g : goose) {
            this.theCells[g] = new GooseCell(g);
        }

        // teleportation cells
        this.theCells[6] = new TeleportationCell(6,12);
        this.theCells[42] = new TeleportationCell(42,30);
        this.theCells[58] = new TeleportationCell(58,1);

        // trap cells
        this.theCells[31] = new TrapCell(31); // well
        this.theCells[52] = new TrapCell(52); // prison

        // wait cell
        this.theCells[19] = new WaitCell(19,2);
    }
}
