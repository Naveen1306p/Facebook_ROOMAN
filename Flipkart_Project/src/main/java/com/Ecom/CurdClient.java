package com.Ecom;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CurdClient {
	public static void main(String[] args) {
		 SessionFactory factory = hibernate.getSessionFactory();
	        Session ses = factory.openSession();
	        Transaction tx = ses.beginTransaction();
	        
	      ///insert
	       /* Product p = new Product();
	        p.setPname("samsung");
	        p.setPrice(90000);
	        ses.save(p);
	        tx.commit();*/    
	       //update
	        /*Product p5 = new Product();
	        p5.setPid(5);
	        p5.setPname("apple");
	        p5.setPrice(350000);
	        ses.update(p5);
	        tx.commit();*/
	        
	        //delete
	        Product p = new Product();
	        p.setPid(5);
	        ses.remove(p);
	        tx.commit();
	        
	        //get
	        /*Product p1 = ses.load(Product.class, 1);
	        System.out.println(p.getPid() +" " +p.getPname() +" "+p.getPrice());*/
	}

}


