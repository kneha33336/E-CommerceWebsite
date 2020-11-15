package main;

import storage.*;
import seller.*;
import buyer.*;
import product.*;

public class Main {

	public static void main(String[] args) {
		StorageService storageService = new StorageServiceImplem();
		
		SellerService sellerService = new SellerServiceImplem(storageService);
		
		Seller seller1 = new Seller(null, "", "");
		sellerService.registerSeller(seller1);
		
		Seller seller2 = new Seller("Neha", "+91", "8003147853");
		sellerService.registerSeller(seller2);
		
		sellerService.registerSeller(seller2);
		
		BuyerService buyerService = new BuyerServiceImplem(storageService);
		Buyer buyer1 = new Buyer(null, "", "");
		buyerService.registerBuyer(buyer1);
		
		Buyer buyer2 = new Buyer("Riya", "+91", "9304128395");
		buyerService.registerBuyer(buyer2);
		
		buyerService.registerBuyer(buyer2);
		
		ProductService productService = new ProductServiceImplem(storageService);
		Product product1 = new Product("T-Shirt", "This t-shirt from Levis.", "+918003147853", 10, 1000D);
		productService.registerProduct(product1);
	}

}
