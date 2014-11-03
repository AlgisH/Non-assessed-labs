import java.util.*;

public class Store {

	private String name;
	private Set<Product> products;
	private Set<Order> orders;

	public static void main(String[] args) {
/*
		Store store = new Store("bawStore");

		//add some products

		Date d1 = new Date();
		store.addOrder(d1).addItem(store.addProduct("Apple", 1.20), 3);
		Date d2 = new Date();
		store.addOrder(d2).addItem(store.addProduct("Potato", 0.25), 4);
		Date d3 = new Date();
		store.addOrder(d3).addItem(store.addProduct("Chips", 2.40), 2);

		

		for (int i=0; i<store.orders.size(); i++) {
			store.orders.print();
		}*/

		Store store = new Store("Amazon");

		Product p1 = new Product("crisps", 0.30);
		store.addProduct(p1.getName(), p1.getPrice());

		Product p2 = new Product("marshmallows", 0.10);
		store.addProduct(p2.getName(), p2.getPrice());
		
		Order o1 = new Order(new Date());
		store.addOrder(o1.getDate());

		Item i1 = new Item(2);
		i1.setOrder(o1.getOrder());
		i1.setProduct(p1.getProduct());
		
		Item i2 = new Item(5);
		i2.setOrder(o1.getOrder());
		i2.setProduct(p2.getProduct());
				
		Order o2 = new Order(new Date());
		store.addOrder(o2.getDate());
		
		Item i3 = new Item(1);
		i3.setOrder(o2.getOrder());
		i3.setProduct(p1.getProduct());

		// created orders
		for (Order o : store.orders) {
			o.print();		
		
		}
	}

	//setters & getters

	public void setName(String n) {
		this.name = n;
	}
	public String getName() {
		return this.name;
	}
	
	

	public Store(String n) {
		name = n;
		products = new HashSet();
		orders = new HashSet();
	}

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
}