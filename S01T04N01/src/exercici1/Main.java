package exercici1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> months = new ArrayList<String>();
		months.add("Enero");
		months.add("Febrero");
		months.add("Marzo");
		months.add("Abril");
		months.add("Mayo");
		months.add("Junio");
		months.add("Julio");
		months.add("Agosto");
		months.add("Septiembre");
		months.add("Octubre");
		months.add("Noviembre");
		months.add("Diciembre");
		
		TestMonth test = new TestMonth();
		
		//Pruebas
		test.testMonthsSize(months);
		test.testAugustIn8(months);
	}

}
