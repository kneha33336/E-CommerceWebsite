package buyer;


import java.util.*;

import commonEntities.PersonalInfo;

public class Buyer extends PersonalInfo{
	
	private List<String> productInCart;
	
	public Buyer(String name, String countryCode, String contactNumber) {
		 setId(countryCode + contactNumber);
		 setName(name);
		 setCountryCode(countryCode);
		 setContactNumber(contactNumber);
		 this.productInCart = new ArrayList<>();
	}
	
	public List<String> getProductInCart() {
		return this.productInCart;
	}
}
