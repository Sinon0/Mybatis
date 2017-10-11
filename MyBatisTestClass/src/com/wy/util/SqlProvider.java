package com.wy.util;

public class SqlProvider {
	public String selectUser(){
		return "select * from user where id=#{id}";
	}
	public String selectAll(){
		return "select * from user";
	}
	public String addUser(){
		return "insert into user (userName,userPwd) values (#{userName},#{userPwd})";
	}
	public String updateUser(){
		return "update user set userName=#{userName},userPwd=#{userPwd} where id=#{id}";
	}
	public String deleteUser(){
		return "delete from user where id=#{id}";
	}
}
