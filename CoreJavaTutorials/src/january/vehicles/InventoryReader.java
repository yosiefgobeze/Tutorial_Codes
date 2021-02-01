package january.vehicles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class InventoryReader {
	public static void main(String[] args) {
		readAndRunVehicle();
		
	}

	/**
	 * Read vehicle data from a file, populate a vehicle object with that data
	 */
	public static void readAndRunVehicle() {
		Vehicle inventoryVehicle = vehicleFactory();
		
		runVehicle(inventoryVehicle);
		
	}

	/**
	 * Take a vehicle and run it a given distance. Print out before and after
	 * @param inventoryVehicle : a pre-populated vehicle that is ready to run.
	 */
	public static void runVehicle(Vehicle inventoryVehicle) {
		System.out.println("Vehicle before move: " + inventoryVehicle.toString());
		
		inventoryVehicle.go(120);
		
		System.out.println("Vehicle after move: " + inventoryVehicle.toString());
	}

	/**
	 * Create a vehicle using a vehicleFactory() method, by reading a data from file.
	 * @return the created vehicle
	 */
	public static Vehicle vehicleFactory() {
		// Create a new instance of the Vehicle class
		Vehicle inventoryVehicle = new Vehicle();
	
		try {
			// using the class File, reference the inventory.txt file
			File inventoryFile = new File("C:/Users/yosie/Documents/local_repository/Tutorial_Codes/CoreJavaTutorials/src/february/file/inventory.txt");
			
			// Scanner class will read from the file
			Scanner inventoryScanner = new Scanner(inventoryFile);
			
			String nextLine = inventoryScanner.nextLine();
			
			String vehicleComponents[] = nextLine.split(",");
			
			// System.out.println(Arrays.toString(vehicleComponents));
			
			String strOdometer = vehicleComponents[0];
			System.out.println("Odometer: " + strOdometer);
			
			String strGallonsOfGas = vehicleComponents[1];
			System.out.println("Gallons of gas: " + strGallonsOfGas);
			
			String strMillesPerGallon = vehicleComponents[2];
			System.out.println("Milles per gas: " + strMillesPerGallon);
			
			
			double dblGallonsOfGas = Double.parseDouble(strGallonsOfGas);
			inventoryVehicle.setGallonsOfGas(dblGallonsOfGas);
			
			int intMillesPerGallon = Integer.parseInt(strMillesPerGallon);
			inventoryVehicle.setMillesPerGallon(intMillesPerGallon);
			
			int intOdometer = Integer.parseInt(strOdometer);
			inventoryVehicle.setOdometer(intOdometer);
			
			inventoryScanner.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			Logger.getLogger(InventoryReader.class.getName()).log(Level.SEVERE, null, e);
		
		}
		return inventoryVehicle;
	}

}
