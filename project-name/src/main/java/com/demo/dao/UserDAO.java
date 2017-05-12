package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.model.UserModel;

@Repository
public class UserDAO {
	@Autowired
	private HibernateTemplate template;
	
	@Transactional
	public void operations() {
		template.setCheckWriteOperations(false);
		UserModel user = new UserModel();
		user.setName("Akash");
		user.setCity("Lucknow");
		template.save(user);
	}
}
