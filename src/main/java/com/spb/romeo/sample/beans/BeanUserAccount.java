package com.spb.romeo.sample.beans;

import java.util.Date;

public interface BeanUserAccount {
	
	String getFirstName();
	void setFirstName(String firstname);
	String getLastName();
	void setLastName(String lastname);
	
	Date getBirthday ();
	void setBirthday(Date birthday);
	
	String getType ();
	void setType (String type);
	

}
