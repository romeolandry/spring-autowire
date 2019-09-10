package com.spb.romeo.beans;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClientUserAccount implements BeanUserAccount {
	
	private String firstname;
	private String lastname;
	private Date birthday;
	private String type;
	
	public ClientUserAccount() throws ParseException {
		// TODO Auto-generated constructor stub
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		Date   date       = format.parse ("13-08-1991");
		this.firstname = "Romeo landry";
		this.lastname = "Kamgo Chetchom";
		this.birthday = date;
		this.type = "Client";
	}
	
	public String getFirstName() {
		// TODO Auto-generated method stub
		return this.firstname;
	}

	public void setFirstName(String firstname) {
		// TODO Auto-generated method stub
		this.firstname = firstname;
	}

	public String getLastName() {
		// TODO Auto-generated method stub
		return this.lastname;
	}

	public void setLastName(String lastname) {
		// TODO Auto-generated method stub
		this.lastname= lastname;
	}

	public Date getBirthday() {
		// TODO Auto-generated method stub
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		// TODO Auto-generated method stub
		this.birthday = birthday;

	}

	public String getType() {
		// TODO Auto-generated method stub
		return this.type;
	}

	public void setType(String type) {
		// TODO Auto-generated method stub
		this.type = type;

	}
	
	public void showUserAccount() {
		// TODO Auto-generated method stub
		System.out.println(getFirstName());
		System.out.println(getLastName());
		System.out.println(getBirthday());
		System.out.println(getType());
		
	}

}
