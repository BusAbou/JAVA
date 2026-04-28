
import java.util.Random;


public class RectangleMain {

    public static void main(String[] args) {
        Rectangle myRect1 = null;

        // case 1: no argument provided
        if(args.length == 0) {
            System.out.println("Error: You must provide 1 or 2 integers as a parameter !");
            System.out.println("Usage: java RectangleMain <dimension> or java RectangleMain <width> <length>");
            return;
        }

        // case 2: a single argument -> square
        if (args.length == 1){
            try {
                int side = Integer.parseInt(args[0]);
                myRect1 = new Rectangle(side, side);
            }catch (NumberFormatException e){
                System.out.println("Error: " + args[0] + "is not a valid integer.");
                return;
            }
        } else if( args.length == 2){ // case 3: two arguments -> width and length
            try {
                int width = Integer.parseInt(args[0]);
                int length = Integer.parseInt(args[1]);
                myRect1 = new Rectangle(width,length);
            } catch(NumberFormatException e){
                System.out.println("Error: Arguments must be integers!");
                return;
            }
        } else { // case 4: too many arguments
            System.out.println("Error: Too many arguments. Use only 1 or 2 integers.");
            return;
        }

        // the second rectangle: arbitrary or random
        Random alea = new Random();
        Rectangle myRect2 = new Rectangle(alea.nextInt(10) + 1, alea.nextInt(10) + 1);

        System.out.println(myRect1.toString());
        System.out.println(myRect2.toString());
        System.out.println("Area = " + myRect1.area() + " and Perimeter = " + myRect1.perimeter());
        System.out.println("this myRect1 is a square ? " + myRect1.isSquare());
        System.out.println("this myRect2 is a square ? " + myRect2.isSquare());
        System.out.println("this two rectangle are equal ? " + myRect1.equals(myRect2));
    }
}
