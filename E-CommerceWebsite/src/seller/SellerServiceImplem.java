package seller;

import storage.StorageService;

public class SellerServiceImplem implements SellerService{
	
	StorageService storageService;
	
	public SellerServiceImplem(StorageService storageService){
		this.storageService = storageService;
	}
	
	public boolean registerSeller(Seller seller) {
		return storageService.registerSeller(seller);
	}
}
