package comm.myproject.hibernateonetoonebidirectional.service;

import java.io.IOException;
import java.util.List;

import comm.myproject.hibernateonetoonebidirectional.dao.AlbumDao;
import comm.myproject.hibernateonetoonebidirectional.dao.MyImageDAO;
import comm.myproject.hibernateonetoonebidirectional.dao.MyImageDAOImpl;
import comm.myproject.hibernateonetoonebidirectional.entity.MyImage;

public class MyImageServiceImpl implements MyImageService{
	private MyImageDAO dao2;
	{
		dao2 = new MyImageDAOImpl();
	}

	@Override
	public MyImage createMyImage(MyImage myimage) {
		// TODO Auto-generated method stub
		return dao2.createMyImage(myimage);
	}

	@Override
	public List<MyImage> getAllMyImages() {
		// TODO Auto-generated method stub
		return dao2.getAllMyImages();
	}

	@Override
	public MyImage getMyImageByid(Integer id) {
		// TODO Auto-generated method stub
		return dao2.getMyImageByid(id);
	}

	@Override
	public MyImage updateMyImage(Integer id) throws IOException {
		// TODO Auto-generated method stub
		return dao2.updateMyImage(id);
	}

	@Override
	public void deleteMyImage(Integer id) {
		// TODO Auto-generated method stub
		dao2.deleteMyImage(id);
	}

}
