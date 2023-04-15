package exercici1;

public class Main {

	public static void main(String[] args) {
		
		Sale venta = new Sale();
		
		Sale venta2 = new Sale();
		Product product1 = new Product("Chocolate", 2);
		Product product2 = new Product("Leche", 10);
		venta2.addProduct(product1);
		venta2.addProduct(product2);
		
		Sale venta3 = new Sale();
		
        venta.calculateTotal();
        venta2.calculateTotal();
        venta3.calculateTotal();
    
        //Provocar ArrayIndexOutOfBoundsException
        try {
        	System.out.println(venta2.getProducts().get(3));
        } catch (IndexOutOfBoundsException e) {
        	String message = "No existe esa posición en la lista";
        	System.out.println("Error ArrayIndexOutOfBoundsException: " + message);
        }
	}

}
