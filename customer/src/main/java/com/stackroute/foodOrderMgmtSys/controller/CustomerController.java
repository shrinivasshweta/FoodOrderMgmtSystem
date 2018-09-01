package com.stackroute.foodOrderMgmtSys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.foodOrderMgmtSys.model.Customer;
import com.stackroute.foodOrderMgmtSys.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}
	
	@PostMapping("/api/v1/customer")
	public ResponseEntity<?>  createCustomer(@RequestBody Customer customer)
	{
		
		ResponseEntity<?> responseEntity = null;
		
			try {
				
				customerService.registerCustomer(customer);
					responseEntity = new ResponseEntity<Customer>(customer, HttpStatus.CREATED);
			
			} catch (Exception e) {
				responseEntity = new ResponseEntity<Customer>(HttpStatus.CONFLICT);
			}
		
		return responseEntity;
		
	}
}
