package com.wy.entity;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * 注解的方式进行SQL语句
 * @author Sinon
 */
public interface UserMapper {
	
	@Select("select * from user where id=#{id}")
	public User selectUser(int id);
	@Select("select * from user")
	public List<User> selectAll();
	@Insert("insert into user (userName,userPwd) values (#{userName},#{userPwd})")
	public void addUser(User user);
	@Update("update user set userName=#{userName},userPwd=#{userPwd} where id=#{id}")
	public void  updateUser(User user);
	@Delete("delete from user where id=#{id}")
	public void deleteUser(int id);
}
