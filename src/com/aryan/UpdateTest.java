package com.aryan;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class UpdateTest
{
	public static void main(String[] args)
	{

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		/* Object o=session.load(Employee.class,new Integer(102));
		Employee s=(Employee)o;

		Transaction tx = session.beginTransaction();	

//s.setStno(105);   should not update, because we loaded with that number right..?
		s.setFee(4000);   // implicitly update method will be called.. **/
		
		Employee e1=new Employee();
		e1.setEid(101);
		e1.setEname("Ramayanam");
		Transaction tx = session.beginTransaction();
		session.update(e1);
	
		tx.commit();

		System.out.println("Object Updated successfully.....!!");
		session.close();
		factory.close();
	}
}
