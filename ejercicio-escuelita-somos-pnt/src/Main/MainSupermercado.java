package Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Entidades.*;

public class MainSupermercado {
	public static void main(String[] args) {

		List<Product> products = loadProducts();
		printProducts(products);
		printMostExpensiveAndCheapest(products);
	}

	public static List<Product> loadProducts() {
		List<Product> products = new ArrayList<>();
		products.add(new Drink("Coca- Cola Zero", 1.5, 20));
		products.add(new Drink("Coca- Cola", 1.5, 18));
		products.add(new Cleaning("Shampoo Sedal", "500 ml", 19));
		products.add(new Food("Frutilla", 64, "Kilogramos"));
		return products;
	}

	public static void printProducts(List<Product> products) {
		for (Product product : products) {
			System.out.println(product);
		}
		System.out.println("=============================");
	}

	public static void printMostExpensiveAndCheapest(List<Product> products) {
		Product mostExpensive = Collections.max(products);
		Product cheapest = Collections.min(products);

		System.out.println("Producto mas caro: " + mostExpensive.getName());
		System.out.println("Producto mas barato: " + cheapest.getName());
	}

}
