package crm1.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;

import crm1.mapper.Customermapper;
import crm1.model.Customer;
import crm1.model.CustomerDto;
import crm1.util.CustomerUtil;

public class CustomerDAOImpl implements CustomerDAO{
	private Session session;
	private EntityManager entityManager;

	{
		session=CustomerUtil.getMySessionFactory().openSession();
		
		session.getTransaction().begin();
		entityManager=session.
				getEntityManagerFactory().createEntityManager();
		session.getTransaction().commit();
	}

	@Override
	public Customer createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		entityManager.getTransaction().begin();
		entityManager.persist(customer);
		entityManager.getTransaction().commit();
		return customer;
	}

	@Override
	public List<Customer> getAllCustomer() {
		Query query=entityManager.createQuery("from Customer",Customer.class);
		return query.getResultList();
	}

}