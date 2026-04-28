package rental;

import rental.agency.FriendlyRentalAgency;
import rental.agency.SuspiciousRentalAgency;
import rental.filter.BrandFilter;
import rental.filter.MaxPriceFilter;
import rental.filter.VehicleFilter;
import rental.vehicle.Car;
import rental.vehicle.MotorBike;


public class RentalAgencyMain {

	public static void main(String[] args) throws Exception {
		Vehicle v1 = new Vehicle("brand1", "model1", 2019, 80.0f);
		Vehicle v2 = new Vehicle("brand2", "model2", 2024, 200.0f);
		Vehicle v3 = new Vehicle("brand1", "model3", 2021, 130.0f);
		Vehicle v4 = new Vehicle("brand2", "model4", 2024, 90.0f);
		Client c1 = new Client("Tim Oleon", 40);
		Client c2 = new Client("Timo Leon", 21);

		// écrivez ici du code qui utilise les différentes méhtodes écrites
		System.out.println("----------- Q5) different methods of RentalAgency ----------");
		RentalAgency agency = new RentalAgency();
		System.out.println("We have four vehicles to add in the agency");
		agency.addVehicle(v1);
		agency.addVehicle(v2);
		agency.addVehicle(v3);
		agency.addVehicle(v4);
		System.out.println("Vehicle " + v1.toString() + ", added on the agency");
        System.out.println("Vehicle " + v2.toString() + ", added on the agency");
        System.out.println("Vehicle " + v3.toString() + ", added on the agency");
        System.out.println("Vehicle " + v4.toString() + ", added on the agency");
		System.out.println("All vehicles in our agency: " + agency.getAllVehicles());

		try {
			System.out.println();
			System.out.println("we would like to remove the vehicle " + v4.toString());
			agency.removeVehicle(v4);
			System.out.println("Vehicle " + v4.toString() + " removed !");
			System.out.println("the remaining vehicles in our agency: " + agency.getAllVehicles());
		} catch (UnknownVehicleException e) {
			System.out.println("cannot removed the vehicle");
		} 

		System.out.println();

		VehicleFilter filter1 = new BrandFilter("brand1");
		System.out.println("select vehicles that have the brand brand1 in our agency");
        agency.displaySelection(filter1);
        System.out.println();
		System.out.println(c1.toString() + " want to rent a vehicle");
		System.out.println(c1.getName() + " has rented a vehicle before ? : " + agency.hasRentedAVehicle(c1));
		System.out.println("Vehicle " + v1.toString() + ", was rented ?: " + agency.isRented(v1));
		double price = agency.rentVehicle(c1, v1);
		System.out.println(c1.getName() + " has now rented that vehicle : " + agency.hasRentedAVehicle(c1));
		System.out.println("the price of that vehicle is: " + price);

		System.out.println(v1.toString() + " is rented : " + agency.isRented(v1));
		System.out.println("all rented vehicle: ");
		System.out.println(agency.allRentedVehicles());
        
		System.out.println();

		System.out.println("---------- Q8) objets Car et Motorbike ---------- ");
		Vehicle car1 = new Car(5, "brand1", "model6", 2019, 180.0f);
		Vehicle motorBike1 = new MotorBike("brand2", "model2", 2024, 78.0f, 20.00);
		System.out.println("we have two vehicles car1 et motorBike1 to add in the agency");
		agency.addVehicle(motorBike1);
        agency.addVehicle(car1);
		System.out.println("Vehicle " + car1.toString()+ ", added in the agency");
		System.out.println("Vehicle " + motorBike1.toString() + ", added in the agency");
        VehicleFilter filter2 = new MaxPriceFilter(100.0);
		agency.select(filter2);
		System.out.println("display the selection with a filter to retrieve cars that have a price less than 100.0");
		agency.displaySelection(filter2);

		System.out.println();

		System.out.println("---------- Q10)  object SuspiciousRentalAgency ------------");
		RentalAgency suspiciousAgency = new SuspiciousRentalAgency();
		Client c3 = new Client("John", 24);
		Client c4 = new Client("Alex", 23 );
		suspiciousAgency.addVehicle(car1);
		System.out.println(c3.getName() + " want to rent the vehicle " + car1.toString());
		double rentPrice = suspiciousAgency.rentVehicle(c3, car1);
		System.out.println("Vehicle " + car1.toString() + " rented by " + c3.getName() + ", " + c3.getName() + "'s age " + c3.getAge());
		System.out.println("the price paid by " + c3.getName() + " is " + rentPrice );
		
		System.out.println();

		suspiciousAgency.addVehicle(motorBike1);
		System.out.println(c4.getName() + " want to rent the vehicle " + motorBike1.toString());
		System.out.println("Vehicle " + motorBike1.toString() + " rented by " + c4.getName() + ", " + c4.getName() + "'s age" + c4.getAge());
		double rentP = suspiciousAgency.rentVehicle(c4, motorBike1);
		System.out.println("the price paid by " + c4.getName() + " is " + rentP);

		System.out.println();
		System.out.println("---------- Q12) objet FriendlyRentalAgency -----------");
		Vehicle v5 = new Vehicle("brand3", "model1", 2019, 580.0f);
		Vehicle v6 = new Vehicle("brand5", "model0", 2025, 200.0f);
		//Vehicle v7 = new Vehicle("brand7", "model8", 2025, 205.0f);
		FriendlyRentalAgency friendly = new FriendlyRentalAgency(5, 0.10);
		friendly.addVehicle(v5);
		System.out.println(c2.getName() + " want to rent the vehicle " + v5.toString());
		double rental = friendly.rentVehicle(c2, v5);
		System.out.println("the price paid by " + c2.getName() + " is " + rental);
		System.out.println(c2.getName() + " you have now: " + friendly.getPoints(c2) + " points");
		System.out.println(c2.getName() + " return the vehicle " + v5.toString() +" if you want another one ");
		System.out.println("Vehicle " + v5.toString() + " returned !");
		friendly.returnVehicle(c2);
		friendly.addVehicle(v6);
		System.out.println(c2.getName() + " want to rent the vehicle " + v6.toString());
		double rental2 = friendly.rentVehicle(c2, v6);
		System.out.println("the price paid by " + c2.getName() + " is " + rental2);
		System.out.println(c2.getName() + " you have now: " + friendly.getPoints(c2) + " points");
	}
}
