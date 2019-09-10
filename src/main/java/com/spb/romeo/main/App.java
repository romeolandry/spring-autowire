package com.spb.romeo.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spb.romeo.beans.BeanUserAccount;
import com.spb.romeo.beans.PersonalUserAccount;

/**
 * Hello world!
 *
 */
public class App
{
	public App () throws ParseException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:/applicationContext.xml");
    	BeanUserAccount Personal = (BeanUserAccount)context.getBean("personalUserAccountid");    	
    	BeanUserAccount client = (BeanUserAccount)context.getBean("cleintUserAccountid");
    	Personal.showUserAccount();
    	client.showUserAccount();
    	context.close();
    	
	}
    public static void main( String[] args )
    {
    	try {
			new App();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
