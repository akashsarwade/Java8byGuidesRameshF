package com.java8.javaguide.stream.api.crash.course;

import java.util.ArrayList;
import java.util.List;

public class StreamFilterExample {

	public static void main(String[] args) {

		List<Product> prod = new ArrayList<Product>();
		for (Product product : getProducts()) {
			if (product.getPrice() > 24000f) {
				prod.add(product);
			}
		}
		
		for (Product product : prod) {
			System.out.println(product);
		}
	}
	
	

	private static List<Product> getProducts() {
		List<Product> listOfProd = new ArrayList<Product>();
		listOfProd.add(new Product(1, "HP", 243565.3f));
		listOfProd.add(new Product(2, "LENOVO", 243565.3f));
		listOfProd.add(new Product(3, "DELL", 243565.3f));
		listOfProd.add(new Product(4, "ASUS", 2543565.3f));
		listOfProd.add(new Product(5, "SONY", 4243565.3f));
		listOfProd.add(new Product(6, "MAC", 1243565.3f));

		return listOfProd;

	}

}

class Product {
	private int id;
	private String name;
	private float price;

	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}
