package test;

import java.io.IOException;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import entity.Contact;
import entity.ContactMapper;
import entity.Student;
import entity.StudentMapper;
import utility.MybatisUtils;

public class test {
	@Test
	public void testAdd() throws IOException {
		//首先得到Session
		SqlSession session=MybatisUtils.openSession();
		StudentMapper studentMapper=session.getMapper(StudentMapper.class);
		Student student=new Student();
		student.setName("jay");
		student.setSex("gg");
		student.setPwd("123");
		student.setGrade("1");
		student.setPhone("18999999999");
		studentMapper.add(student);
		
		ContactMapper contactMapper=session.getMapper(ContactMapper.class);
		Contact contact=new Contact();
		contact.setName("kl");
		contact.setPhone("19200000000");
		contact.setSex("oo");
		contact.setRelation("gg");
		contact.setStudent(student);
		contactMapper.add(contact);
		
		session.commit();
		session.close();
	}
	@Test
	public void testSelect() throws IOException{
		SqlSession session=MybatisUtils.openSession();
//		StudentMapper studentMapper=session.getMapper(StudentMapper.class);
//		Student student=studentMapper.get(2);
//		System.out.println(student.getContact());
		ContactMapper contactMapper=session.getMapper(ContactMapper.class);
		Contact contact=contactMapper.get(1);
		System.out.println(contact.getStudent());
	}
}
