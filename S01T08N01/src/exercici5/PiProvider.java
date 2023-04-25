package exercici5;

@FunctionalInterface
public interface PiProvider {
	double getPiValue(); //metodo abstracto
	
	/**las interfaces funcionales, que son un tipo especial 
	 * de interfaces introducidas en Java 8, deben tener exactamente 
	 * un método abstracto. Estas interfaces se utilizan para expresiones 
	 * lambda y referencias de métodos, y pueden tener métodos por defecto 
	 * y métodos estáticos además del único método abstracto requerido.
	 */
}
