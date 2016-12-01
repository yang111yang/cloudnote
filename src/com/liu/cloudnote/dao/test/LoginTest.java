package com.liu.cloudnote.dao.test;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.liu.cloudnote.dao.UserDao;
import com.liu.cloudnote.entity.User;


public class LoginTest {

	@Test
	public void loginTest() {
		String con = "spring-mybatis.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(con);
		UserDao dao = ac.getBean("userDao", UserDao.class);
		User user = dao.findByName("demo");
		Assert.assertNotNull(user);
	}

}
