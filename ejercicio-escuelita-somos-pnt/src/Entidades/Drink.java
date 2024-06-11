package Entidades;

public class Drink  extends Product{
	//Creation of variables corresponding to each child
	private double liters;
	
	//Builder
	public Drink(String name, double liters,double price) {
		super(name, price);
		this.liters = liters;
	}

	//Method creation
	public String toString() {
		return "||Nombre: " + name + "\n||Litros: " + liters + "\n||Precio: $" + price;
	}

	public double getLiters() {
		return liters;
	}

	public void setLiters(double liters) {
		this.liters = liters;
	}
	
}
