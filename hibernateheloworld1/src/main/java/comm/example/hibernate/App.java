package comm.example.hibernate;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.jboss.jandex.ThrowsTypeTarget;

import comm.example.hibernate.entity.Person;
import comm.example.hibernate.service.PersionService;
import comm.example.hibernate.service.PersionServiceImpl;
public class App 
{
	private static PersionService service;
	static
	{
	service=new PersionServiceImpl();
	}
	
	public static void main(String[] args) throws IOException
    {
  // 	BufferedReader br=null;
   	PersionService service=null;	
 
   	int choice = 0,id;
	String cName,uId;
	LocalDateTime dateandtime;
	List<Person> list=null;
	Person person=null;
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
		switch (choice) {
		case 1:
			System.out.print("Name: ");
			cName=br.readLine().toString();
			System.out.print("Date of Birth(yyyy-mm-dd): ");
			//DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/mm/dd");
			String str=br.readLine();
			dateandtime = LocalDateTime.parse(str);
			String arr[]=UUID.randomUUID().toString().split("-");
			Person thePerson=new Person((arr[0]+arr[1]), dateandtime, cName);
			person=service.createPerson(thePerson);
			System.out.println("Create Customer Sucess "+person);
			break;
			
		case 2:
			list=service.getAllPersons();
			System.out.format("%-20s%-20s%-20s%-20s\n","UID","NAME","DATEOFBIRTH AND TIME");
			list.forEach(c->{System.out.format("%-20s%-20s%-20s%-20s\n",c.getId(),c.getName(),c.getDateandtime());});
			break;
			
		case 3:
			System.out.print(" ID: ");
			id=Integer.parseInt(br.readLine().toString());;
			person=service.getPersonByid(id);
			if(list.isEmpty())
			{
				System.out.println("no such id found");
			}
			else {
				Person c=list.get(0);
				System.out.println("customer found: "+c);
			}
			break;
			
		case 4:	
			System.out.print(" ID : ");
			id=Integer.parseInt(br.readLine().toString());
			person=service.getPersonByid(id);
			if(list.isEmpty())
			{
				System.out.println("no such id found");
			}
			else {
				Person p=list.get(0);
				System.out.print("Name: ");
				cName=br.readLine().toString();
				System.out.print("Date of Birth: ");
				//DateTimeFormatter dateFormat1 = DateTimeFormatter.ofPattern("mm/dd/yyyy");
				String str1=br.readLine();
				dateandtime = LocalDateTime.parse(str1);
				p.setName(cName);
				p.setDateandtime(dateandtime);
				person=service.updatePerson(p.getId());
				System.out.println("customer updated: "+person);
			}
			break;
			
		case 5:
			System.out.print(" ID : ");
			id=Integer.parseInt(br.readLine().toString());;
			person=service.getPersonByid(id);
			if(list.isEmpty())
			{
				System.out.println("No such UID found");
			}
			else 
			{
				service.deletePerson(id);
				System.out.println("Deletion sucessfull...");
				
			}
			break;
			
		case 0:
			System.exit(0);
			break;
			
		default:
			System.out.println("invalid choice");
			break;
		}

	} while (choice != 0);

}
}