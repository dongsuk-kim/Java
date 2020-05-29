package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Service
@AllArgsConstructor
public class Restaurant {
	// 당신이 원하는 객체
	// 로직위주가 라이프사이클이 길다.
	
	@Setter(onMethod_ = { @Autowired, @Qualifier("korean") }) // 이렇게 쓰면 개방과 폐쇄방식에서 벗어난다. 어노테이션의 단점
	private Chef chef;
	
//	@Autowired @Qualifier("korean")
	
}




