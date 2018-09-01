package com.stackroute.foodOrderMgmtSys.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.foodOrderMgmtSys.model.Customer;
import com.stackroute.foodOrderMgmtSys.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public CustomerServiceImpl(CustomerRepository customerRepository) {
	super();
		this.customerRepository = customerRepository;
	}

	
	public Customer registerCustomer(Customer customer) {
		customer.setCreatedDate(new Date());

		customerRepository.insert(customer);
		return customer;

	}

	public Customer updatecustomer(String customerId, Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deletecustomer(String customerId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Customer getcustomerById(String customerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
