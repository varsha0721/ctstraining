package comm.myproject.hibernateonetoone.service;

import java.io.IOException;
import java.util.List;

import comm.myproject.hibernateonetoone.entity.Person;

//import comm.example.entity.Person;

public interface PersonService {
	public Person createPerson(Person person);
	public List<Person> getAllPersons();
	public Person getPersonByid(Integer id);
	public Person updatePerson(Integer id) throws IOException;
	public void deletePerson(Integer id);

}
