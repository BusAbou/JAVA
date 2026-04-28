package rental.vehicle;

import rental.Vehicle;

/**
 * the object MotorBike which is a vehicle
 */
public class MotorBike extends Vehicle {
    /** attribut engine displacement */
    private double cyl;

    /** constructor of the class MotorBike 
     *  @param cyl
    */
    public MotorBike(String brand, String model, int productionYear, double dailyRentalPrice, double cyl){
        super(brand, model, productionYear, dailyRentalPrice);
        this.cyl = cyl;
    }
    
    /**
     * MotorBike description added
     * @return that descrition 
     */
    public String toString(){
        return super.toString() + " and the engine displacement is " + this.cyl;
    }
}
