package exercici1;

public class Smartphone extends Phone implements Camera, Clock{
	//Constructors
	public Smartphone() {
		super();
	}

	public Smartphone(String brand, String model) {
		super(brand, model);
	}

	
	@Override
	public void alarm() {
		System.out.println("Se está haciendo una foto");
	}

	@Override
	public void photograph() {
		System.out.println("Está sonando la alarma");
	}

	@Override
	public String toString() {
		return "Smartphone [getBrand()=" + getBrand() + ", getModel()=" + getModel() + "]";
	}
}
