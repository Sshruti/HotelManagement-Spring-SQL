package com.mikadosolutions.training.springmvc.bean;

public class Room
{
	private int roomNumber;
	private String roomType, roomStatus;

public Room()
	{
	}

	public Room(final int roomNumber, final String roomType, final String roomStatus)
	{
		this.roomNumber=roomNumber;
		this.roomType= roomType;
		this.roomStatus= roomStatus;
	}
	 public void setRoomNumber( int roomNumber)
	{
		 this.roomNumber=roomNumber;
	}
	public int getRoomNumber()
	{
		return roomNumber;
	}
	public void setRoomType(String roomType)
	{
this.roomType= roomType;
	}

	public String getRoomType()
	{
		return roomType;
	}

	public void setRoomStatus(String roomStatus)
	{
this.roomStatus= roomStatus;
	}
	public String getRoomStatus()
	{
		System.out.println(roomStatus);
		return roomStatus;
	}



	public boolean equals(Object o)
	{
		if( o instanceof Room)
		{
			return ((Room)o).getRoomNumber() == (roomNumber);
		}
		else
		{
			return false;
		}
	}
	public String toString()
	{
		return "roomNumber="+roomNumber+"roomType ="+roomType;
	}
};
