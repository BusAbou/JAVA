package goosegame;

import goosegame.Cell;
import goosegame.cell.NormalCell;

/** the object Board */
public abstract class Board {
    /** an attribute nbOfCells for the class board */
    protected final int nbOfCells;
    /** an attribute an array of theCells*/
    protected Cell[] theCells;

    /**
     * the constructor of the class Board
     * @param nbOfCells number of cells for our board
     */
    public Board(int nbOfCells){
        this.nbOfCells = nbOfCells;

        // Initialization of the cells 
        this.theCells = new Cell[nbOfCells + 1];
        
        // normal cells or default cells
        for (int i = 0; i <= this.nbOfCells; i++) {
            this.theCells[i] = new NormalCell(i);
        }
        initBoard();  

    }

    /** an abstract method for initializes the board */
    protected abstract void initBoard();

    /** 
     * returns the cell at a given index
     * @param index the number of cell
     * @return the cell at this index
     */
    public Cell getCell(int index){
        return this.theCells[index];
    }

    /** 
     * returns the number of cell
     * @return the number of cell
     */
    public int getNbOfCells(){
        return this.nbOfCells;
    }
}
