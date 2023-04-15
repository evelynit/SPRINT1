package exercici2;

public class main {
	public static void main(String[] args) {

		//Para invocar el método estático (usando el nombre de la clase):
		Car.braking();

		//Para invocar el método no estático (Instanciando un objeto de la clase coche) 		
		Car miCoche = new Car(150);
		Car.setModel("Serie 3");
		miCoche.accelerate();
		System.out.println(Car.getBrand() + " " + Car.getModel() + " " + miCoche.getPower() + " CV");
	}
}
