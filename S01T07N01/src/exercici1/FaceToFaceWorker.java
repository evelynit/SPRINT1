package exercici1;

public class FaceToFaceWorker extends Worker{
	private static float fuel = 100;
	
	public FaceToFaceWorker(String name, String surname, double pricePerHour) {
		super(name, surname, pricePerHour);
	}

	public static float getFuel() {
		return fuel;
	}

	public static void setFuel(float fuel) {
		FaceToFaceWorker.fuel = fuel;
	}
	
	@Override
	public void calculateSalary(int hoursWorked) {
		double salary = (hoursWorked * getPricePerHour()) + fuel;
		System.out.println("Sueldo trabajador presencial: " + salary + " euros");
	}

	//Ejercicio 2
	@Deprecated
	public void formerMethodSalary(int hoursWorked) {
		double salary = hoursWorked * getPricePerHour();
		System.out.println("Sueldo trabajador online: " + salary + " euros");
	}
	
	@Override
	public String toString() {
		return "FaceToFaceWorker [getName()=" + getName() + ", getSurname()=" + getSurname() + ", getPricePerHour()="
				+ getPricePerHour() + "]";
	}
	
}
