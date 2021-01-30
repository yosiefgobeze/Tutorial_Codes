package january.vehicles;

/**
 * 
 * @author yosief
 *
 */
public class Driver {

	public static void main(String[] args) {
		
		System.out.println("A simple code to create an object of a class!");
		// method call
		promptUser();
	}
	
	/**
	 * Will prompt the user
	 */
	public static void promptUser() {
		// create an object of type Vehicle, and store it in the variable myVehicle
		Vehicle myVehicle = new Vehicle();
		
		// set the attributes in myVehicle object
		myVehicle.setGallonsOfGas(12.0);
		myVehicle.setMillesPerGallon(20);
		myVehicle.setOdometer(1000);
		
		// move the vehicle
		myVehicle.go(40);
		
		// now print the current state of the vehicle, state means the values of the vehicles attributes
		System.out.println(myVehicle.toString());
	}

}
