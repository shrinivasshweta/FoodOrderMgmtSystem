package com.stackroute.foodOrderMgmtSys.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.stackroute.foodOrderMgmtSys.model.Restaurant;


public interface RestaurantRepository extends MongoRepository<Restaurant,String>{

	List<Restaurant> findAllRestaurantByRestaurantId(String restaurantId);
	}
