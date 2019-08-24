package com.tripura.spring.boot;

import java.util.ArrayList;
import java.util.List;



public class JsonOutputProfile {
	
	List<Passenger> list=new ArrayList<Passenger>();

	public List<Passenger> getList() {
		return list;
	}

	public void setList(List<Passenger> list) {
		this.list = list;
	}
	
	

}
