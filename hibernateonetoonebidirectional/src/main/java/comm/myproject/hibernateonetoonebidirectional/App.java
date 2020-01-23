package comm.myproject.hibernateonetoonebidirectional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;


import comm.myproject.hibernateonetoonebidirectional.entity.Album;
import comm.myproject.hibernateonetoonebidirectional.entity.MyImage;
import comm.myproject.hibernateonetoonebidirectional.service.AlbumService;
import comm.myproject.hibernateonetoonebidirectional.service.CommonService;
import comm.myproject.hibernateonetoonebidirectional.service.CommonServiceImpl;
import comm.myproject.hibernateonetoonebidirectional.service.MyImageService;

public class App 
{
	private static CommonService commser;
    {
    	commser = new CommonServiceImpl();
    }
    
    public static void main( String[] args )
    {
    	AlbumService album = null;
        MyImageService myimg = null;
        
        int choice = 0,id;
    	String albName,uId,albimg,imgalb,imgurl;
    	LocalDate dateandtime;
    	List<Album> alblist=null;
    	List<MyImage> imglist=null;
    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	do {
    		System.out.println("1. create customer");
    		System.out.println("2. display all customers");
    		System.out.println("3. find customer by id");
    		System.out.println("4. update customer");
    		System.out.println("5. delete customer");
    		System.out.println("0. exit");
    		System.out.print("choice: ");
    		choice = Integer.parseInt(br.readLine().toString());
    		switch (choice) 
    		{
    		case 1:
    			// Album methods
    			System.out.print("Album Name: ");
    			albName=br.readLine().toString();
    			System.out.print("Image Name: ");
    			albimg=br.readLine().toString();
    			System.out.print("Date of Creation(yyyy-mm-dd): ");
    			//DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/mm/dd");
    			String str=br.readLine();
    			dateandtime = LocalDate.parse(str);
    			String arr[]=UUID.randomUUID().toString().split("-");
    			Album thealbum=new Album(albName, dateandtime, albimg);
    			album=commser.createAlbum(thealbum);
    			System.out.println("Create Album Sucess "+ album);
    			
    			//My image methods
    			System.out.print("Image url: ");
    			imgurl=br.readLine().toString();
    			System.out.print("Album Name: ");
    			imgalb=br.readLine().toString();
    			MyImage myimage = new MyImage(imgurl,imgalb);
    			myimage = commser.createMyImage(myimage);
    			System.out.println("Create myimage Sucess "+ myimage);
    			break;
    			
    		case 2:
    			//Show Albums
    			alblist=commser.getAllAlbums();
    			System.out.format("%-20s%-20s%-20s%-20s\n","ID","ALBUM NAME","DATE OF CREATION","IMAGE NAME");
    			alblist.forEach(c->{System.out.format("%-20s%-20s%-20s%-20s\n",c.getId(),c.getAlbumname(),c.getCreationdate(),c.getMyimage());});
    			//Show Images
    			imglist=commser.getAllMyImages();
    			System.out.format("%-20s%-20s%-20s%-20s\n","ID","IMAGE NAME","Image URL","IMAGE ALBUM");
    			imglist.forEach(c->{System.out.format("%-20s%-20s%-20s%-20s\n",c.getImageid(),c.getImageurl(),c.getAlbum());});
    			break;
    		}
    	}while (choice != 0);

    }
}

    
