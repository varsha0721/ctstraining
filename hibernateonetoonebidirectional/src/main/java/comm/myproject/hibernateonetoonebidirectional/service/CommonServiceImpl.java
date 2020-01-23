package comm.myproject.hibernateonetoonebidirectional.service;

import java.io.IOException;
import java.util.List;

import comm.myproject.hibernateonetoonebidirectional.entity.Album;
import comm.myproject.hibernateonetoonebidirectional.entity.MyImage;

public class CommonServiceImpl implements CommonService {
	
		private AlbumService albservice;
		{
		albservice=new AlbumServiceImpl();
		}
		
		private MyImageService myimg;
		{
		myimg=new MyImageServiceImpl();
		}
		
		//Album common service methods
		@Override
		public Album createAlbum(Album album) {
			
			return albservice.createAlbum(album);
		}
		@Override
		public List<Album> getAllAlbums() {
			
			return albservice.getAllAlbums();
		}
		@Override
		public Album getAlbumByid(Integer id) {
			
			return albservice.getAlbumByid(id);
		}
		@Override
		public Album updateAlbum(Integer id) throws IOException {
			
			return albservice.updateAlbum(id);
		}
		@Override
		public void deleteAlbum(Integer id) {
			albservice.deleteAlbum(id);		
		}
		
		// MyImage common service methods
		@Override
		public MyImage createMyImage(MyImage myimage) {
			
			return myimg.createMyImage(myimage);
		}
		@Override
		public List<MyImage> getAllMyImages() {
			
			return myimg.getAllMyImages();
		}
		@Override
		public MyImage getMyImageByid(Integer id) {
			
			return myimg.getMyImageByid(id);
		}
		@Override
		public MyImage updateMyImage(Integer id) throws IOException {
			
			return myimg.updateMyImage(id);
		}
		@Override
		public void deleteMyImage(Integer id) {
			myimg.deleteMyImage(id);
			
		}
	


}
