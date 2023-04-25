package exercici1;

public abstract class Worker {
	private String name;
	private String surname;
	private double pricePerHour;
	
	public Worker(String name, String surname, double pricePerHour) {
		super();
		this.name = name;
		this.surname = surname;
		this.pricePerHour = pricePerHour;
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public double getPricePerHour() {
		return pricePerHour;
	}


	public void setPricePerHour(double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}


	public abstract void calculateSalary(int hoursWorked);
	
}
