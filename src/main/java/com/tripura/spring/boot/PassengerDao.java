package com.tripura.spring.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class PassengerDao {
	public void savePassenger(Passenger p) {
		// TODO Auto-generated method stub
		
		
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println(" driver loaded");
			
			
			
			Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","satyasatya");
			
			System.out.println("Database connected");
			
			Statement stmt=(Statement) con.createStatement();
			stmt.execute("insert into passenger(name,email,password,contact) values('"+p.getName()+"','"+p.getEmail()+"','"+p.getPassword()+"' ,'"+p.getContact()+"')");
			
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			
		System.out.println("unable to load driver");
		} catch (SQLException e) {
			
			System.out.println(e);
		}
		
	}

	public String authenticate(String emailv, String passwordv) {
		// TODO Auto-generated method stub
		
		
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println(" driver loaded");
			
			
			
			Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","satyasatya");
			
			System.out.println("Database connected");
			
			Statement stmt=(Statement) con.createStatement();
			ResultSet results=stmt.executeQuery("select * from passenger where email='"+emailv+"'");
			
		//List<Employee> emplist=new ArrayList<Employee>();
			
			/*
			 * while(results.next()) { //System.out.println(results.getString("fullname"));
			 * 
			 * Employee e=new Employee(); e.setFirstname(results.getString("firstname"));
			 * e.setLastname(results.getString("lastname"));
			 * e.setContact(results.getLong("contact"));
			 * e.setFullname(results.getString("fullname"));
			 * e.setEmail(results.getString("email")); e.setId(results.getInt("id"));
			 * emplist.add(e); }
			 * 
			 */
			
			if(results.next()==false)
			{
				System.out.println("here");
				return "invalid";
			}
			else
			{
				String pswd=results.getString("password");
				if(pswd.equals(passwordv))
					return "valid";
				
			}
			
			
//			request.setAttribute("employees", emplist);
//			request.getRequestDispatcher("display.jsp").forward(request, response);
//			//System.out.println(emplist);
//			
//			
			
			
		} catch (ClassNotFoundException e) {
			
		System.out.println("unable to load driver");
		} catch (SQLException e) {
			
			System.out.println(e);
		}
		
		return "invalid";
	}

	
	public List<Bookings> getBookings() {
List<Bookings>  bookinglist=new ArrayList<Bookings>();
	
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println(" driver loaded");
		
		
		
		Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","satyasatya");
		
		System.out.println("Database connected");
		
		Statement stmt=(Statement) con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from bookings");
		
	
		
		  while(rs.next()) { //System.out.println(results.getString("fullname"));
		  
		  Bookings e=new Bookings(); 
		  e.setBookingId(rs.getInt("bookingId"));
		  e.setEmail(rs.getString("email"));
		  e.setDateofJrny(rs.getString("dateofJrny"));
		  e.setServiceNumber(rs.getString("serviceNumber"));
		 bookinglist.add(e);
		 System.out.println(bookinglist);
		 
		
		  }
		  return bookinglist;
		
		
//		request.setAttribute("employees", emplist);
//		request.getRequestDispatcher("display.jsp").forward(request, response);
//		//System.out.println(emplist);
//		
//		
		
		
	} catch (ClassNotFoundException e) {
		
	System.out.println("unable to load driver");
	} catch (SQLException e) {
		
		System.out.println(e);
	}

	
	return null;
	
}
	
	
	public List<Passenger> getDetails() {
		
		List<Passenger>  detailslist=new ArrayList<Passenger>();
			
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println(" driver loaded");
				
				
				
				Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","satyasatya");
				
				System.out.println("Database connected");
				
				String email="satyav@gmail.com";
				Statement stmt=(Statement) con.createStatement();
				ResultSet rs=stmt.executeQuery("select * from passenger where email='"+email+"'");
				
				
			
				
				  while(rs.next()) { //System.out.println(results.getString("fullname"));
				  
				  Passenger e=new Passenger(); 
				  e.setName(rs.getString("name"));
				  e.setEmail(rs.getString("email"));
				  e.setPassword(rs.getString("password"));
				  e.setContact(rs.getString("contact"));
				 detailslist.add(e);
				 System.out.println(detailslist);
				 
				
				  }
				  return detailslist;
				
				
//				request.setAttribute("employees", emplist);
//				request.getRequestDispatcher("display.jsp").forward(request, response);
//				//System.out.println(emplist);
//				
//				
				
				
			} catch (ClassNotFoundException e) {
				
			System.out.println("unable to load driver");
			} catch (SQLException e) {
				
				System.out.println(e);
			}

			
			return null;
			
		}


public void updateContact(String contact, String email) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println(" driver loaded");
		
		
		
		Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","satyasatya");
		
		System.out.println("Database connected");
		
		Statement stmt=(Statement) con.createStatement();
		stmt.executeUpdate("update passenger set contact='"+contact+"' where email='"+email+"'");
		/*
		 * String sqlUpdate = "UPDATE viewprofile " + "SET contactnumber = ? " +
		 * "WHERE email = ?";
		 */
 
		/*
		 * PreparedStatement pstmt = con.prepareStatement(sqlUpdate); pstmt.setString(1,
		 * contactno); pstmt.setString(2, email);
		 */

	} catch (ClassNotFoundException e) {
		
	System.out.println("unable to load driver");
	} catch (SQLException e) {
		
		System.out.println(e);
	}
	
	// TODO Auto-generated method stub
	
}


public void updatePassword(String password, String email) {
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println(" driver loaded");
		
		
		
		Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","satyasatya");
		
		System.out.println("Database connected");
		
		Statement stmt=(Statement) con.createStatement();
		stmt.executeUpdate("update passenger set password ='"+password+"' where email='"+email+"'");
		/*
		 * String sqlUpdate = "UPDATE viewprofile " + "SET contactnumber = ? " +
		 * "WHERE email = ?";
		 */
 
		/*
		 * PreparedStatement pstmt = con.prepareStatement(sqlUpdate); pstmt.setString(1,
		 * contactno); pstmt.setString(2, email);
		 */

	} catch (ClassNotFoundException e) {
		
	System.out.println("unable to load driver");
	} catch (SQLException e) {
		
		System.out.println(e);
	}

}


}
