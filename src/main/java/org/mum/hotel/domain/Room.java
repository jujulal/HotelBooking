package org.mum.hotel.domain;


public class Room {
	
	private int roomNo;
	private int roomTypeNo;
	private String description;
	private boolean bookedStatus;
	private int noOfPersons;
	
	public Room(){
		
	}

	public int getRoomNo() {
		return roomNo;
	}
	public int getRoomTypeNo() {
		return roomTypeNo;
	}
	public String getDescription() {
		return description;
	}
	public boolean isBookedStatus() {
		return bookedStatus;
	}
	public int getNoOfPersons() {
		return noOfPersons;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public void setRoomTypeNo(int roomTypeNo) {
		this.roomTypeNo = roomTypeNo;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setBookedStatus(boolean bookedStatus) {
		this.bookedStatus = bookedStatus;
	}

	public void setNoOfPersons(int noOfPersons) {
		this.noOfPersons = noOfPersons;
	}
}
