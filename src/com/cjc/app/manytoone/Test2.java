package com.cjc.app.manytoone;

import org.hibernate.Session;

public class Test2 
{
	public static void main(String[] args) 
	{
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		Employee e1= new Employee();
		e1.setName("Vipin");
		e1.setEmail("vip.chauhan82@gmail.com");
		
		Employee e2= new Employee();
		e2.setName("Nitin");
		e2.setEmail("nitinchauhan278@gmail.com");
		
		CompanyAddress a1= new CompanyAddress();
		a1.setCity("Pune");
		a1.setAddress1("tower8 , Magarpatta ");
		a1.setState("Mahrastra");
		a1.setCountry("India");
		a1.setPincode(411057);
		e1.setAddress(a1);
		session.save(e1);
		
		
		session.save(e2);
		
		
		session.beginTransaction().commit();
		
		
	}
}
