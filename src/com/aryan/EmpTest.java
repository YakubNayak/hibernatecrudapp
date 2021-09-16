package com.aryan;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class EmpTest { 

	public static void main(String[] args)
	{

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Employee p=new Employee();
	
		
		p.setEid(103);
		p.setEname("Rathod");
		p.setFee(12000);

Employee p2=new Employee();
	
		
		p2.setEid(104);
		p2.setEname("Aryan");
		p2.setFee(14000);
		
		Transaction tx = session.beginTransaction();
		session.save(p);
		session.save(p2);
		System.out.println("Object saved successfully.....!!");
		tx.commit();
		session.close();
		factory.close();
	}

}