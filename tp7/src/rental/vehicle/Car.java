package rental.vehicle;

import rental.Vehicle;

/**
 * the object car which is a vehicle
 */
public class Car extends Vehicle {
    /** number of passengers a car can accommodate */
    private int numberPassengers;
    
    /**
     * the constructor of the class car
     * @param nbP
     */
    public Car(int nbP, String brand, String model, int productionYear, double dailyRentalPrice){
        super(brand, model, productionYear, dailyRentalPrice);
        this.numberPassengers = nbP;
    }

    /**
     * get the number of passenger of the car
     * @return numberPassengers 
     */
    public int getNumberPassengers(){
        return this.numberPassengers;
    }

    /**
     * car description
     * @return that description
     */
    public String toString(){
       return super.toString() + " and the car can take " + this.numberPassengers + " passengers";
    }
}
