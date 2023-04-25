package exercici3;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> months = Arrays.asList("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre");
		
		months.forEach(m -> System.out.println(m));
	}
}
