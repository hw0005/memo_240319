package com.memo;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ToString
@AllArgsConstructor
public class 메소드레퍼런스 {
	
	
	public class Person() {
		private String name;
		private int age;
		
		public void printInfo() {
			log.info("### []", this);
		}
	}
	
	
	@Test
	void 메소드레퍼런스테스트() {
		List<Person> people = new ArrayList<>();
		people.add(new Person("신보람"), 30);
		people.add(new Person("김바다"), 16);
		
		// 객체 안에 있는 메소드 호출
		//people.forEach(p -> p.printInfo());
		people.forEach(Person::printInfo);
		
		//객체를 println로 출력
		//people.forEach(p -> System.out.println(p)); // 람다
		people.forEach(System.out::println);
		
	}
}