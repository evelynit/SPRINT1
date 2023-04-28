/**
 * 
 */
package exercici1;

public class GenericMethods {
	
	public static <T,U> void printGenericArgsV2(T arg1, U arg2, String arg3) {
		System.out.println("Argumento 1: " + arg1); 
		System.out.println("Argumento 2: " + arg2);
		System.out.println("Argumento 3: " + arg3);

	}
}
