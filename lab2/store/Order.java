package store;

import java.util.*;

public class Order {

	private Date date;
	private final int orderId;
	private static int counter = 0;
	private List<Item> list;

	//setters & getters

	public Date getDate() {
		return this.date;
	}
	public int getOrder() {
		return this.orderId;
	}
	

	//constructors
	public Order(Date d) {
		date = d;
		list = new ArrayList();
		orderId = counter ++;
	}
	/*public Order(Order o) {
		date = o.date;
		list = o.list;
		orderId = o.orderId;
	}*/


	//methods
	public void addItem(Product p, int amount) {
		Item i = new Item(p, amount);
		list.add(i);
	}

	public void removeItem(Product p) {
		for (int i=0; i<list.size(); i++) {
			if(list.get(i).getProduct() == p) list.remove(list.get(i));
		}
	}

	public void print() {
		System.out.println("order: " + this.orderId + ", date: " + this.date.toString());
		for (int i = 0; i<this.list.size(); i++) {
			System.out.println("	item " + i + ": " + this.list.get(i).getAmount() + 
					" unit(s) of '" + this.list.get(i).getProduct().getName() + "' - £" + 
					this.list.get(i).getTotal());
		}
	}




}