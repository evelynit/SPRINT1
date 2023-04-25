package exercici8;

public class Main {

	public static void main(String[] args) {
		//Versión corta:  Reverser reverseString = input -> new StringBuilder(input).reverse().toString();
		/*La expresión lambda recibe un String llamado input. Se crea un objeto StringBuilder con el contenido 
		 * de input, luego se invoca el método reverse() del StringBuilder para invertir la cadena y, finalmente, 
		 * se convierte el StringBuilder invertido de nuevo en un String.
		 */
		
		Reverser reverseString = input -> {
		    StringBuilder sb = new StringBuilder(input);
		    return sb.reverse().toString();
		};
		
		String originalInput = "hola";
		String reversedInput = reverseString.reverse(originalInput); //Utilizamos la instancia de la interfaz Reverser para invoca el método reverse()
		System.out.println(reversedInput);
	}

}
