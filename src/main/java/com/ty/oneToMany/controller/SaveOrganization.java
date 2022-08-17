package com.ty.oneToMany.controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.oneToMany.dao.OrganizationBusDao;
import com.ty.oneToMany.dto.Bus;
import com.ty.oneToMany.dto.Organization;

public class SaveOrganization {
	public static void main(String[] args) {

		OrganizationBusDao dao = new OrganizationBusDao();
		Organization organization = new Organization();
		organization.setName("KSRTC");
		organization.setAddress("Bangalore");

		Bus bus1 = new Bus();
		bus1.setCapacity(44);
		bus1.setType("sleeper");

		Bus bus2 = new Bus();
		bus2.setCapacity(50);
		bus2.setType("general");

		List<Bus> bus = new ArrayList<Bus>();
		bus.add(bus1);
		bus.add(bus2);

		organization.setBus(bus);

		dao.saveBusDetailsInOrganization(organization, bus);
	}

}
