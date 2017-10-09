package com.wy.test;

import java.io.IOException;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import com.wy.entity.User;
import com.wy.util.MybatisUtils;

public class MyTest {
	@Test
	public void testSelect() throws IOException {
		SqlSession session=MybatisUtils.openSession();
		String statement="com.wy.entity.UserMapper.selectUser";
		User user=session.selectOne(statement,1);
		System.out.println(user);
		session.close();
	}
	@Test
	public void testAll() throws IOException {
		SqlSession session=MybatisUtils.openSession();
		String statement="com.wy.entity.UserMapper.selectAll";
		List<User> list=session.selectList(statement);
		System.out.println(list);
		session.close();
	}
	@Test
	public void testInsert() throws IOException {
		SqlSession session=MybatisUtils.openSession();
		String statement="com.wy.entity.UserMapper.addUser";
		User user=new User();
		user.setUserName("Hebe");
		user.setUserPwd("123");
		session.insert(statement, user);
		session.commit();
		session.close();
	}
	@Test
	public void testUpdate() throws IOException {
		SqlSession session=MybatisUtils.openSession();
		String statement="com.wy.entity.UserMapper.updateUser";
		User user=new User();
		user.setId(1);
		user.setUserName("Jay");
		user.setUserPwd("123");
		session.update(statement, user);
		session.commit();
		session.close();
	}
	@Test
	public void testDelete() throws IOException {
		SqlSession session=MybatisUtils.openSession();
		String statement="com.wy.entity.UserMapper.deleteUser";
		session.delete(statement,3);
		session.commit();
		session.close();
	}
}


