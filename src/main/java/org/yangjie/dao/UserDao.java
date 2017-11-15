package org.yangjie.dao;

import org.yangjie.entity.User;

public interface UserDao {
	
	public User select(String username, String password);
	
	public boolean insert(User user);
	
}
