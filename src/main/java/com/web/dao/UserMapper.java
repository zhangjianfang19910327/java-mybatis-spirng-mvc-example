package com.web.dao;


import com.web.entity.User;

public interface UserMapper {
		
	
	   public User findUserByPassword(String password);
	   public User findUserByName(String name);
	   public int insertUser(String name,int number, String password);
	   public int updateUserNameByPassword(String name,String password);
}

