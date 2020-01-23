package comm.myproject.hibernateonetoonebidirectional.dao;

import java.io.IOException;
import java.util.List;

import comm.myproject.hibernateonetoonebidirectional.entity.Album;
import comm.myproject.hibernateonetoonebidirectional.entity.MyImage;

public interface MyImageDAO 
{
	public MyImage createMyImage(MyImage myimage);
	public List<MyImage> getAllMyImages();
	public MyImage getMyImageByid(Integer id);
	public MyImage updateMyImage(Integer id) throws IOException;
	public void deleteMyImage(Integer id);

}
