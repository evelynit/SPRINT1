package exercici2;


public class Main {

	public static void main(String[] args) {
		Person person = new Person("Ana", "Lopez", 25);
		String message = "Mundo";
		int number1 = 001;
		int number2 = 002;
		int number3 = 003;


		//Llamamos al método genérico v3
		GenericMethods.printGenericArgsV3(person, message, number1, number2, number3);
	}

}
