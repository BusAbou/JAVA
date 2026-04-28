package battleship;

/**
 * a position on the board that designates the square on which it shoots
 */
public class Position {
  /** an integer for the row attribute */
  private int row;
  /** an integer for the column */
  private int col;
  
  /**
   * constructor for Position
   * 
   * @param r the row position
   * @param c the column position
   */
  public Position(int r, int c){
    this.row = r;
    this.col = c;
  }

  /**
   * get the row of that position
   * 
   * @return row the row position
   */
  public int getRow(){
    return this.row;
  }

  /**
   * get the column of that position
   * 
   * @return col the column position
   */
  public int getCol(){
    return this.col;
  }

  /**
   * verify that two positions have the same columns and rows
   * 
   * @param obj an object attribut
   * @return true if two positions are equals or false
   */
  public boolean equals(Object obj){
    if(!(obj instanceof Position)) return false;

    Position other = (Position) obj;
    return this.row == other.row && this.col == other.col;
  }

  /**
   * a description of the position
   * 
   * @return string, a string chain
   */
  public String toString(){
    return "row = " + this.row + " col = " + this.col;
  }
  
}
