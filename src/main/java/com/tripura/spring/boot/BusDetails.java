package com.tripura.spring.boot;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity

public class BusDetails {

	//crud operaions are persistant
	//enity to convert it as a table by h2datavase
	//to use id atribute as pkey in table
	//@GeneratedValue//to enable auto increment to id
	//@Column(name="emp_id")
	@Id
String serviceno;
	
	String fromPlace;
	
	String toPlace;
	
	String dateOfJourney;
public String getServiceno() {
		return serviceno;
	}
	public void setServiceno(String serviceno) {
		this.serviceno = serviceno;
	}

//String serviceNo;


public String getDateOfJourney() {
	return dateOfJourney;
}
public void setDateOfJourney(String dateOfJourney) {
	this.dateOfJourney = dateOfJourney;
}


public BusDetails(String serviceNo,String fromPlace, String toPlace, String dateOfJourney) {
	super();
	this.serviceno=serviceNo;
	this.fromPlace = fromPlace;
	this.toPlace = toPlace;
	//this.serviceNo = serviceNo;
	this.dateOfJourney = dateOfJourney;
}
public BusDetails(String fromPlace,String toPlace) {
	super();
	this.fromPlace = fromPlace;
	this.toPlace = toPlace;
	
}
public BusDetails() {
	super();
	// TODO Auto-generated constructor stub
}


public BusDetails( String fromPlace, String toPlace,String dateOfJourney) {
	super();
	
	this.fromPlace = fromPlace;
	this.toPlace = toPlace;
	this.dateOfJourney=dateOfJourney;
}


public String getFromPlace() {
	return fromPlace;
}
public void setFromPlace(String fromPlace) {
	this.fromPlace = fromPlace;
}
public String getToPlace() {
	return toPlace;
}
public void setToPlace(String toPlace) {
	this.toPlace = toPlace;
}
@Override
public String toString() {
	return "Employee [ name=" + fromPlace + ", project=" + toPlace + "]";
}


}
