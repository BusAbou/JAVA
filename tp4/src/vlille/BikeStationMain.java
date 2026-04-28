package vlille;

import vlille.util.BikeModel;

/**
 * create a station for those bikes
 */
public class BikeStationMain {
    /**
     * Default constructor. Does nothing.
     */
    public BikeStationMain() {
        // No initialization required
    }

    /**
     * Main entry point of the program.
     *
     * @param args the command line arguments 
     */
    public static void main(String[] args){
        if(args.length != 1) {
            System.out.println("Usage: java -classpath classes vlille.BikeStationMain slot_number");
            return;
        }

        int n;
        try {
            n = Integer.parseInt(args[0]);
        }catch(NumberFormatException e) {
            System.out.println("Error: the argument must be an integer.");
            return;
        }

        BikeStation station = new BikeStation("Timoleon", 10);
        Bike bike1 = new Bike("b001", BikeModel.CLASSIC);
        Bike bike2 = new Bike("b002", BikeModel.ELECTRIC);

        station.dropBike(bike1);
        station.dropBike(bike2);

        try {
            Bike taken = station.takeBike(n);
            System.out.println("you took bike: " + taken.getId());
        }catch(BikeNotAvailableException e){
            System.out.println("No bike available at slot " + n + " or invalid slot.");
        }

        System.out.println("Number of bikes available: " + station.getNumberOfBikes());
    } 
}
