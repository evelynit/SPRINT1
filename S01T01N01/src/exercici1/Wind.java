package exercici1;

public class Wind extends Instrument{
	//Constructors
    public Wind() {
		super();
	}

	public Wind(String name, double price) {
		super(name, price);	
	}

	@Override
	
	//Abstract method
	public void play() {
		System.out.println("Esta sonando un instrumento de viento");
	}

	// Bloque de inicialización estático
    static {
        System.out.println("Se ha cargado la clase viento");
    }
    
    // Bloque de inicialización de instancia
    {
        System.out.println("Se ha creado una instancia de la clase viento");
    }
}
