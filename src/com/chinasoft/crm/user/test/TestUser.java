package com.chinasoft.crm.user.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.chinasoft.crm.user.entity.User;

public class TestUser {
	@Test
	public void testSelectUser() throws IOException{
		
        String resource = "SqlMapConfig.xml";
        
       // InputStream is = TestUser.class.getClassLoader().getResourceAsStream(resource);
       
       // SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        Reader reader = Resources.getResourceAsReader(resource); 
        
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();
      
        String statement = "com.chinasoft.crm.user.entity.userMapping.getUser";
     
        User user = session.selectOne(statement, 1);
        System.out.println(user.getName());
	}
}

