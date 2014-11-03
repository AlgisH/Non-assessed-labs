package store;

import java.util.*;

public class Product {

	private String name;
	private double price;
	private Set<Item> item;

	//setters & getters
	public Product getProduct() {
		return this;
	}
	public void setName(String n) {
		this.name = n;
	}
	public void setPrice(double d) {
		this.price = d;
	}
	public String getName() {
		return this.name;
	}
	public double getPrice() {
		return this.price;
	}


	//constructors
	public Product(String n, double p) {
		item = new HashSet(); //purpose??
		name = n;
		price = p;
	}
	public Product(Product p) {
		name = p.name;
		price = p.price;
	}


	//methods
	public void addItem(Item i) {
		this.item.add(i);
	}
	public void removeItem(Item i) {
		if (this.item.contains(i)) this.item.remove(i);
	}

}