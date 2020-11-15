package booking;

public class Booking {
	private String id;
	private String productId;
	private String buyerId;
	
	public Booking(String id, String productId, String buyerId){
		this.id = id;
		this.productId = productId;
		this.buyerId = buyerId;
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getProductId() {
		return this.productId;
	}
	
	public String getBuyerId() {
		return this.buyerId;
	}
}
