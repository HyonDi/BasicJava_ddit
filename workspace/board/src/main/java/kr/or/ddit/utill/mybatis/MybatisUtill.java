package kr.or.ddit.utill.mybatis;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class MybatisUtill {
	static SqlSessionFactory sqlSessionFactory;

	static{
		//mybatis config 파일을 사용하여 SqlSessionFactory 객체 생성 
	 	String resource = "kr/or/ddit/config/mybatis/mybatis-config.xml";
	 	InputStream inputStream = null;
	 	try {
		 inputStream = Resources.getResourceAsStream(resource);
	 	} catch(IOException e){
	 		e.printStackTrace();
	 	}
	 	
	 	sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//	 	SqlSession sqlSession = sqlSessionFactory.openSession();
	}
	public static SqlSession getSqlSession(){
		return sqlSessionFactory.openSession();
	}
}
