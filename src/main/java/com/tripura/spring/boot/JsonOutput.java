package com.tripura.spring.boot;

import java.util.ArrayList;
import java.util.List;



public class JsonOutput {
	 List<Bookings> list=new ArrayList<Bookings>();
     String msg;
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List<Bookings> getList() {
		return list;
	}

	public void setList(List<Bookings> list) {
		this.list = list;
	}

}
