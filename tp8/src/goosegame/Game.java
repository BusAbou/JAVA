package goosegame;

import java.util.ArrayList;
import java.util.List;

import goosegame.cell.NormalCell;

/** the object Game */
public class Game {
    protected List<Player> thePlayer;
    protected Board board;


    /**
     * Constructor of Game
     * @param board board
     */
    public Game(Board board){
        this.thePlayer = new ArrayList<Player>();
        this.board = board;

    }

    /**
     * Add a player to the game
     * @param p
     */
    public void addPlayer(Player p){
        this.thePlayer.add(p);
    }

    /**
     * Verify if a player won the game
     */
    public boolean win(){
        for (Player p : this.thePlayer) {
            if(p.getCell().getIndex() == board.getNbOfCells()){
                return true;
            }
        }
        return false;
    }

    /**
     * Changes the cell for the player
     * @param p Player
     * @param cell1 Cell
     * @param cell2 Cell 
     */

    public void changes(Player p, Cell cell1, Cell cell2){
        cell1.removePlayer();
        cell2.setPlayer(p);
        p.changeCell(cell2);
    }


    /**
     * the method Play of the Game
     */
    public void play(){
        Cell c = board.getCell(0);
        for (Player player : this.thePlayer) {
            c.setPlayer(player);
            player.changeCell(c);
            System.out.println("Le joueur "+player.name+ " est sur la case : "+ player.getCell().getIndex() + " au début du jeu !" );
        }

        System.out.println("QUE LE JEU COMMENCE !!");
        
        while(! this.win()){
            for (Player p : this.thePlayer) {
                System.out.println("C'est au tour de "+ p.name);
                if (p.getCell().canLeave()){
                    int dice = p.twoDiceThrow();
                    Cell cellule_ini = p.getCell();

                    // Verify the index after a throw
                    int index_inter = cellule_ini.getIndex() +dice;
                    if (index_inter > board.getNbOfCells()){
                        index_inter = board.getNbOfCells() - (index_inter - board.getNbOfCells());
                    }

                    Cell cellule_inter = this.board.getCell(index_inter);
                    int bounce = cellule_inter.bounce(dice);
                    int index_after = cellule_inter.getIndex() + bounce;

                    // Verify the index after a bounce
                    if (index_after > board.getNbOfCells()){
                        index_after = board.getNbOfCells() - (index_after - board.getNbOfCells());
                    }
                    Cell cellule_fin = this.board.getCell(index_after);

                     //Verify if the cellule_fin is empty if not switch the position of the players
                    if (cellule_fin.getPlayer() == null){
                        this.changes(p, cellule_ini, cellule_fin);


                        if (bounce > 0){
                            String msg = cellule_inter.msg();
                            System.out.println(p.name +" est a la case :" + cellule_ini.getIndex() + " ,"+ p.name +" a joué " + dice + " il est maintenant a la case " + cellule_fin.getIndex() + " " + msg);

                        } else {
                            System.out.println(p.name +" est a la case :" + cellule_ini.getIndex() + " ,"+ p.name +" a joué " + dice + " il est maintenant a la case " + cellule_fin.getIndex());
                        }
                    } 

                     // Changes the cells of the two players
                    else{
                        Player p2 = cellule_fin.getPlayer();

                        cellule_fin.removePlayer();
                        cellule_ini.removePlayer();

                        cellule_ini.setPlayer(p2);
                        p2.changeCell(cellule_ini);

                        cellule_fin.setPlayer(p);
                        p.changeCell(cellule_fin);

                        System.out.println(p.name +" est a la case : " + cellule_ini.getIndex() + " ,"+ p.name +" a joué " + dice + " la case " + cellule_fin.getIndex() + " était occupée, " + p2.name + " a donc été envoyé a la case " + cellule_ini.getIndex()); 
                    }
                
                }else{
                    String msg = p.getCell().msg();
                    System.out.println(p.name +" est a la case :" + p.getCell().getIndex()+" il ne peut pas bouger. " + msg);
                }

            
            
            }
            for (Player player : thePlayer) {
                if (player.getCell().getIndex() == board.getNbOfCells()){
                    System.out.println("VICTOIRE DE " + player.name);
                }
            }
        }
    }

}
