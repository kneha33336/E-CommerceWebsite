package buyer;

import product.Product;
import storage.StorageService;

public class BuyerServiceImplem implements BuyerService{
	
	StorageService storageService;
	
	public BuyerServiceImplem(StorageService storageService){
		this.storageService = storageService;
	}
	
	public boolean registerBuyer(Buyer buyer) {
		return storageService.registerBuyer(buyer);
	}
	
	public boolean addToCart(Product product, Buyer buyer) {
		buyer.getProductInCart().add(product.getId());
		System.out.println("Product with id " + product.getId() + " successfully added for the buyer with id " + buyer.getId());
		return true;
	}
}
