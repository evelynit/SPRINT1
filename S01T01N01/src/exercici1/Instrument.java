package exercici1;

public abstract class Instrument {
	//Attributes
	private String name;
	private double price;

	//Constructors
	public Instrument() {};
	
	public Instrument(String name, double price) {
		this.name = name;
		this.price = price;
	}

	//Setters & Getters 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	//Abstract method
	public abstract  void play();
	
}
