package com.ty.oneToMany.controller;

import com.ty.oneToMany.dao.FoodOrderItemsDao;

public class SaveItemsBasedOnOrder {
public static void main(String[] args) {
	
	FoodOrderItemsDao dao=new FoodOrderItemsDao();
	dao.saveItemsBasedOnOrder();
}
}
