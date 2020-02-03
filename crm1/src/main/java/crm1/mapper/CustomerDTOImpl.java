package crm1.mapper;

import org.mapstruct.Mapper;

import crm1.model.Customer;
import crm1.model.CustomerDto;
@Mapper
public interface CustomerDTOImpl {

	public Customer customerDtoToCustomer(CustomerDto dto);
	public CustomerDto customerToCustomerDto(Customer customer);
}