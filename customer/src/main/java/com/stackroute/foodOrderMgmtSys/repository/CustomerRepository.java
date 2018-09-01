package com.stackroute.foodOrderMgmtSys.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.stackroute.foodOrderMgmtSys.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {

}
