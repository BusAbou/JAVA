package battleship;

import battleship.util.Orientation;
import battleship.util.ResultShot;
import battleship.InvalidPositionException;

/**
 * the board for the game
 */
public class Board {
   /** a two-dimensional array of cells */
   private Cell[][] grid;
   /** the width of the board */
   private int width;
   /** the heigth of the board */
   private int heigth;

   /**
    * constructor of the class Board
    *
    * @param w the width of the board
    * @param h the heigth of the board
    */
    public Board(int w, int h){
        this.width = w;
        this.heigth = h;
        grid = new Cell[h][w];

        for (int row = 0; row < h; row++) {
            for (int col = 0; col < w; col++) {
              grid[row][col] = new Cell();
            }
        }
    }

    /**
     * get height of the board
     * 
     * @return heigth the heigth of the board
     */
    public int getHeight(){
        return this.heigth;
    }

    /**
     * get width of the board
     * 
     * @return width the width of te board
     */
    public int getWidth(){
        return this.width;
    }

    /**
     * returns the cell to a given position
     * @param position the position of the cell
     * @return null if no positon match or the cell in that position
     */
    public Cell getCell(Position position){
        int row = position.getRow();
        int col = position.getCol();

        if (!contains(position)) {
            return null;
        }

        return grid[row][col];
    }

    /**
     * shoot at a position
     * 
     * @param position the position of the cell
     * @throws InvalidPositionException when the position is not valid
     * @return the grid position
     */
    public ResultShot ShootAt(Position position) throws InvalidPositionException{
        if(!contains(position)){
            //return ResultShot.MISSED;
            throw new InvalidPositionException("the position is not valid !");
        }

        return this.grid[position.getRow()][position.getCol()].takeAShot();
    }

    /**
     * place a boat on the board in an orientation
     * 
     * @param ship the ship to place on the board
     * @param position the position on the board 
     * @param orientation the orientation the ship
     */
    public void putShip(Ship ship, Position position, Orientation orientation){
        //int x = position.getCol();
        //int y = position.getRow();

        for(Position pos : ship.getPositions()){
            this.grid[pos.getRow()][pos.getCol()].setShip(ship);
        }
    }

    /**
     * checks if the position is within the board limits
     * 
     * @param position the position on the board
     * @return true if the position are on the board or false if not
     */
    public boolean contains(Position position){
        int row = position.getRow();
        int col = position.getCol();
        return row >= 0 && row < this.heigth && col >= 0 && col < this.width;
    }

    /**
     * checks if a ship is present at this position
     * 
     * @param position the position on the board
     * @return false if the position isn't in the board otherwise return that position with the ship
     */
    public boolean hasShipAt(Position position){
        if(! contains(position)){
            return false;
        }
        return this.grid[position.getRow()][position.getCol()].hasShip();
    }

    /**
     * checks if this box has already been drawn
     * 
     * @param position the position on the board
     * @return false if the position is not in the board otherwise return that position hasBeenShot
     */
    public boolean hasBeenShotAt(Position position){
        if(!contains(position)){
            return false;
        }
        
        return this.grid[position.getRow()][position.getCol()].getStatus();
    }

    /**
     * display the game board
     */
    public void display(){
        for (int row = 0; row < this.heigth; row++){
            for (int col = 0; col < this.width; col++) {
               Cell cell = grid[row][col];

               if (!cell.getStatus()){
                  System.out.print(" . ");
               }else if(!cell.hasShip()){
                  System.out.print(" ∼ ");
               }else {
                  System.out.print(" * ");
               }

            }
            System.out.println();
        }
    }
}
