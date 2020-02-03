package comm.myproject.onetomanyunidirectionalmapping;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import comm.myproject.onetomanyunidirectionalmapping.dao.PostDAO;
import comm.myproject.onetomanyunidirectionalmapping.dao.PostService;
import comm.myproject.onetomanyunidirectionalmapping.dao.PostServiceImpl;
import comm.myproject.onetomanyunidirectionalmapping.entity.Comment;
import comm.myproject.onetomanyunidirectionalmapping.entity.Post;

//import comm.example.spring.hibernate.demo.UserService;
//import comm.example.spring.hibernate.demo.entity.UserDetail;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context=null;
    	BufferedReader br=null;
    	PostServiceImpl service=null;	
    	
    	try 
    	{
    		br=new BufferedReader(new InputStreamReader(System.in));
			context=new ClassPathXmlApplicationContext("applicationContext.xml");
			service=context.getBean("service",PostServiceImpl.class);
			Post post=new Post(1, LocalDateTime.now(), "Creater-1");
			post.addComment(new Comment(1,"Nice1",LocalDateTime.now()));
			post.addComment(new Comment(2,"Nice2",LocalDateTime.now()));
			service.createPost(post);
    	} 
    	catch (Exception e)
    	{
			e.printStackTrace();
		}
    }
}
