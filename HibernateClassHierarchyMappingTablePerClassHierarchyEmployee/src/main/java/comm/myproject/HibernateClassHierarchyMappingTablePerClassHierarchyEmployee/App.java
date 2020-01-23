package comm.myproject.HibernateClassHierarchyMappingTablePerClassHierarchyEmployee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class App 
{
    public static void main( String[] args )
    {
    	Session session=null;
		try {
			
			session=new Configuration().configure("hibernate.cfg.xml")
					.addAnnotatedClass(Employee.class).addAnnotatedClass(RegularEmployee.class)
					.addAnnotatedClass(ContractEmployee.class).buildSessionFactory()
					.getCurrentSession();
			Employee emp1=new Employee("Rahul");
			Employee emp2=new RegularEmployee( "Virat",2000 , 54878879);
			Employee emp3=new ContractEmployee("Dhoni", 455, "2yr");
			session.getTransaction().begin();
			session.save(emp1);
			session.save(emp2);
			session.save(emp3);
			session.getTransaction().commit();
			System.out.println("done");
		}
			finally {
				//
			}
		
    }
}
