package Entidades;

public class Cleaning extends Product{
	
	//Creation of variables corresponding to each child
	private String contentInCm3;
	
	//Builder
	public Cleaning(String name,String contentInCm3 ,double price) {
		super(name, price);
		this.contentInCm3 = contentInCm3;
	}
	
	//Method creation
	public String toString() {
		return "||Nombre: " + name + "\n||Contenido: " + contentInCm3 + "\n||Precio: $" + price;
	}

	public String getContentInCm3() {
		return contentInCm3;
	}

	public void setContentInCm3(String contentInCm3) {
		this.contentInCm3 = contentInCm3;
	}

	

	
}
