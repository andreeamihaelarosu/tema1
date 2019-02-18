//Inheritance
public class personPoweredVehicle extends vehicle{
	
	public personPoweredVehicle(String make, String model, int yearModel) {
		super(make, model, yearModel, false);
	}
	
	//Abstraction
	public void move(){
		System.out.println("This vehicle is powered by human.");
	}

	public void fuel(){
		System.out.println("This vehicle does not require fuel.");
	}

}
