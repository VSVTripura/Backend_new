package com.tripura.spring.boot;

import java.util.List;



public class PassengerService {
	public void createPassenger(Passenger p) {
		// TODO Auto-generated method stub
		
		
		PassengerDao pd=new PassengerDao();
		pd.savePassenger(p);
		
	}

	public String validate(String email, String password) {
		// TODO Auto-generated method stub
		
		
		PassengerDao pd=new PassengerDao();
		String s=pd.authenticate(email,password);
		return s;
		
	}
	public List<Bookings> getBookings() {
		// TODO Auto-generated method stub
		PassengerDao pd=new PassengerDao();
		List<Bookings> listB=pd.getBookings();
		return listB;
	}
	
	public List<Passenger> getDetails() {
		
		PassengerDao pd=new PassengerDao();
		List<Passenger> list=pd.getDetails();
		return list;
	
}

}
