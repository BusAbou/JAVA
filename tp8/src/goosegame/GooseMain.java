package goosegame;
import goosegame.cell.*;
import goosegame.board.*;

public class GooseMain {
    
    public static void main(String[] args){
        Board plateau = new ClassicalBoard();
        Game jeu = new Game(plateau);
        
        if(args.length >= 2){
          for(String name : args){
            jeu.addPlayer(new Player(name));
          }
        }else {
            System.out.println("utilisez plutôt: java -classpath classes goosegame.GooseMain name1 name2 ...");
            System.out.println("utilisation des joueurs par défaut");

            Player p1 = new Player("Bob");
            Player p2 = new Player("Fred");
            jeu.addPlayer(p1);
            jeu.addPlayer(p2);
        }

        jeu.play();
    }

    
}
