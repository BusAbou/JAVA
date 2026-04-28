package rental;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import rental.filter.VehicleFilter;

/** the object for implements our rental agency */
public class RentalAgency {
    /** all the vehicle of the agency */
    protected List<Vehicle> allVehicles;
    /** a set dependent on a customer and a vehicle */
    protected final Map<Client,Vehicle> rentals;

    /**
     * constructor of the class rental agency
     */
    public RentalAgency(){
        this.allVehicles = new ArrayList<>();
        this.rentals = new HashMap<>();
    }
    
    /**
     * retrieve all vehicles
     * @return result all the vehicle of the list
     */
    public List<Vehicle> getAllVehicles(){
        List<Vehicle> result = new ArrayList<>();
        for(Vehicle v: this.allVehicles){
            result.add(v);
        }
        return result;
    }

    /** 
     * method for add a vehicle to our list
     * @param v the vehicle to add
     */
    public void addVehicle(Vehicle v){
        this.allVehicles.add(v);
    }

    /**
     * delete a vehicle given as a parameter in the list
     * @param v the vehicle to delete
     * @throws UnknownVehicleException is triggered when a vehicle cannot be deleted.
     */
    public void removeVehicle(Vehicle v) throws UnknownVehicleException{
        if(! this.allVehicles.contains(v)){
            throw new UnknownVehicleException("this vehicle is not in the list");
        }
        this.allVehicles.remove(v);                                                                                        
    }

    /**
     * select a vehicle that is accepted by the filter 
     * @param f the vehicle to be filtered
     * @return result a list of vehicles accepted by the filter f
     */
    public List<Vehicle> select(VehicleFilter f){
        List<Vehicle> result = new ArrayList<>();
        for(Vehicle c: this.allVehicles){
            if(f.accept(c)){
                result.add(c);
            }
        }
        return result;
    }

    /**
     * It displays all the agency's vehicles that are accepted by the filter f
     * @param f the vehicle to be filtered
     */
    public void displaySelection(VehicleFilter f){
        for(Vehicle v : this.allVehicles){
            if(f.accept(v)){
                System.out.println(v);
            }
        }
    }

    /**
     * check if a customer has rented a vehicle
     * @param c the customer
     * @return returns true if and only if it is a customer for whom a vehicle 
     * rental is in progress. The result is therefore false otherwise.
     */
    public boolean hasRentedAVehicle(Client c){
        return this.rentals.containsKey(c);
    }

    /**
     * check if a vehicle is rented
     * @param v the rental vehicle
     * @return true if and only if the vehicle is currently rented, false otherwise
     */
    public boolean isRented(Vehicle v){
        return this.rentals.containsValue(v);
    }

    /**
     * allows customer c to rent the vehicle v
     * @param c the customer
     * @param v the vehicle
     * @return the rental price of vehicle v for customer c
     * @exception UnknownVehicleException exception when the vehicle is not in the list
     */
    public double rentVehicle(Client c, Vehicle v) throws UnknownVehicleException {
        if(! this.allVehicles.contains(v)){
            throw new UnknownVehicleException("this vehicle is not in the list");
        } else if (hasRentedAVehicle(c) || isRented(v)){
            throw new IllegalStateException("Impossible");
        }
        this.rentals.put(c, v);
        return v.getDailyPrice();
    }

    /**
     * allows a customer to return the vehicle they are renting
     * @param c the customer
     */
    public void returnVehicle(Client c){
        this.rentals.remove(c);
    }

    /** 
     * the collection of vehicles from the agency that are currently rented.
     * @return renvoie la collection des véhicules de l’agence
     */
    public Collection<Vehicle> allRentedVehicles(){
        return new ArrayList<>(this.rentals.values());
    }
}
