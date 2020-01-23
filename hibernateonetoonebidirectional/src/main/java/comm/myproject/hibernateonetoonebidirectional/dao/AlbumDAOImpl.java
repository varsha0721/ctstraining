package comm.myproject.hibernateonetoonebidirectional.dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Transaction;

//import comm.myproject.hibernateonetoone.entity.Person;
//import comm.myproject.hibernateonetoone.entity.Person;
//import comm.myproject.hibernateonetoone.util.HibernateUtil;
import comm.myproject.hibernateonetoonebidirectional.entity.Album;
import comm.myproject.hibernateonetoonebidirectional.util.HibernateUtil;

public class AlbumDAOImpl implements AlbumDao
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
	public Album createAlbum(Album album) {
		try {
			transaction.begin();
			session.save(album);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return album;
	}

	@Override
	public List<Album> getAllAlbums() {
		Query query=session.createQuery("from Album");
		return query.list();
	}

	@Override
	public Album getAlbumByid(Integer id) {
		Album album=session.get(Album.class, id);
		if(album==null)
		{
			System.out.println("not found");
		}
		return album;
	}

	@Override
	public Album updateAlbum(Integer id) throws IOException {
		Album p=session.get(Album.class, id);
		if(p!=null)
		{
			System.out.println("Name: ");
			String name=br.readLine();
			p.setAlbumname(name);
			p.setCreationdate(LocalDate.now());
			String myImg=br.readLine();
			p.setMyimage(myImg);
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
	public void deleteAlbum(Integer id) {
		Album p=session.get(Album.class, id);
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
