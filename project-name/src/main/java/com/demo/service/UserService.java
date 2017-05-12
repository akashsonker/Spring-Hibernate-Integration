package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.UserDAO;
@Service
public class UserService {
	@Autowired
	private UserDAO dao;
	public void addUser(){
		dao.operations();
	}

}
