package comm.myproject.onetomanyunidirectionalmapping.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import comm.myproject.onetomanyunidirectionalmapping.entity.Post;

@Repository("dao")
public class PostDAOImpl implements PostDAO
{
	
	private SessionFactory sessionFactory;
	private Session session;
	
	@Autowired
	public PostDAOImpl(SessionFactory sessionFactory) 
	{	
		super();
		this.sessionFactory = sessionFactory;
		session = sessionFactory.openSession();
	}
	

	@Override
	@Transactional
	public Post createPost(Post post) 
	{
	//	session.getTransaction().begin();
		session.save(post);
		//session.getTransaction().commit();
		return post;
	}
}
