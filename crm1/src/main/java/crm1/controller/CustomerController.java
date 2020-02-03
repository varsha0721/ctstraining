package crm1.controller;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import crm1.mapper.CustomerDTOImpl;
import crm1.mapper.Customermapper;
import crm1.model.Customer;
import crm1.model.CustomerDto;
import crm1.service.CustomerService;
import crm1.service.CustomerServiceImpl;

public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerService service;
	private CustomerDTOImpl impl;
    
	@Override
	public void init() throws ServletException {
		
		super.init();
		service=new CustomerServiceImpl();
		impl=new Customermapper();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fName=request.getParameter("fName");
		String lName=request.getParameter("lName");
		String email=request.getParameter("email");
		CustomerDto cDto=new CustomerDto(UUID.randomUUID().toString(),fName, lName, email);
		Customer customer=service.createCustomer(impl.customerDtoToCustomer(cDto));
		if(customer!=null)
		{
			List<Customer> customers=service.getAllCustomer();
			request.setAttribute("SUCCESS", customers);
			RequestDispatcher view=request.getRequestDispatcher("success.jsp");
			view.forward(request, response);
		}
		else
		{
			RequestDispatcher view=request.getRequestDispatcher("error.html");
			view.forward(request, response);
		}
	}

}