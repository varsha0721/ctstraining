package comm.myproject.onetomanyunidirectionalmapping.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import comm.example.spring.hibernate.demo.UserDAO;
import comm.myproject.onetomanyunidirectionalmapping.entity.Post;
@Service("service")
public class PostServiceImpl implements PostService 
{
	private PostDAO dao;
	@Autowired
	public PostServiceImpl(PostDAO dao) 
	{
		super();
		this.dao = dao;
	}
	@Override
	@Transactional
	public Post createPost(Post post)
	{
		return dao.createPost(post);
	}

}
