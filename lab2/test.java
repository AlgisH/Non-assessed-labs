import java.util.*;

public class test {
	
	public static void main(String[] args) {
		Store store = new Store("bawStore");

		//add some products

		store.addProduct("Apple", 1.20);
		store.addProduct("Potato", 0.25);
		store.addProduct("Chips", 2.40);

		//Products

		Product apple = new Product("Apple", 1.20);
		Product potato = new Product("Potato", 0.25);
		Product chips = new Product("Chips", 2.40);

		//generate the order
		Date d = new Date();
		Order o = new Order(d);
		o.addItem(apple, 2);
		o.addItem(potato, 6);
		o.addItem(chips, 1);	

			
				

		//add the order
		
		
		//testing

		o.print();
		

	}
}