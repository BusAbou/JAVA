package rental;

/**
 * A class to model Vehicle defined 
 */
public class Vehicle {

	protected String brand;
	protected String model;
	protected int productionYear;
	protected double dailyRentalPrice;

	/**
	 * creates a vehivle with given informations
	 * 
	 * @param brand            the vehicle's brand
	 * @param model            the vehicle's model
	 * @param productionYear   the vehicle's production year
	 * @param dailyRentalPrice the daily rental price
	 */
	public Vehicle(String brand, String model, int productionYear, double dailyRentalPrice) {
		this.brand = brand;
		this.model = model;
		this.productionYear = productionYear;	
		this.dailyRentalPrice = dailyRentalPrice;
	}

	/** returns the brand for this vehicle
	 * @return the brand for this vehicle
	 */
	public String getBrand() {
		return this.brand;
	}

	/** returns the model for this vehicle
	 * @return the model for this vehicle
	 */
	public String getModel() {
		return this.model;
	}

	/** returns the production year for this vehicle
	 * @return the production year for this vehicle
	 */
	public int getProductionYear() {
		return this.productionYear;
	}

	/** sreturn this vehicle daily price
	 * @return this vehicle daily price
	 */
	public double getDailyPrice() {
		return this.dailyRentalPrice;
	}

	/**
	 * this vehicle is equals to another if they have same brand, model,
	 * production year and daily rental price
	 * @param o the object to compare with
	 * @return true iff o is equals to this
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object o) {
		if (o instanceof Vehicle) {
			Vehicle theOther = ((Vehicle) o);
			return this.brand.equals(theOther.brand)
					&& this.model.equals(theOther.model)
					&& this.productionYear == theOther.productionYear
					&& this.dailyRentalPrice == theOther.dailyRentalPrice;
		} else {
			return false;
		}
	}
	
	/**
	 * get the description 
	 * @return a string
	 */
	public String toString() {
		return  this.brand + " produce in " + this.productionYear + " of the " + this.model + ", his daily price's " + this.dailyRentalPrice;
	}
}
