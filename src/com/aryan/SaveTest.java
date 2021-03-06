package com.aryan;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class SaveTest {
	public static void main(String[] args)
    {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml"); 

        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        Object o=session.load(Employee.class,new Integer(103));
        Employee p=(Employee)o;

        Transaction tx = session.beginTransaction();
        session.delete(p);
        System.out.println("Object Deleted successfully.....!!");
        tx.commit();
        session.close();
        factory.close();
    }
}
