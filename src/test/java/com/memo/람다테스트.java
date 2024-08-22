package com.memo;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class 람다테스트 {
	
	@Test
	void 람다테스트1() {
		List<String> fruits = List.of("apple", "banana", "cherry");
		fruits
		.stream() // 하나씩 꺼내서 돌고 있고 (반복문 X)
		.filter(element -> element.startsWith("b")) // b로 찾고
		.forEach(element -> log.info("### {}", element)); // 또 돌려
	}
	
	@Test
	void 람다테스트2() {
		List<String> fruits = List.of("apple", "banana", "cherry");
		
		fruits = fruits
		.stream()
		.map(element -> element.toUpperCase())
		.collect(Collectors.toList()); // stream to list
		
		log.info("$$$ {}", fruits);
		
		
	}
}
