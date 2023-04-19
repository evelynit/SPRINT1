package exercici2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca su número de DNI: ");
        String numberDniString = scanner.nextLine();
             
        
        if(numberDniString.length() != 8) {
        	System.out.println("El número de Dni debe tener 8 dígitos.");
        	return; // Termina la ejecución del método main
        }
        
        int numberDni;
        
        try {
        	numberDni = Integer.parseInt(numberDniString);
        	
        }catch (NumberFormatException e) {
        	System.out.println("El número de Dni deber contener únicamente dígitos.");
        	return;
        }
 
        CalculateDni calculateDni = new CalculateDni();
        char letterDni = calculateDni.calculateDniLetter(numberDni);

        System.out.println("La letra de su DNI es: " + letterDni);
        
        // Verificar si el cálculo de la letra es correcto usando la clase de test
        DniTest test = new DniTest();
        test.testCalculateLetter(numberDni, 'J'); //Si numbedni = 31922978
	}
        

}
