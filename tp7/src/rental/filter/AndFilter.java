package rental.filter;

import java.util.ArrayList;
import java.util.List;

import rental.Vehicle;

/** to perform "filter intersections", which amounts to applying the logic between filters. */
public class AndFilter implements VehicleFilter{
    /** a list of any number of filters. */
    private List<VehicleFilter> theFilters;

    /** constructor of this class */
    public AndFilter(){
        this.theFilters = new ArrayList<VehicleFilter>();
    }

    /**
     * a method for adding a vehicle in our list
     * @param v the vehicle to add
     */
    public void addFilter(VehicleFilter v){
        this.theFilters.add(v);
    }

     /**
     * accept a vehicle if its brand is the same than the required brand
     * @param v
     * @return <code>true</code> if v's brand is the same than the required brand
     * @see VehicleFilter#accept(Vehicle)
     */
    public boolean accept(Vehicle v) {
       for(VehicleFilter c: this.theFilters){
          if (! accept(v)) {
            return false;
          }
       }
       return true;
    }
}
