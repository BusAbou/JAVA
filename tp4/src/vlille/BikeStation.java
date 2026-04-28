package vlille;

/**
 * a bike station
 */

public class BikeStation {

   /** array of slots for bikes in the station */
   private Bike[] bikes;
   /** name of the station */
   private String name;

   /** number of bicycles */
   private int nbBikes;

   /**
    * constructor for the class BikeStation
    *
    * @param name the station's name
    * @param capacity station capacity
    */
   public BikeStation(String name, int capacity) {
      this.name = name;
      this.bikes = new Bike[capacity];
      this.nbBikes = 0;
   }

   /**
    * this station's name
    *
    * @return name 
    */
   public String getName() {
     return this.name; 
   }

   /**
    * this station capacity
    *
    * @return capacity
    */
   public int getCapacity() {
      return this.bikes.length;
   }

   /**
    * number of bikes in this station
    *
    * @return number of bikes
    */
   public int getNumberOfBikes() {
      return this.nbBikes; 
   }

   /**
    * the smallest index corresponding to a free space for a bicycle
    * if no slot is free, the result of the method is -1 
    * 
    * @return index of the first free slot, or -1 if the station is full
    */
   public int firstFreeSlot() {
      for (int i = 0 ; i < this.bikes.length; i++){ 
         if(this.bikes[i] == null){
            return  i;
         }
      }
      return -1;
   }

   /**
    * allows you to drop off a bike at a station
    * The bike is then placed in the first free space in the station, if there is one. Otherwise, nothing happens.
    *
    * @param bike the back to drop
    * @return true if it was possible to drop off the bike and false otherwise
    */
   public boolean dropBike(Bike bike) {
      for (int i = 0; i < this.bikes.length; i++){  
         if(this.bikes[i] == null){
            this.bikes[i] = bike;
            this.nbBikes ++;

            return true;
         } 
      }
      return false;
   }

   /**
    * allows you to take a bike from a station
    *
    * @param n an integer that corresponds to the position of the location where we are trying to pick up a bike
    * @return bike available at this location, is returned as a result
    * @throws BikeNotAvailableException If there is no bike at the requested location or if the location does not exist
    */
   public Bike takeBike(int n) throws BikeNotAvailableException {
      if (n < 0 || n >= this.bikes.length) {
         throw new BikeNotAvailableException("Invalid slot index: " + n);
      }

      if (this.bikes[n] == null){
         throw new BikeNotAvailableException("No bike available at slot: " + n);
      }

      Bike take = this.bikes[n];
      this.bikes [n] = null;
      this.nbBikes --;

      return take;
   }

}
