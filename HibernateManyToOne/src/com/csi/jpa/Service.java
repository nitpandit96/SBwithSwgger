package com.csi.jpa;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Service {
	
	private static SessionFactory factory=new AnnotationConfiguration().configure().buildSessionFactory();
	
public static void main(String[] args) {
	
	
	Session session=factory.openSession();
	
	Transaction transaction=session.beginTransaction();
	
     Address a1=new Address("PROZON MALL", "PUNE", "MH", "INDIA", 431208);
     
     session.save(a1);
     
    Employee e1=new Employee("nitin", 74800.500, a1);
    Employee e2=new Employee("chirag", 54800.500, a1);
    Employee e3=new Employee("nakul", 44800.500, a1);
    
    session.save(e1);
    session.save(e2);
    session.save(e3);
    
    transaction.commit();
}
}
