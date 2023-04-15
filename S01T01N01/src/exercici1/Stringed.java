package exercici1;

public class Stringed extends Instrument{
	
	//Attributes
    protected static int count = 10; //Static member variable
    
    //Constructors
	public Stringed() {
		super();
	}

	public Stringed(String name, double price) {
		super(name, price);
	}

	@Override
	public  void play() {
		System.out.println("Esta sonando un instrumento de cuerda");
		
	}

	// Bloque de inicialización estático
    static {
        System.out.println("Se ha cargado la clase cuerda");
    }
    
    // Bloque de inicialización de instancia
    {
        System.out.println("Se ha creado una instancia de la clase cuerda");
    }
    
}
