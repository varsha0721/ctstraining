package comm.myproject.hibernateonetoone.dao;

import java.io.IOException;
import java.util.List;

import comm.myproject.hibernateonetoone.entity.Person;

public interface PersonDAO {
	public Person createPerson(Person person);
	public List<Person> getAllPersons();
	public Person getPersonByid(Integer id);
	public Person updatePerson(Integer id) throws IOException;
	public void deletePerson(Integer id);

}
