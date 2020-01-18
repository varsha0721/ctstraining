package comm.myproject.springjdbcdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.mycompany.springjdbcdemo.dao.CustomerDao;
import com.mycompany.springjdbcdemo.dao.CustomerDaoImpl;
import com.mycompany.springjdbcdemo.model.Customer;

@Component
public class App 
{
	
    public static void main( String[] args )
    {
      try 
      {
    	  ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    	  CustomerDao dao=context.getBean("dao",CustomerDao.class);
    	  Customer c=dao.createCustomer(new Customer(UUID.randomUUID().toString(),"John", "Doe", "john@email.com"));
    	  //System.out.println(c);
    	  
    	List<Customer> l=dao.showCustomer();
    	l.forEach(c1->{
    		System.out.println(c1);
    	});
      }
      catch (Exception e)
      {
		e.printStackTrace();
      }
    }
}