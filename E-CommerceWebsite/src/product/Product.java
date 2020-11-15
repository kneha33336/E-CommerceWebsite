package product;

public class Product {
	private String id;
	private String name;
	private String description;
	private String sellerId;
	private int quantity;
	private double price;
	
	public Product(String name, String description, String sellerId, int quantity, double price){
		this.id = name + sellerId;
		this.name = name;
		this.description = description;
		this.sellerId = sellerId;
		this.quantity = quantity;
		this.price = price;
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public String getSellerId() {
		return this.sellerId;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	/*public void setName(String name) {
		this.name = name;
	}*/
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
}
