package exercici5;

public class Main {

	public static void main(String[] args) {
		//Expresión Lambda implementa el método getPiValue() de la interface PiProvider
		//NO necesita param de entrada, por es () 
		PiProvider piProvider = () -> 3.1415; 
		System.out.println(piProvider.getPiValue());
		
		
		/**Sin expressión lambda
		 PiProvider piProvider = new PiProvider() {
    			@Override
    			public double getPiValue() {
        				return 3.1415;
    			}
};
		 */
	}

}
