package com.wy.entity;

import java.util.List;

public interface UserMapper {
	public User selectUser(int id);
	public List<User> selectAll();
	public void addUser(User user);
	public void  updateUser(User user);
	public void deleteUser(int id);
}
