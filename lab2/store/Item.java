package store;

public class Item {

	private double total;
	private int amount;
	private Product product;

	//setters & getters
	
	public void setAmount(int a) {
		this.amount = a;
	}
	public int getAmount() {
		return this.amount;
	}
	public void setProduct(Product p) {
		this.product = p;
	}
	public Product getProduct() {
		return this.product;
	}
	public double getTotal() {
		total = this.amount * product.getPrice();
		return total;
	}


	//constructors
	public Item (Product p, int a) {
		product = p;
		amount = a;
	
	}
	public Item (int a) {
		
		amount = a;
	}

}