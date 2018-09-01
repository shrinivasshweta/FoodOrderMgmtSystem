package com.stackroute.foodOrderMgmtSys.model;

import java.util.List;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Order {
    @Id
    String id;

    private String restaurantId;
    private List<ItemQuantity> items;
    private int totalPrice;
    private String paymentId;
    private Customer customerInfo;
    
    

    public Order(String id, String restaurantId, List<ItemQuantity> items, int totalPrice, String paymentId,
			Customer customerInfo) {
		super();
		this.id = id;
		this.restaurantId = restaurantId;
		this.items = items;
		this.totalPrice = totalPrice;
		this.paymentId = paymentId;
		this.customerInfo = customerInfo;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getRestaurantId() {
		return restaurantId;
	}



	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}



	public List<ItemQuantity> getItems() {
		return items;
	}



	public void setItems(List<ItemQuantity> items) {
		this.items = items;
	}



	public int getTotalPrice() {
		return totalPrice;
	}



	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}



	public String getPaymentId() {
		return paymentId;
	}



	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}



	public void setCustomerInfo(Customer customerInfo) {
		this.customerInfo = customerInfo;
	}



	public Customer getCustomerInfo() {
        return customerInfo;
    }
    
    
}