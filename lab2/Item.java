public class Item {

	private double total;
	private int amount;
	private Product product;
	private int orderId;

	//setters & getters
	public void setOrder(int i) {
		this.orderId = i;
	}
	public int getOrder() {
		return this.orderId;
	}
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


	public Item (Product p, int a) {
		product = p;
		amount = a;
		orderId = this.orderId;
	}
	public Item (int a) {
		
		amount = a;
	}

	/*public String toString() {
		return ("Product: " + "\n" + this.product  + "Amount: " + this.amount + "\n" + "Total price: " + this.getTotal() + "\n\n");
	}*/

}