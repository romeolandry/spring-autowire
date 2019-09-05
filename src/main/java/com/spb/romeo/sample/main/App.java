package com.spb.romeo.sample.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spb.romeo.sample.beans.BeanUserAccount;
import com.spb.romeo.sample.beans.PersonalUserAccount;

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
        System.out.println( "Hello World!" );
    }
}
