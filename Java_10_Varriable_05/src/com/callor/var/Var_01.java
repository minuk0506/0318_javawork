package com.callor.var;

public class Var_01 {
	
	public static void main(String[] args) {
		
		/*
		 * 수행과제 
		 * 두개의 실수(double)형 변수를 선언하고 Math.random()을 사용하여 
		 * 0보다 크거나 같고 1000보다 작은 범위의
		 * 임의의 실수를 각각 생성하여 저장 두 실수의 4칙 연산을 수행하여 println() 으로 Console 에 출력
		 */
		
		// 실수(double) 형으로 선언을 할 경우 0 보다는 0.0 처럼
		// 명확하게 표현하는 것이 좋다
		double douRan1 = 0.0;
		double douRan2 = 0.0;
		
		douRan1 = Math.random() * 1000;
		douRan2 = Math.random() * 1000;
		
		double douSum = 0;
		double douMin = 0;
		double douMul = 0;
		double douDiv = 0;
		
		douSum = douRan1 + douRan2;
		douMin = douRan1 - douRan2;
		douMul = douRan1 * douRan2; 
		douDiv = douRan1 / douRan2;
		
		System.out.println(douRan1 + " + " + douRan2 + " = " + douSum);
		System.out.println(douRan1 + " - " + douRan2 + " = " + douMin);
		System.out.println(douRan1 + " x " + douRan2 + " = " + douMul);
		System.out.println(douRan1 + " ÷ " + douRan2 + " = " + douDiv);
		
	}
}
