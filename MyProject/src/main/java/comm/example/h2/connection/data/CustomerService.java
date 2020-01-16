package comm.example.h2.connection.data;

import java.sql.SQLException;
import java.util.List;

public interface CustomerService {
	public Customer createCuastomer(Customer customer) throws SQLException;
	public List<Customer> findById(String uId) throws SQLException;
	public List<Customer> getAllCustomers() throws SQLException;
	public Customer updateCustomer(Customer customer,String uId) throws SQLException;
	public void deleteCustomer(String uId) throws SQLException;
}