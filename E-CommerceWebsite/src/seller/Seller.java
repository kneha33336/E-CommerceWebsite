package seller;

import commonEntities.PersonalInfo;

public class Seller extends PersonalInfo{
	
	public Seller(String name, String countryCode, String contactNumber) {
		 setId(countryCode + contactNumber);
		 setName(name);
		 setCountryCode(countryCode);
		 setContactNumber(contactNumber);
	}
}
