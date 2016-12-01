package com.liu.cloudnote.dao;

import com.liu.cloudnote.entity.User;

public interface UserDao {
	
	public User findByName(String adminCode);
	
}
