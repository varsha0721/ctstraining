package comm.myproject.hibernateonetoonebidirectional.dao;

import java.io.IOException;
import java.util.List;

import comm.myproject.hibernateonetoonebidirectional.entity.Album;

//import comm.myproject.hibernateonetoone.entity.Person;

public interface AlbumDao 
{
	public Album createAlbum(Album album);
	public List<Album> getAllAlbums();
	public Album getAlbumByid(Integer id);
	public Album updateAlbum(Integer id) throws IOException;
	public void deleteAlbum(Integer id);

}
