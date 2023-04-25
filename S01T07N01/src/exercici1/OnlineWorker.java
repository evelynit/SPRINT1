package exercici1;

public class OnlineWorker extends Worker{
	private final static double INTERNET_FLAT_RATE = 50;
	
	public OnlineWorker(String name, String surname, double pricePerHour) {
		super(name, surname, pricePerHour);
	}

	@Override
	public void calculateSalary(int hoursWorked) {
		double salary = (hoursWorked * getPricePerHour()) + INTERNET_FLAT_RATE;
		System.out.println("Sueldo trabajador online: " + salary + " euros");
	}
	
	//Ejercicio 2
	@Deprecated
	public void formerMethodSalary(int hoursWorked) {
		double salary = (hoursWorked * getPricePerHour());
		System.out.println("Sueldo trabajador online: " + salary + " euros");
	}

	@Override
	public String toString() {
		return "OnlineWorker [getName()=" + getName() + ", getSurname()=" + getSurname() + ", getPricePerHour()="
				+ getPricePerHour() + "]";
	}
	
}
