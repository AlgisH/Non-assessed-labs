package store;

import java.util.*;

public class Store {

	private String name;
	private Set<Product> products;
	private Set<Order> orders;

	

		/*Store mystore = new Store("Amazon");

		Product p1 = new Product("crisps", 0.30);
		mystore.addProduct(p1.getName(), p1.getPrice());

		Product p2 = new Product("marshmallows", 0.10);
		mystore.addProduct(p2.getName(), p2.getPrice());
		
	
	

		Item i1 = new Item(2);
		i1.setProduct(p1);

		Order o1 = mystore.addOrder(new Date());

		o1.addItem(i1.getProduct(), i1.getAmount());

		Item i2 = new Item(5);
		i2.setProduct(p2);
		o1.addItem(i2.getProduct(), i2.getAmount());
				
		Order o2 = mystore.addOrder(new Date());
		


		
		
		Item i3 = new Item(1);
		i3.setProduct(p1);
		o2.addItem(i3.getProduct(), i3.getAmount());
*/

		

	

	//setters & getters

	public void setName(String n) {
		this.name = n;
	}
	public String getName() {
		return this.name;
	}
	
	
	//constructors
	public Store(String n) {
		name = n;
		products = new HashSet();
		orders = new HashSet();
	}


	//methods
	public Order addOrder(Date d) {
		Order or = new Order(d);
		orders.add(or);
		return or;
		
	}

	public Product addProduct(String name, double price) {
		Product p = new Product(name, price);
		products.add(p);
		return p;
	}
	public void print(){
		for (Order o : this.orders) {
			o.print();
		}
	}	
}