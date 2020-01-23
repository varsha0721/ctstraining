package comm.example.spring.hibernate.demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.UUID;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import comm.example.spring.hibernate.demo.entity.UserDetail;

public class App 
{
	
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context=null;
    	BufferedReader br=null;
    	UserService service=null;	
    	
    	try 
    	{
    		br=new BufferedReader(new InputStreamReader(System.in));
			context=new ClassPathXmlApplicationContext("applicationContext.xml");
			service=context.getBean("service",UserService.class);
			UserDetail user = service.createUser(new UserDetail(UUID.randomUUID().toString(),"fdsjgdsjkgsfkj", "xasd@gmail.com" ));
			System.out.println(user);
    	} 
    	catch (Exception e)
    	{
			e.printStackTrace();
		}
    	finally {
			//context.close();
		}
    }
}
