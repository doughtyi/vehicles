/*
 * David Doughty
 * CSCE 145 001
 */
public class Vehicle {
	private String manuName; //manufacturer name
	public int cylinders; // # of cylinders ( > 0 )
	private String ownersName; // owner name
	
	
	// default constructors
	public Vehicle(){
		this.manuName = "DefaultManuName";
		this.cylinders = 1; // must be greater than zero
		this.ownersName = "DefaultOwnerName";
		
	}
	
	// param constructors
	
	public Vehicle(String manuName, int cylinders, String ownersName) {
		//input validation
		if (cylinders <= 0) {
			System.out.println("Number of cylinders must be greater than zero.");
			System.exit(0);
		}
		this.manuName = manuName;
		this.cylinders = cylinders;
		this.ownersName = ownersName; 
	}
	
	//accessors
	public String getmanuName() {
		return manuName;
	}
	
	public int getcylinders() {
		return cylinders;
	}
	
	public String getownersName() {
		return ownersName;
	}
	
	//mutators
	public void setmanuName(String manuName) {
		this.manuName = manuName;
	}
	
	public void setcylinders(int cylinders) {
		this.cylinders = cylinders;
	}
	
	public void setownersName(String ownersName) {
		this.ownersName = ownersName;
	}
	
	//toString method
	public String toString() {
		return "Manufacturer's name: " + manuName + "\n" + "Number of cylinders: " + cylinders + "\n" + "Owner's name:" + ownersName;
	}
	
	

}
