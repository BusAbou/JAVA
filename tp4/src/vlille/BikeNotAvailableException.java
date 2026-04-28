package vlille;

/**
 * in case a bike is not available
 */
public class BikeNotAvailableException extends Exception {
   /**
    * constructor of the class BikeNotAvailableException
    *
    * @param arg0 a string 
    */
   public BikeNotAvailableException(String arg0) {
      super(arg0);
   }

}
