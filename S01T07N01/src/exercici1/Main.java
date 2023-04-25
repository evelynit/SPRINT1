package exercici1;

public class Main {
	@SuppressWarnings("deprecation")
	
	public static void main(String[] args) {
		//Ejercicio 1
		OnlineWorker onlineWorker = new OnlineWorker("Ana", "Lopez", 20);
		FaceToFaceWorker FTFworker = new FaceToFaceWorker("Maria", "Gomez", 25);
		
		int hoursWorked = 160;
		onlineWorker.calculateSalary(hoursWorked);
		FTFworker.calculateSalary(hoursWorked);
		
		//Ejercicio 2: Llamamos a los métodos obsoletos
		onlineWorker.formerMethodSalary(hoursWorked);
		FTFworker.formerMethodSalary(hoursWorked);
	}

}
