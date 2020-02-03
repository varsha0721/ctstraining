package crm1.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import crm1.model.Customer;

public class CustomerUtil {

	public static SessionFactory getMySessionFactory()
	{
		return new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Customer.class)
				.buildSessionFactory();
	}

}