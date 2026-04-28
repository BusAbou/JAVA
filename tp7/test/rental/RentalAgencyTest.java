package rental; 

import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import rental.filter.BrandFilter;
import rental.filter.MaxPriceFilter;
import rental.filter.VehicleFilter;

import static org.junit.jupiter.api.Assertions.*;

public class RentalAgencyTest{
    private RentalAgency agency;

    private Vehicle v1;
    private Vehicle v2;
    private Vehicle v3;

    private Client customer;
    private Client customer2;

    private VehicleFilter maxPrice150;
    private VehicleFilter brand2;

    @BeforeEach
    public void before(){
        this.agency = new RentalAgency();

        this.v1 = new Vehicle("brand1", "model1", 2015, 100.0f);
        this.v2 = new Vehicle("brand2", "model2", 2000, 200.0f);
        this.v3 = new Vehicle("brand3", "model3", 2022, 150.0f);

        this.customer = new Client("customer1", 30);
        this.customer2 = new Client("customer2", 24);

        this.maxPrice150 = new MaxPriceFilter(150.0f);
        this.brand2 = new BrandFilter("brand2");
    }

    @Test 
    public void testAddVehicleSuccess() {
        this.agency.addVehicle(v1);
        this.agency.addVehicle(v2);

        assertTrue(this.agency.getAllVehicles().contains(v1));
        assertTrue(this.agency.getAllVehicles().contains(v2));
        assertEquals(2, this.agency.getAllVehicles().size());
    }

    @Test 
    public void testRemoveVehicleSuccess()  throws UnknownVehicleException{
        this.agency.addVehicle(v1);
        this.agency.addVehicle(v2);

        this.agency.removeVehicle(v1);

        assertFalse(this.agency.getAllVehicles().contains(v1));
        assertTrue(this.agency.getAllVehicles().contains(v2));
        assertEquals(1, this.agency.getAllVehicles().size());
    }

    @Test 
    public void testRemoveVehicleFailed() throws UnknownVehicleException {
        this.agency.addVehicle(v1);
        this.agency.addVehicle(v2);

        this.agency.removeVehicle(v2);

        assertThrows(UnknownVehicleException.class, () -> this.agency.removeVehicle(v3));
        assertThrows(UnknownVehicleException.class, () -> this.agency.removeVehicle(v2));
    }

    @Test 
    public void testCustomerHasRentedVehicle() throws UnknownVehicleException{
        this.agency.addVehicle(v1);
        this.agency.rentVehicle(customer, v1);

        assertTrue(this.agency.hasRentedAVehicle(customer));
    }

    @Test 
    public void testCustomerHasNotRentedVehicle() {
        assertFalse(this.agency.hasRentedAVehicle(customer));
    }

    @Test 
    public void testIfVehicleIsRented() throws UnknownVehicleException {
        this.agency.addVehicle(v1);
        this.agency.addVehicle(v2);

        this.agency.rentVehicle(customer, v1);

        assertTrue(this.agency.isRented(v1));
        assertFalse(this.agency.isRented(v2));
    }

    @Test 
    public void testRentVehicle() throws UnknownVehicleException {
        this.agency.addVehicle(v1);
        this.agency.addVehicle(v2);

        assertEquals(v1.getDailyPrice(), this.agency.rentVehicle(customer, v1));
        assertThrows(UnknownVehicleException.class, () -> this.agency.rentVehicle(this.customer,v3));
        assertThrows(IllegalStateException.class, () -> this.agency.rentVehicle(this.customer, v2));
        assertThrows(IllegalStateException.class, () -> this.agency.rentVehicle(this.customer2, v1));
    }

    @Test 
    public void testReturnVehicle() throws UnknownVehicleException {
        this.agency.addVehicle(v3);

        this.agency.rentVehicle(customer, v3);
 
        this.agency.returnVehicle(customer);
        assertFalse(this.agency.allRentedVehicles().contains(v3));
    }

    @Test 
    public void testReturnVehicleNoRental() {
        this.agency.returnVehicle(customer);

        assertTrue(this.agency.allRentedVehicles().isEmpty());
    }

    @Test 
    public void testSelectVehicles() {
        this.agency.addVehicle(v1);
        this.agency.addVehicle(v2);
        this.agency.addVehicle(v3);
        
        List<Vehicle> selection = this.agency.select(maxPrice150); 
        assertTrue(selection.contains(v1));
        assertFalse(selection.contains(v2));
        assertFalse(selection.contains(v3));
        assertEquals(1, selection.size());
    }

    @Test 
    public void testSelectByBrand() {
        this.agency.addVehicle(v1);
        this.agency.addVehicle(v2);
        this.agency.addVehicle(v3);

        List<Vehicle> selection = this.agency.select(brand2);

        assertTrue(selection.contains(v2));
        assertEquals(1,selection.size());
        assertFalse(selection.contains(v1));
        assertFalse(selection.contains(v3));
    }
}