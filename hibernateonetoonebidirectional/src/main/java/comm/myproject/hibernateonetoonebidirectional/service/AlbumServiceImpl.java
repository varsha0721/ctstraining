package comm.myproject.hibernateonetoonebidirectional.service;

import java.io.IOException;
import java.util.List;

import comm.myproject.hibernateonetoonebidirectional.dao.AlbumDAOImpl;
import comm.myproject.hibernateonetoonebidirectional.dao.AlbumDao;
import comm.myproject.hibernateonetoonebidirectional.entity.Album;

public class AlbumServiceImpl implements AlbumService{
	private AlbumDao dao1;
	{
		dao1 = new AlbumDAOImpl();
	}

	@Override
	public Album createAlbum(Album album) {
		// TODO Auto-generated method stub
		return dao1.createAlbum(album);
	}

	@Override
	public List<Album> getAllAlbums() {
		// TODO Auto-generated method stub
		return dao1.getAllAlbums();
	}

	@Override
	public Album getAlbumByid(Integer id) {
		// TODO Auto-generated method stub
		return dao1.getAlbumByid(id);
	}

	@Override
	public Album updateAlbum(Integer id) throws IOException {
		// TODO Auto-generated method stub
		return dao1.updateAlbum(id);
	}

	@Override
	public void deleteAlbum(Integer id) {
		// TODO Auto-generated method stub
		dao1.getAlbumByid(id);
	}

}
