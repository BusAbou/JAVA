package rental.agency;

import java.util.HashMap;
import java.util.Map;

import rental.Client;
import rental.RentalAgency;
import rental.UnknownVehicleException;
import rental.Vehicle;

/** the object friendly rental agency */
public class FriendlyRentalAgency extends RentalAgency {
    /** attribute point a map */
    private Map<Client, Integer> points;
    /** attribute threshold to get a discount */
    private final int threshold;
    /** attribute rate reduction percentage */
    private final double  rate;

    /**
     * the constructor of the object FriendlyRentalAgency
     * @param t the threshold
     * @param r the rate
     */
    public FriendlyRentalAgency(int t, double r){
        super();
        this.threshold = t;
        this.rate = r;
        this.points = new HashMap<>();
    }

    /** 
     * get the threshold 
     * @return threshold
     */
    public int getThreshold(){
        return this.threshold;
    }

    /**
     * get the rate
     * @return rate
     */
    public double getRate(){
        return this.rate;
    }

    /**
     * get the points of the client
     * @param client
     * @return the loyalty points
     */
    public int getPoints(Client client){
        return this.points.getOrDefault(client, 0);
    }

    /**
     * allows customer c to rent the vehicle v
     * @param c the customer
     * @param v the vehicle
     * @return the rental price of vehicle v for customer c
     * @exception UnknownVehicleException exception when the vehicle is not in the list
     */
    public double rentVehicle(Client c, Vehicle v) throws UnknownVehicleException {
        double basePrice = super.rentVehicle(c,v);

        int Points = getPoints(c) + 1;
        this.points.put(c, Points);

        if(Points > this.threshold) {
            return basePrice * (1.0 - this.rate);
        }
        return basePrice;
    }
}
