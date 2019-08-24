package com.tripura.spring.boot;

public class Bookings {
    
    
    int bookingId;
    String serviceNumber;
    String email;
    String dateofJrny;
    
    public Bookings() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Bookings(int bookingId, String serviceNumber, String email, String dateofJrny) {
        super();
        this.bookingId = bookingId;
        this.serviceNumber = serviceNumber;
        this.email = email;
        this.dateofJrny = dateofJrny;
    }
    @Override
    public String toString() {
        return "Preview [bookingId=" + bookingId + ", serviceNumber=" + serviceNumber + ", email=" + email
                + ", dateofJrny=" + dateofJrny + "]";
    }
    public int getBookingId() {
        return bookingId;
    }
    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }
    public String getServiceNumber() {
        return serviceNumber;
    }
    public void setServiceNumber(String serviceNumber) {
        this.serviceNumber = serviceNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDateofJrny() {
        return dateofJrny;
    }
    public void setDateofJrny(String dateofJrny) {
        this.dateofJrny = dateofJrny;
    }
    
}


