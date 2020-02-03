package crm1.mapper;

import crm1.model.Customer;
import crm1.model.CustomerDto;

public class Customermapper implements CustomerDTOImpl {

	@Override
	public Customer customerDtoToCustomer(CustomerDto dto) {
		
		if(dto==null)
		{
			return null;
		}
		else
		{
			Customer customer=new Customer();
			customer.setUid(dto.getUId());
			customer.setFirstName(dto.getFirstName());
			customer.setLastName(dto.getLastName());
			customer.setEmail(dto.getEmail());
			return customer;
		}
		
	}

	@Override
	public CustomerDto customerToCustomerDto(Customer customer) {
		if(customer==null)
		{
			return null;
		}
		else {
			CustomerDto cDto=new CustomerDto();
			cDto.setUId(customer.getUid());
			cDto.setFirstName(customer.getFirstName());
			cDto.setLastName(customer.getLastName());
			cDto.setEmail(customer.getEmail());
			return cDto;
		}
	}

}