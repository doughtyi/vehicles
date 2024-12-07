/*
 * David Doughty
 * CSCE 145 001
 */
public class Car extends Vehicle{
	private double mileage; // gas mileage in gallons
	private int passengers; // number of passengers
	
	// default constructors
	public Car() {
		this.mileage = 0;
		this.passengers = 0;
	}
	
	//param constructor
	public Car(String manuName, int cylinders, String ownersName, double mileage, int passengers) {
		super(manuName, cylinders, ownersName);
		//input validation
		if(mileage < 0 || passengers < 0) {
			System.out.println("Gas mileage/passenger number cannot be negative!");
			System.exit(0);
		}
		this.mileage = mileage;
		this.passengers = passengers;
	}
	
	// accessors
	public double getmileage() {
		return mileage;
	}
	
	public int getpassengers() {
		return passengers;
	}
	
	// mutators
	public void setmileage(double mileage) {
		//input validation
		if(mileage < 0) {
			System.out.println("Gas mileage cannot be negative.");
			System.exit(0);
		}
		this.mileage = mileage;
	}
	
	public void setpassengers(int passengers) {
		//input validation
		if (passengers < 0){
			System.out.println("Number of passengers cannot be negative.");
			System.exit(0);
		}
		this.passengers = passengers;
	}
	
	// toString method
	
	public String toString() {
		return super.toString() + "\n" + "Gas mileage: " + mileage + " gallons \n" + "Number of passengers: " + passengers;
	}
	

}
