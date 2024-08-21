package com.memo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.function.Function;

import org.junit.jupiter.api.Test;

public class EnumTest2 {
	
	// 계산형 타입이다
	public enum CalcType {
		// 열거형 정의
		CALC_A(value -> value),
		CALC_B(value -> value * 10),
		CALC_C(value -> value * 3),
		CALC_ETC(value -> 0);
		
		// 필드 정의 => enum에 정의된 function
		private Function<Integer, Integer> expression;
		
		// 생성자
		CalcType(Function<Integer, Integer> expression) {
			this.expression = expression; // 외부에 있는 걸 내부에 저장한다.(위에 있는 CALC_A ~ CAL_ETC)
		}
		
		// 계산 적용 메소드
		public int calculate(int value) {
			return expression.apply(value); // this.value와 같다. 이미 적용되고 있다.
		}
		
		
	}
	
	@Test
	void 계산테스트() {
		// given 
		CalcType ctype = CalcType.CALC_B; //자료형 CalcType
		
		// when
		int result = ctype.calculate(500);
		
		// then
		assertEquals(5000, result);
		
		
	}
}



