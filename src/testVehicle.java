import java.util.Scanner;

public class testVehicle {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String make,model,fuel;
		int year;
		
		System.out.println("Does your vehicle have an engine (1 for yes, 0 for no): ");

		
		if (input.nextInt() == 1) {
			input.nextLine();
			
			System.out.println("Enter your cars' producer: ");
			make = input.nextLine();
		
			System.out.println("Enter your cars' model: ");
			model = input.nextLine();
		
			System.out.println("Enter your cars' model year: ");
			year = input.nextInt();
			input.nextLine();
			
			System.out.println("Enter your cars' fuel: ");
			fuel = input.nextLine();
		
			enginePoweredVehicle v1 = new enginePoweredVehicle(make, model, year, fuel);
			v1.displayInfo();
			v1.fuel(make, model, fuel);
			
			v1 = null;
		}
		else {
			input.nextLine();
			
			System.out.println("Enter your vehicles' producer: ");
			make = input.nextLine();
	
			System.out.println("Enter your vehicles' model: ");
			model = input.nextLine();
	
			System.out.println("Enter your vehicles' model year: ");
			year = input.nextInt();
			input.nextLine();
	
			personPoweredVehicle v2 = new personPoweredVehicle(make, model, year);
			v2.displayInfo();
			
			v2 = null;
		}
	}

}
