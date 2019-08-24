package com.tripura.spring.boot;

public class Passenger {
	String name;
	String contact;
	String email;
	String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Passenger [name=" + name + ", contact=" + contact + ", email=" + email + ", password=" + password + "]";
	}
	public Passenger(String name, String contact, String email, String password) {
		super();
		this.name = name;
		this.contact = contact;
		this.email = email;
		this.password = password;
	}
	public Passenger() {
		super();
	}
	public Passenger(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	
	

}
