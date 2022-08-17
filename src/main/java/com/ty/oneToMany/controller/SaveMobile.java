package com.ty.oneToMany.controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.oneToMany.dao.MobileSimDao;
import com.ty.oneToMany.dto.Mobile;
import com.ty.oneToMany.dto.Sim;

public class SaveMobile {

	public static void main(String[] args) {

		MobileSimDao dao = new MobileSimDao();
		Mobile mobile = new Mobile();
	
		Sim sim1 = new Sim();
		Sim sim2 = new Sim();

		mobile.setName("OPPO");
		mobile.setCost(20000.00);
		
	
		sim1.setImrc(3456789);
		sim1.setProvider("Idea");
		sim2.setImrc(234567);
		sim2.setProvider("JIO");

		List<Sim> l=new ArrayList<Sim>();
		l.add(sim1);
		l.add(sim2);

		mobile.setSim(l);
		
		
		
		
		dao.saveMobileAndSimDetails(mobile,l);
	}

}
