package exercici1;
import java.util.ArrayList;
import java.util.List;

public class Sale {
	private List<Product> products;
	private double totalPrice;
	
	public Sale() {
		this.products = new ArrayList<>();
	}
	
	public void addProduct(Product product) {
        products.add(product);
    }
	
	public void calculateTotal() { //throws EmptySaleException
		try {
			if (products.isEmpty()) {
				throw new EmptySaleException("No existen productos en la venta. Debes añadir al menos 1 producto");
			}

			totalPrice = 0;
			for (Product product : products) {
				totalPrice += product.getPrice();
			}
			System.out.println("El precio total de la venta es " + totalPrice + "€");
		} catch (EmptySaleException e) {
			System.out.println("Error EmptySaleException: " + e.getMessage());
		}
    }

	//Getters
	public List<Product> getProducts() {
		return products;
	}

	public double getTotalPrice() {
		return totalPrice;
	}
	
}
