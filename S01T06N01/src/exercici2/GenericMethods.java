package exercici2;

public class GenericMethods {
	
	//Generics in method
	public static <T, U, V> void printGenericArgs(T obj1, U obj2, V obj3) {
		 System.out.println("Argumento 1: " + obj1);
	     System.out.println("Argumento 2: " + obj2);
	     System.out.println("Argumento 3: " + obj3);

	}
}
