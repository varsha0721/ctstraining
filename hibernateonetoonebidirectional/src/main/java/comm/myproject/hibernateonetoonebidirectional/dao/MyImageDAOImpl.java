package comm.myproject.hibernateonetoonebidirectional.dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.time.LocalDate;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Transaction;

//import comm.myproject.hibernateonetoonebidirectional.entity.Album;
import comm.myproject.hibernateonetoonebidirectional.entity.MyImage;
import comm.myproject.hibernateonetoonebidirectional.util.HibernateUtil;

public class MyImageDAOImpl implements MyImageDAO
{
	private org.hibernate.Session session;
	private Transaction transaction;
	private BufferedReader br;
	{
		session=HibernateUtil.getSession();
		transaction=session.getTransaction();
		br=new BufferedReader(new InputStreamReader(System.in));
	}

	@Override
	public MyImage createMyImage(MyImage myimage) {
		try {
			transaction.begin();
			session.save(myimage);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return myimage;
	}

	@Override
	public List<MyImage> getAllMyImages() {
		Query query=session.createQuery("from MyImage");
		return query.list();
	}

	@Override
	public MyImage getMyImageByid(Integer id) {
		MyImage myimage=session.get(MyImage.class, id);
		if(myimage==null)
		{
			System.out.println("not found");
		}
		return myimage;
	}

	@Override
	public MyImage updateMyImage(Integer id) throws IOException {
		MyImage p=session.get(MyImage.class, id);
		if(p!=null)
		{
			System.out.println("Name: ");
			String url=br.readLine();
			p.setImageurl(url);
			String name=br.readLine();
			p.setAlbum(name);
			transaction.begin();
			session.update(p);
			transaction.commit();
		}
		else {
			System.out.println("not found");
		}
		return p;
	}

	@Override
	public void deleteMyImage(Integer id) {
		MyImage p=session.get(MyImage.class, id);
		if(p!=null)
		{
			transaction.begin();
			session.delete(p);
			transaction.commit();
			System.out.println("deleted.");
		}
		else
		{
			System.out.println("not found");
		}
		
	}

}
