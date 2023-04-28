/**
 * 
 */
package exercici2;

public class GenericMethods {
	
	@SafeVarargs
	public static <T> void printGenericArgsV3(T... args) {
		
		for(int i = 0; i < args.length; i++) {
			System.out.println("Argumento " + (i+1) + ": " + args[i]); 
		}
	}
}
