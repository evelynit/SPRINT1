package exercici2;

public class Car {
	// Attributes
	public static final String BRAND = "BMW";
	public static String model;
	public final int power;

	// Constructor
	public Car(int power) {
	    this.power = power;
	}
	
	public static String getModel() {
		return model;
	}

	public static void setModel(String model) {
		Car.model = model;
	}


	public static String getBrand() {
		return BRAND;
	}

	public int getPower() {
		return power;
	}


	// Methods
	public static void braking(){
		System.out.println("El vehículo está frenando");
	}

	public void accelerate() {
		System.out.println("El vehículo está acelerando");
	}
	

}
