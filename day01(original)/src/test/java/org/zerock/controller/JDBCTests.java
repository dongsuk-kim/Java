package org.zerock.controller;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;


@Log4j
public class JDBCTests {

	@Test
	public void testConnect() throws Exception{
		log.info("testConnection.........");
		
		Class clz = Class.forName("com.mysql.cj.jdbc.Driver"); // cj 넣는것이 최신버전
		log.info(clz);
		
		// 강사님이 시스템 환경설정에 id가 한글로 되어있어서 192.168.0.45 내 ip가 안잡히는 거라고 함.
		// 해서 127.0.0.1로 입력해주고 경로가 제대로 들어갔는지 확인 할 수 있음.
		String url = "jdbc:mysql://127.0.0.1/springex?serverTimezone=Asia/Seoul";
		String username = "springuser";
		String password = "springuser";
		// 강사님 ip 56
		
		Connection con = DriverManager.getConnection(url,username,password);
		
		log.info(con);
		
		
	}
	
}






