package exercici1;

public class Percussion extends Instrument{
	public Percussion() {
		super();
	}

	public Percussion(String name, double price) {
		super(name, price);
	}

	@Override
	public void play() {
		System.out.println("Esta sonando un instrumento de percusion");	
	}

	// Bloque de inicialización estático
    static {
        System.out.println("Se ha cargado la clase percusion");
    }
    
    // Bloque de inicialización de instancia
    {
        System.out.println("Se ha creado una instancia de la clase percusion");
    }
}
