package vlille;
import vlille.util.BikeModel;

/**
 * It creates a bike and displays its description.
 */

public class BikeMain {

   /**
     * Default constructor. Does nothing.
     */
    public BikeMain() {
        // No initialization required
    }

   /**
     * Main entry point of the program.
     *
     * @param args the command line arguments (not used here)
     */
   public static void main(String[] args) {
      // Instantiate a Bike object
      Bike someBike = new Bike("biclou", BikeModel.ELECTRIC);

      // Display the bike’s description
      System.out.println(someBike);
   }

}
