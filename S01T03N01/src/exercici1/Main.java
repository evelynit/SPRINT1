package exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		ArrayList<Month> months = new ArrayList<>();
		
		String[] nameMonths = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio","Septiembre", "Octubre", "Noviembre", "Diciembre"};
		
		for (int i = 0; i < nameMonths.length; i++ ) {
			months.add(new Month(nameMonths[i]));
		}
		
		// Insertar agosto en la posición correcta
        Month august = new Month("Agosto");
        int position = 7;
        months.add(position, august);
        
        // Mostrar el contenido del ArrayList
        System.out.println("Mostrar el contenido del ArrayList...");
        for (Month month : months) {
            System.out.println(month != null ? month.getName() : "null");
        }
        
        // Convertir el ArrayList en un HashSet
        HashSet<Month> monthSet = new HashSet<>(months);

        // Mostrar el contenido del HashSet (se imprime aleatoriamente)
        System.out.println("\nMostrar el contenido del HashSet...");
        for (Month month : monthSet) {
            System.out.println(month != null ? month.getName() : "null");
        }
        
        // Recorrer el ArrayList con un for
        System.out.println("\nRecorrer el ArrayList con un for...");
        for (int i = 0; i < months.size(); i++) {
            Month month = months.get(i);
            System.out.println(month != null ? month.getName() : "null");
        }
        
        // Recorrer el ArrayList con un iterador
        System.out.println("\nRecorrer el ArrayList con un iterador...");
        Iterator<Month> iterator = months.iterator();
        while (iterator.hasNext()) {
            Month month = iterator.next();
            System.out.println(month != null ? month.getName() : "null");
        }
        
	}

}
