package com.wy.entity;

import java.util.List;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import com.wy.util.SqlProvider;

/**
 * 注解的方式进行SQL语句
 * @author Sinon
 */
public interface UserMapper {
	
	@SelectProvider(type=SqlProvider.class,method="selectUser")
	public User selectUser(int id);
	@SelectProvider(type=SqlProvider.class,method="selectAll")
	public List<User> selectAll();
	@InsertProvider(type=SqlProvider.class,method="addUser")
	public void addUser(User user);
	@UpdateProvider(type=SqlProvider.class,method="updateUser")
	public void  updateUser(User user);
	@DeleteProvider(type=SqlProvider.class,method="deleteUser")
	public void deleteUser(int id);
}
