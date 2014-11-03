package store;

import java.util.*;

public class Application {

	public static void main(String[] args) {

		// creation of instance according to the object diagram in Fig. 2
		Store store = new Store("Amazon");
		Product p1 = store.addProduct("crisps", 0.30);
		Product p2 = store.addProduct("marshmallows", 0.10);
		
		Order o1 = store.addOrder(new Date());
		o1.addItem(p1, 2);
		o1.addItem(p2, 5);
		Order o2 = store.addOrder(new Date());
		o2.addItem(p1, 1);
		
		// before saving
		
		
		/// store created orders in a file named 'repository'
		Repository.store(store);
		// retrieve the orders 
		Repository.retrieve();
		// add a new order 
		
		// print out the orders in the output console


	}

}
