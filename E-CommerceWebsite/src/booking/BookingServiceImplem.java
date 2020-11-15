package booking;

import seller.Seller;
import storage.StorageService;

public class BookingServiceImplem implements BookingService{
	
	StorageService storageService;
	
	public BookingServiceImplem(StorageService storageService){
		this.storageService = storageService;
	}
	
	public boolean orderProduct(Booking booking) {
		return storageService.orderProduct(booking);
	}
	
}
