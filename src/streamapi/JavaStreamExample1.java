package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
	int id;
	String name;
	int price;

	public Product(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

}

public class JavaStreamExample1 {

	public static void main(String[] args) {
		List<Product> prodList = new ArrayList<>();

		// adding products
		prodList.add(new Product(11, "SAMSUNG", 430));
		prodList.add(new Product(12, "1+", 51000));
		prodList.add(new Product(13, "MOTOROLA", 5000));
		prodList.add(new Product(14, "OOPPO", 500));
		prodList.add(new Product(15, "VIVO", 500));

		List<Integer> prodPriceList = prodList.stream().filter(p -> p.price > 100)// filtering data
				.map(p -> p.price)// fetching price
				.collect(Collectors.toList());// collecting as a list
		System.out.println(prodPriceList);
	}
}
