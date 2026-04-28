package rental.agency;

import rental.Client;
import rental.RentalAgency;
import rental.UnknownVehicleException;
import rental.Vehicle;

/** the object Suspicious Rental Agency  */
public class SuspiciousRentalAgency extends RentalAgency {
    /** a constant that corresponds to the 10% surcharge */
    private static final double taxe = 1.10;

    /** 
     * the constructor of this class
     */
    public SuspiciousRentalAgency(){
        super();
    }

    /**
     * allows customer c to rent the vehicle v
     * @param c the customer
     * @param v the vehicle
     * @return the rental price of vehicle v for customer c
     * @exception UnknownVehicleException exception when the vehicle is not in the list
     */
    public double rentVehicle(Client c, Vehicle v) throws UnknownVehicleException {
        if(c.getAge() < 25) {
            return super.rentVehicle(c, v) * taxe;
        }
        return super.rentVehicle(c, v);
    }
}
