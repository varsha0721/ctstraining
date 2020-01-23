package comm.example.hibernate.service;

import java.io.IOException;
import java.util.List;

import comm.example.hibernate.entity.Person;

public interface PersionService 
{
	public Person createPerson(Person person);
	public List<Person> getAllPersons();
	public Person getPersonByid(Integer id);
	public Person updatePerson(Integer id) throws IOException;
	public void deletePerson(Integer id);
}
