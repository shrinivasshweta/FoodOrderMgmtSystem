package com.stackroute.foodOrderMgmtSys.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.stackroute.foodOrderMgmtSys.model.Menu;


public interface MenuRepository extends MongoRepository<Menu,String >{

	List<Menu> findAllRestaurantId(String restaurantId);
	

}
