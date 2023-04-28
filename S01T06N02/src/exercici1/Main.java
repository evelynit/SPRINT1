package exercici1;


public class Main {

	public static void main(String[] args) {
		Person person = new Person("Ana", "Lopez", 25);
		int number = 001;
		String message = "Mundo";

		//Llamamos al método genérico v2 
		GenericMethods.printGenericArgsV2(person, number, message);
	}

}
