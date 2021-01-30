package january.vehicles;

public class Vehicle {
	
	// attributes for the class Vehicle
	private int odometer;
	private int millesPerGallon;
	private double gallonsOfGas;
	
	// Getter and Setter methods for the attributes
	public int getOdometer() {
		return odometer;
	}
	public void setOdometer(int odometer) {
		this.odometer = odometer;
	}
	public int getMillesPerGallon() {
		return millesPerGallon;
	}
	public void setMillesPerGallon(int millesPerGallon) {
		this.millesPerGallon = millesPerGallon;
	}
	public double getGallonsOfGas() {
		return gallonsOfGas;
	}
	public void setGallonsOfGas(double gallonsOfGas) {
		this.gallonsOfGas = gallonsOfGas;
	}
	
	/**
	 * 
	 * @param distance
	 */
	public void go(int distance) {
		// compute the gallons of gas consumed on the trip
		double gallonsConsumed = distance / millesPerGallon;
		
		// subtract the gallons consumed from the available gallons of gas
		gallonsOfGas = gallonsOfGas - gallonsConsumed;
		
		// increment the odometer by the milles traveled
		odometer = odometer + distance;
	}
	
	@Override
	public String toString() {
		// the String returned will represent the state of the object
		return "Gallons of Gas: " + getGallonsOfGas() + " Odometer read: " + getOdometer();
	}
	
}
