package storage;

import java.util.*;

import booking.Booking;
import buyer.Buyer;
import product.Product;
import seller.Seller;

public class StorageServiceImplem implements StorageService{

	Map<String, Seller> sellers;
	Map<String, Buyer> buyers;
	Map<String, Product> products;
	Map<String, Booking> bookings;
	
	public StorageServiceImplem(){
		this.sellers = new HashMap<>();
		this.buyers = new HashMap<>();
		this.products = new HashMap<>();
	}
	
	public boolean registerSeller(Seller seller) {
		if(seller == null || seller.equals("") || seller.getId() == null || seller.getId().equals("")) {
			System.out.println("Invalid seller");
			return false;
		}
		
		if(sellers.containsKey(seller.getId())) {
			System.out.println("Seller is already registered");
			return false;
		}
		
		sellers.put(seller.getId(), seller);
		System.out.println("Seller with id " + seller.getId() + " got registered successfully");
		return true;
	}

	public boolean registerBuyer(Buyer buyer) {
		if(buyer == null || buyer.equals("") || buyer.getId() == null || buyer.getId().equals("")) {
			System.out.println("Invalid buyer");
			return false;
		}
		
		if(buyers.containsKey(buyer.getId())) {
			System.out.println("Buyer is already registered");
			return false;
		}
		
		buyers.put(buyer.getId(), buyer);
		System.out.println("Buyer with id " + buyer.getId() + " got registered successfully");
		return true;
	}
	
	public boolean registerProduct(Product product) {
		if(product == null || product.equals("") || product.getId() == null || product.getId().equals("")) {
			System.out.println("Invalid buyer");
			return false;
		}
		
		if(buyers.containsKey(product.getId())) {
			System.out.println("Product is already registered");
			return false;
		}
		
		products.put(product.getId(), product);
		System.out.println("Product with id " + product.getId() + " got registered successfully");
		return true;
	}
	
	public boolean orderProduct(Booking booking) {
		if(booking == null || booking.equals("") || booking.getId() == null || booking.getId().equals("")) {
			System.out.println("Invalid buyer");
			return false;
		}
		
		if(bookings.containsKey(booking.getId())) {
			System.out.println("Product is already registered");
			return false;
		}
		
		bookings.put(booking.getId(), booking);
		System.out.println("Product with id " + booking.getId() + " got registered successfully");
		return true;
	}
	
	public List<Product> getBuyerProducts(String buyerId) {
		List<Product> buyerProductList = new ArrayList<>();
		if(buyerId == null || buyerId.equals("") || !buyers.containsKey(buyerId)) {
			System.out.println("Invalid buyer");
			return buyerProductList;
		}
		for(Map.Entry<String, Booking> booking : bookings.entrySet()) {
			if(booking.getValue().getBuyerId().equals(buyerId)) {
				Product product = products.get(booking.getValue().getProductId());
				System.out.println("Product with id " + product.getId() + " is bought by buyer with id " + buyerId);
			}
		}
		return buyerProductList;
	}
}
