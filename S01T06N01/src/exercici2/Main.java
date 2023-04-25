package exercici2;

public class Main {

	public static void main(String[] args) {

		Person person = new Person("Ana", "Lopez", 25);
		String message = "Hola";
		int number = 100;
		
        //Llamamos al método genèrico con un objeto Person, un String y un entero
		GenericMethods.printGenericArgs(person, message, number);
        
		//Llamamos al método genèrico con un objeto un String, un entero y obj Person
		GenericMethods.printGenericArgs(message, number, person);

	}

}
