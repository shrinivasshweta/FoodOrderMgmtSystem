package com.stackroute.foodOrderMgmtSys.service;

import com.stackroute.foodOrderMgmtSys.model.Customer;

public interface CustomerService {

	 Customer registerCustomer(Customer customer);

	    Customer updatecustomer(String customerId,Customer customer);

	    boolean deletecustomer(String customerId);
	    
	    Customer getcustomerById(String customerId);
}
