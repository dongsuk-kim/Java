package org.zerock.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.sample.Restaurant;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class DITest {
	
	@Autowired // 레스토랑 타입만 있는것 뿐 관계맺지 X 스프링이 알아서 해준다.
	// INFO : org.zerock.controller.DITest - Restaurant(chef=org.zerock.sample.KoreanChef@6e4784bc)
	private Restaurant store;  
	
	@Test
	public void testLoad() {
		
		log.info(store);
		
	}

}
