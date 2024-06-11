package Entidades;

public class Food extends Product {
	// Creation of variables corresponding to each child
	private String unitOfSale;

	// Builder
	public Food(String name, double price,String unitOfSale) {
		super(name, price);
		this.unitOfSale = unitOfSale;
	}

	// Method creation
	public String toString() {
		return "||Nombre: " + name +  "\n||Precio: $" + price + "\n||Unidada de venta: ";
	}

}
