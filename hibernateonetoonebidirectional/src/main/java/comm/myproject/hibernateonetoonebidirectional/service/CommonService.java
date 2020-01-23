package comm.myproject.hibernateonetoonebidirectional.service;

import java.io.IOException;
import java.util.List;

import comm.myproject.hibernateonetoonebidirectional.entity.Album;
import comm.myproject.hibernateonetoonebidirectional.entity.MyImage;

//import comm.example.hibernate.service.PersionService;
//import comm.example.hibernate.service.PersionServiceImpl;

public interface CommonService 
{
	//Album service methods
	public Album createAlbum(Album album);
	public List<Album> getAllAlbums();
	public Album getAlbumByid(Integer id);
	public Album updateAlbum(Integer id) throws IOException;
	public void deleteAlbum(Integer id);

	//My image service methods
	public MyImage createMyImage(MyImage myimage);
	public List<MyImage> getAllMyImages();
	public MyImage getMyImageByid(Integer id);
	public MyImage updateMyImage(Integer id) throws IOException;
	public void deleteMyImage(Integer id);
}
