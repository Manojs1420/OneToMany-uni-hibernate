package com.ty.oneToMany.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.oneToMany.dto.Bus;
import com.ty.oneToMany.dto.Organization;

public class OrganizationBusDao {
	
	public void saveBusDetailsInOrganization(Organization organization,List<Bus> bus) {
		
		

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(organization);
	for (int i = 0; i < bus.size(); i++) {
		entityManager.persist(bus.get(i));
	}
		entityTransaction.commit();
	
}
public Organization getBusByOrganizationId(int id) {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = factory.createEntityManager();
	
	Organization organization=entityManager.find(Organization.class, id);
	if(organization!=null) {
		return organization;
	}
	return null;
}


}
