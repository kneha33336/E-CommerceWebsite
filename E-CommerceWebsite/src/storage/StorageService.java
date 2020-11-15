package storage;

import java.util.*;

import booking.Booking;
import buyer.Buyer;
import product.Product;
import seller.Seller;

public interface StorageService {

	boolean registerSeller(Seller seller);
	boolean registerBuyer(Buyer buyer);
	boolean registerProduct(Product product);
	public boolean orderProduct(Booking booking);
	public List<Product> getBuyerProducts(String buyerId);
}
