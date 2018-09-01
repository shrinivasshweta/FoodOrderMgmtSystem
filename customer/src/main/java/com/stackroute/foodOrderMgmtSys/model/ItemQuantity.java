package com.stackroute.foodOrderMgmtSys.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ItemQuantity {
    private String itemName;
    private int itemPrice;
    private int itemQuantity;

}