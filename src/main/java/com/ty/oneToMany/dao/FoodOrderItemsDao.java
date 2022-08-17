package com.ty.oneToMany.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.oneToMany.dto.FoodOrder;
import com.ty.oneToMany.dto.Item;

public class FoodOrderItemsDao {

	public void saveItemsBasedOnOrder() {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=factory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		FoodOrder order=new FoodOrder();
		order.setCustomerName("kumaraswamy");
		order.setAddress("Ramanagara");
		order.setPhone(123455777l);
		
		Item item=new Item();
		item.setName("Muttonn Biryani");
		item.setCost(1000.00);
		item.setQuantity(5);
		
		Item item1=new Item();
		item1.setName("Chicken 65");
		item1.setCost(4000.00);
		item1.setQuantity(10);
		
		Item item2=new Item();
		item2.setName("Boti fry");
		item2.setCost(1500.00);
		item2.setQuantity(5);
		
		List<Item> l=new ArrayList<Item>();
		l.add(item2);
		l.add(item1);
		l.add(item);
		
		order.setItem(l);
		
		entityTransaction.begin();
		entityManager.persist(order);
		entityManager.persist(item);
		entityManager.persist(item1);
		entityManager.persist(item2);
		entityTransaction.commit();
		
		
	}
}
