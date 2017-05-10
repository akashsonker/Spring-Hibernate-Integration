package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.demo.model.UserModel;
public class UserService {
	@Autowired
	private HibernateTemplate template;
	public void operations(){
		UserModel user=new UserModel();
		user.setName("Akash");
		user.setCity("Lucknow");
		template.save(user);
	}

}
