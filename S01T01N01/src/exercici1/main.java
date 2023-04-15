package exercici1;

public class main {
	public static void main(String[] args) {
		
		//Caso 1: Creación de una instancia de la clase
		Wind instrument1 = new Wind("Flauta", 100.0);        
        instrument1.play();
        
        Wind instrument2 = new Wind("Clarinete", 200.0);
        instrument2.play();
        
        //Caso 2: Acceso a un miembro estático de la clase
        System.out.println(Stringed.count);
	}
}
