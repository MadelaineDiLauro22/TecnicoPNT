package Entidades;

public abstract class Product implements Comparable<Product> {
	
	//creation of variables
	protected String name;
	protected double price;
	
	//Builder
	public Product(String name,double price) {
		this.name = name;
		this.price = price;
	}
	
	//Method creation
	public int compareTo(Product productoNuevo) {
		return Double.compare(this.price,productoNuevo.price);
	}
	
	@Override
	public String toString() {
		return "||Nombre: " + name + "\n||Precio: $" + price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

	
	
	
}
