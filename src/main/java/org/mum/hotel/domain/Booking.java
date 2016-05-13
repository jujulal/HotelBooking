package org.mum.hotel.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Booking")
public class Booking {

	
	@Id
	@GeneratedValue
	int bookingNo;
	
	@OneToOne
	@JoinColumn(name="customerNo")
	Customer customer;
	@OneToOne
	@JoinColumn(name="roomNo")
	Room bookedRoom;
	@OneToOne
	@JoinColumn(name="billNo")
	Billing bookingBill;
	Date bookingDate;
	Date checkInDate;
	Date checkoutDate;
	int noOfDays;
	double actualPrice;
	
	public Booking(){
		
	}
	
	public Room getBookedRoom() {
		return bookedRoom;
	}

	public void setBookedRoom(Room bookedRoom) {
		this.bookedRoom = bookedRoom;
	}

	public Billing getBookingBill() {
		return bookingBill;
	}

	public void setBookingBill(Billing bookingBill) {
		this.bookingBill = bookingBill;
	}

	public int getBookingNo() {
		return bookingNo;
	}
	public void setBookingNo(int bookingNo) {
		this.bookingNo = bookingNo;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	public Date getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}
	public Date getCheckoutDate() {
		return checkoutDate;
	}
	public void setCheckoutDate(Date checkoutDate) {
		this.checkoutDate = checkoutDate;
	}
	public int getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}
	public double getActualPrice() {
		return actualPrice;
	}
	public void setActualPrice(double actualPrice) {
		this.actualPrice = actualPrice;
	}
	
	
}
