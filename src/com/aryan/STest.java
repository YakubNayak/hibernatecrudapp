package com.aryan;
import java.io.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class STest 
{
	public static void main(String args[])
	{
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");

	SessionFactory factory=cfg.buildSessionFactory();
	Session session=factory.openSession();

	Object o=session.load(Employee.class, new Integer(101));
	Employee e=(Employee)o;

	System.out.println("Employee name is___:"+e.getEname());
	System.out.println("Employee Fee___:"+e.getFee());
	
	Object o1=session.load(Employee.class, new Integer(102));
	Employee e1=(Employee)o1;

	System.out.println("Employee name is___:"+e1.getEname());
	System.out.println("Employee Fee___:"+e1.getFee());
	
	session.close();
	factory.close();
	}

}
