/*
 * David Doughty
 * CSCE 145 001
 */
public class Truck extends Vehicle {
	private double loadCap; // loading capacity in tons
	private double towCap; // towing capacity in tons
	
	// default constructors
	public Truck(String manuName, int cylinders, String ownersName, double loadCap, double towCap) {
		super(manuName, cylinders, ownersName);
		//input validation
		if (loadCap < 0 || towCap < 0) {
			System.out.println("Load/Towing capacities cannot be negative!");
			System.exit(0);
		}
		this.loadCap = loadCap;
		this.towCap = towCap;
	}
	
	// accessors
	public double getloadCap() {
		return loadCap;
	}
	
	public double gettowCap() {
		return towCap;
	}
	
	//mutators
	public void setloadCap(double loadCap) {
		//more input validation
		if (loadCap < 0) {
			System.out.println("Load capacity cannot be negative.");
			System.exit(0);
		}
		this.loadCap = loadCap;
	}
	
	public void settowCap(double towCap) {
		//even more input validation ...!
		if (towCap < 0) {
			System.out.println("Tow capacity cannot be negative.");
			System.exit(0);
		}
		this.towCap = towCap;
	}
	
	//toString method
	
	public String toString() {
		return super.toString() + "\n" + "Load capacity: " + loadCap + " tons \n" + "Towering capacity: " + towCap + " tons";
	}

	
}
