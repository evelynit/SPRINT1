package exercici1;

public class Phone {
	//Attributes
	private String brand;
	private String model;
	
	//Constructors
	public Phone(){};
	
	public Phone(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}
	
	//Setters and Getters
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	//Methods
	public void call(String number) {
		System.out.println("Llamando al número " + number);
	}
}
