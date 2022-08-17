package com.ty.oneToMany.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.oneToMany.dto.Mobile;
import com.ty.oneToMany.dto.Sim;

public class MobileSimDao {

	public void saveMobileAndSimDetails(Mobile mobile,List<Sim> sim) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(mobile);
		
		entityManager.persist(sim.get(0));
		entityManager.persist(sim.get(1));
		entityTransaction.commit();
	}

	public Mobile GetMobile(int id) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();

		Mobile mobile = entityManager.find(Mobile.class, id);
		if (mobile != null) {
			return mobile;
		}
		return null;
	}
	
	
}
