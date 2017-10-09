package com.wy.test;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import com.wy.entity.User;
import com.wy.entity.UserMapper;
import com.wy.util.MybatisUtils;

public class MapperTest {

	@Test
	public void testSelectAll() throws IOException {
		SqlSession session=MybatisUtils.openSession();
		UserMapper mapper=session.getMapper(UserMapper.class);
		List<User> list=mapper.selectAll();
		session.close();
		System.out.println(list);
	}
	@Test
	public void testSelect() throws IOException {
		SqlSession session=MybatisUtils.openSession();
		UserMapper mapper=session.getMapper(UserMapper.class);
		User user=mapper.selectUser(1);
		session.close();
		System.out.println(user);
	}
	@Test
	public void testInsert() throws IOException {
		SqlSession session=MybatisUtils.openSession();
		UserMapper mapper=session.getMapper(UserMapper.class);
		User user=new User();
		user.setUserName("Jay");
		user.setUserPwd("222");
		mapper.addUser(user);
		session.commit();
		session.close();
	}
	@Test
	public void testUpdate() throws IOException {
		SqlSession session=MybatisUtils.openSession();
		UserMapper mapper=session.getMapper(UserMapper.class);
		User user=new User();
		user.setId(5);
		user.setUserName("Hebe");
		user.setUserPwd("333");
		mapper.updateUser(user);
		session.commit();
		session.close();
	}
	@Test
	public void testDelete() throws IOException {
		SqlSession session=MybatisUtils.openSession();
		UserMapper mapper=session.getMapper(UserMapper.class);
		mapper.deleteUser(5);
		session.commit();
		session.close();
	}
}
