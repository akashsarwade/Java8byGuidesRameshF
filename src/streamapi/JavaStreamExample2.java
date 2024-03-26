package streamapi;

import java.util.ArrayList;
import java.util.List;

/*reduce() Method in Collection
This method takes a sequence of input elements and combines them into a single summary 
result by repeated operation. For example, finding the sum of numbers, or accumulating 
elements into a list.
In the following example, we are using reduce() method, which is used to sum of all the product prices.
*/

class Items {
	int id;
	String name;
	float price;

	public Items(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

}

public class JavaStreamExample2 {

	public static void main(String[] args) {

		List<Items> itemList = new ArrayList<>();
		itemList.add(new Items(2, "Banana", 67f));
		itemList.add(new Items(3, "Mango", 897f));
		itemList.add(new Items(4, "Oranger", 87f));
		itemList.add(new Items(5, "Chikoo", 908f));
		itemList.add(new Items(6, "Greps", 123f));
		itemList.add(new Items(7, "Cashow", 654f));

		//
		float totalPrice = itemList.stream().map(item -> item.price).reduce(0.0f, Float::sum);
		System.out.println(totalPrice);

	}

}
