package battleship;

import battleship.util.Orientation;

public class BattleShipMain {
    public static void main(String[] args) {
        Board board = new Board(8,12);
        System.out.println("8x12 board created");

        Ship ship1 = new Ship(3, Orientation.HORIZONTAL, 
            java.util.List.of(
                new Position(1, 1),
                new Position(2,1),
                new Position(3,1)
            )
        );

        Ship ship2 = new Ship(4, Orientation.VERTICAL, java.util.List.of(
                new Position(5, 3),
                new Position(5,4),
                new Position(5,5),
                new Position(5,6)
            )
        );

        System.out.println("ship 1 placed on: " + ship1.getPositions());
        System.out.println("ship 2 placed on: " + ship2.getPositions());

        board.putShip(ship1, new Position(1,1), Orientation.HORIZONTAL);
        board.putShip(ship2, new Position(5, 3), Orientation.VERTICAL);

        Game game = new Game(board);
        game.play();
    }
}
