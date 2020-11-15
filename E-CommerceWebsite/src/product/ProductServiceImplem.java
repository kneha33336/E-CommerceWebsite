package product;

import storage.StorageService;

public class ProductServiceImplem implements ProductService{
	
	StorageService storageService;
	
	public ProductServiceImplem(StorageService storageService){
		this.storageService = storageService;
	}
	
	public boolean registerProduct(Product product) {
		return storageService.registerProduct(product);
	}
}
