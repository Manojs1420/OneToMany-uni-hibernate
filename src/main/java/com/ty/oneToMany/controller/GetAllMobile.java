package com.ty.oneToMany.controller;

import com.ty.oneToMany.dao.MobileSimDao;
import com.ty.oneToMany.dto.Mobile;

public class GetAllMobile {
	public static void main(String[] args) {
		
		MobileSimDao dao = new MobileSimDao();
		Mobile mobile=dao.GetMobile(1);
		System.out.println(mobile);
		
	}

}
