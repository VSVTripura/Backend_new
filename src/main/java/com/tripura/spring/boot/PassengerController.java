package com.tripura.spring.boot;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;




@Controller
@EnableAutoConfiguration
public class PassengerController {
	
	
	@Autowired 
	PassengerRepo eRepo;
	@RequestMapping("/BusDetails")
	@ResponseBody
 public JsonOutputBuses employeeDate(@RequestParam String from ,@RequestParam String to,@RequestParam String dateOfJourney){
	 //List<Employee> eData=empData();
	 //return (List<Employee>) eRepo.findAll();
		
		
		List<BusDetails> listOfBuses = (List<BusDetails>) eRepo.findByFromPlaceAndToPlaceAndDateOfJourney(from,to,dateOfJourney);	
	 JsonOutputBuses json = new JsonOutputBuses();
		json.setList(listOfBuses);
		
		return json;
}
	
	@RequestMapping("/index")
	String index() {
		System.out.println();
		return "index";
	}
	@RequestMapping("/passenger")
	
	String customer() {
		return "Registration";
	}
	@RequestMapping("/regPage")
	
	//void genCustomer(@RequestParam String name, @RequestParam String email, @RequestParam String password,@RequestParam String contact){
		
	void genCustomer(HttpServletRequest httpr) {
	String name=httpr.getParameter("name");
	    String email=httpr.getParameter("email");
	   String password=httpr.getParameter("password");
	   String contact=httpr.getParameter("contact");
		//System.out.println(cname);
	    
	    Passenger p=new Passenger(name,contact,email,password);
	    PassengerService ps=new PassengerService();
	    ps.createPassenger(p);
		//return "success";
	}
	
	
	@RequestMapping("/login")
	String loginpage()
	{
		return "login";
	}
	
	@GetMapping(path = "/loginv",produces = "application/json")
  @ResponseBody
	Message loginv(HttpServletRequest httpr)
	{
		String sr;
		String email=httpr.getParameter("email");
		String password=httpr.getParameter("password");
		Passenger p=new Passenger(email,password);
		PassengerService ps=new PassengerService();
		 String s=ps.validate(email,password);
		
		if(s.equals("valid"))
			sr="success";
		else
			sr="fail";
		Message result=new Message();
		result.setMsg(sr);;
		return result;
	}
	@GetMapping(path="/previousbookings",produces = "application/json")
	@ResponseBody
	public JsonOutput findAllBookings(){
		
		PassengerService ps=new PassengerService();
		List<Bookings> listOfBookings=	(List<Bookings>)ps.getBookings();
		System.out.println(listOfBookings);
		//List<Bookings> listOfEmployees = (List<Bookings>) passengerRepository.findAll();		
		JsonOutput json = new JsonOutput();
		json.setList(listOfBookings);
		System.out.println(json);
		
		return json;
		
	}
	
	@GetMapping(path="/viewprofile",produces = "application/json")
	  
	  @ResponseBody public JsonOutputProfile findAlldetails(){
	  
	  PassengerService ps=new PassengerService(); 
	  List<Passenger>listOfdetails= (List<Passenger>)ps.getDetails();
	  System.out.println(listOfdetails); 
	  //List<Bookings> listOfEmployees =(List<Bookings>) passengerRepository.findAll(); 
	  JsonOutputProfile json = new JsonOutputProfile();
	  json.setList(listOfdetails);
	  System.out.println(json);
	  
	  return json;
	  
	  }
	 
	
	
	@RequestMapping("/updateContact")
	@ResponseBody
	public String UpdateContactNumber(@RequestParam String contact,@RequestParam String email)
	{
		
		PassengerDao ud=new PassengerDao();
		ud.updateContact(contact,email);
		return "success";
		
		
	}
	
	@RequestMapping("/updatepassword")
	@ResponseBody
	public String UpdatePassword(@RequestParam String password,@RequestParam String email)
	{
		
		PassengerDao un=new PassengerDao();
		un.updatePassword(password,email);
		return "success";
		
		
	}


}
