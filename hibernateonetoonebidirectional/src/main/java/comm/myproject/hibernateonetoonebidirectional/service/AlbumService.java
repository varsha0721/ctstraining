package comm.myproject.hibernateonetoonebidirectional.service;

import java.io.IOException;
import java.util.List;

import comm.myproject.hibernateonetoonebidirectional.entity.Album;

public interface AlbumService {
	public Album createAlbum(Album album);
	public List<Album> getAllAlbums();
	public Album getAlbumByid(Integer id);
	public Album updateAlbum(Integer id) throws IOException;
	public void deleteAlbum(Integer id);
}
