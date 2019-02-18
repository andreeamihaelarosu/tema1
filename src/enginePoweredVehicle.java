//Inheritance
public class enginePoweredVehicle extends vehicle{
	
	private String fuel;
	
	public enginePoweredVehicle(String make, String model, int yearModel, String fuel) {
		super(make, model, yearModel, true);
		this.fuel = fuel;
	}
	
	//Abstraction
	public void move(){
		System.out.println("This vehicle is powered by engine.");
	}
	
	public void fuel(){
		System.out.println("This vehicle requires fuel.");
	}
	
	//Polymorphism
	public void fuel(String make, String model, String fuel){
		System.out.println("Your " + make + " " + model + " requires " + fuel + ".");
	}
	
}
