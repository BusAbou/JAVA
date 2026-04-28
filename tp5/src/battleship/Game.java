package battleship;

import battleship.util.*;
import java.util.Scanner;

/**
 * class game 
 */
public class Game {
   /** attribute board */
   private Board board;
   /** attribute shots */
   private int shots;

   /**
    * constructor for the class Game
    * 
    * @param board the board for our game
    */
    public Game(Board board){
        this.board = board;
        this.shots = 0;
    }

    /**
     * main game loop, method play()
     */
    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("********* Start of the game **********");

    while (!isOver()) {
        this.board.display();

        System.out.println("Enter the shot coordinates (x,y):");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        Position position = new Position(x, y);

        if (!this.board.contains(position)) {
            System.out.println("Invalid position!");
            continue;
        }

             try {
                ResultShot result = this.board.ShootAt(position);
                shots++;

                switch (result) {
                    case MISSED:
                       System.out.println("Missed!");
                       break;
                    case HIT:
                       System.out.println("Touch!");
                       break;
                    case SUNK:
                      System.out.println("Sunk!");
                      break;
                }
            } catch (InvalidPositionException e) {
              System.out.println("Exception: " + e.getMessage());
            }
        }

       this.board.display();
       System.out.println("********* Game ended in " + this.shots + " shots ************");
       scanner.close();
   }

    /**
     * check if the game is over
     * 
     * @return true if the game over or false
     */
    public boolean isOver(){
        for (int row = 0; row < this.board.getHeight(); row++){
            for (int col = 0; col < this.board.getWidth(); col++){
                Position pos = new Position(row, col);
                Cell cell = this.board.getCell(pos);

                if(cell != null && cell.hasShip()) {
                    Ship ship = cell.getShip();
                    if(ship != null && !ship.isSunk()){
                        return false;
                    }
                }
            }
        }
        return  true;
    }

}
