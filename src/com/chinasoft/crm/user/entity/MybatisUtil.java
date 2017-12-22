package com.chinasoft.crm.user.entity;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {

	private static SqlSessionFactory sqlSessionFactory=null;
	
	//private static SqlSession sqlSession=null;
	
	static {
		sqlSessionFactory= new  SqlSessionFactoryBuilder().build(MybatisUtil.class.getResourceAsStream("SqlMapConfig.xml"));
		//sqlSession=sqlSessionFactory.openSession();
		
	}
	
	public static SqlSession getSqlSession(boolean flag){
		return sqlSessionFactory.openSession(flag);
	}
	
	public static SqlSession getSqlSession(){
		return sqlSessionFactory.openSession();
	}
	
}
