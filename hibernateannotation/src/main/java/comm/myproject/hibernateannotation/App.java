package comm.myproject.hibernateannotation;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import comm.myproject.hibernateannotation.entity.ToDo;

public class App 
{
    public static void main( String[] args )
    {
       SessionFactory factory = null;
       Session session = null;
       
       try 
       {
    	   factory=new Configuration().configure().addAnnotatedClass(ToDo.class).buildSessionFactory();
    	   session=factory.openSession();
    	   
    	   //to enter the values
    	   
    	   ToDo todo=new ToDo(); 
    	   todo.setUid(UUID.randomUUID().toString());
    	   todo.setDateandtime(LocalDateTime.now());
    	   todo.setTodoname("Doe");
    	   session.getTransaction().begin(); 
    	   session.save(todo);
    	   session.getTransaction().commit(); 
    	   System.out.println("done");
    	   
    	   //to display the values
    	   
    	   Query q = session.createQuery("from ToDo");
    	   List<ToDo> l = q.list();
    	   
    	   for(ToDo p:l)
       		{
       			System.out.println(p);
       		}
       }
       catch (Exception e) 
       {
    	   e.printStackTrace();
       }
       finally
       {
    	   session.close();
    	   factory.close();
       }
    }
}
