package buyer;

import product.*;

public interface BuyerService {
	public boolean registerBuyer(Buyer buyer);
	
	public boolean addToCart(Product product, Buyer buyer);
}
