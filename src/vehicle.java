
abstract class vehicle {
	
	//Encapsulation
	private String make;
	private String model;
	private int yearModel;
	private boolean hasEngine;
	
	public vehicle(String make, String model, int yearModel, boolean hasEngine) {
		this.make = make;
		this.model = model;
		this.yearModel = yearModel;
		this.hasEngine = hasEngine;
	}
	
	//Getters	
	public String getMake() {
		return this.make;
	}
	public String getModel() {
		return this.model;
	}
	public int getYearModel() {
		return this.yearModel;
	}
	
	//Setters	
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}
	
	//Abstraction
	abstract void move();
	abstract void fuel();
	
	void displayInfo() {
		System.out.println("Your vehicle info: ");
		System.out.println("Producer: " + getMake());
		System.out.println("Model: " + getModel());
		System.out.println("Year Model: " + getYearModel());
		move();
		fuel();
	}

}