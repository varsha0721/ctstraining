package comm.example.hibernate.service;

import java.io.IOException;
import java.util.List;

import comm.example.hibernate.dao.PersonDAO;
import comm.example.hibernate.dao.PersonDAOImpl;
import comm.example.hibernate.entity.Person;

public class PersionServiceImpl implements PersionService
{

	private PersonDAO dao;
	{
		dao=new PersonDAOImpl();
	}
	@Override
	public Person createPerson(Person person) {
		// TODO Auto-generated method stub
		return dao.createPerson(person);
	}

	@Override
	public List<Person> getAllPersons() {
		// TODO Auto-generated method stub
		return dao.getAllPersons();
	}

	@Override
	public Person getPersonByid(Integer id) {
		// TODO Auto-generated method stub
		return dao. getPersonByid( id);
	}

	@Override
	public Person updatePerson(Integer id) throws IOException {
		// TODO Auto-generated method stub
		return dao.updatePerson( id);
	}

	@Override
	public void deletePerson(Integer id) {
		// TODO Auto-generated method stub
		 dao.deletePerson(id);
	}

}
