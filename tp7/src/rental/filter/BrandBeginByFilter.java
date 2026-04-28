package rental.filter;

import rental.Vehicle;

/** an object that allows filtering by the make of a vehicle that begins with a given character */
public class BrandBeginByFilter implements VehicleFilter{
    /** attribute for the character*/
    private char character;

    /** 
     * constructor of this class
     * @param c, an parameter given by the user
     */
    public BrandBeginByFilter(char c){
        this.character = c;
    }

    /**  accept a vehicle if its daily rental price is lower than the maximal price
     * @return <code>true</code> if v's daily rental price is lower than the maximal price
     * @see VehicleFilter#accept(Vehicle) 
     * @param v
     */
    public boolean accept(Vehicle v) {
        return this.character == v.getBrand().charAt(0);
    }
}
