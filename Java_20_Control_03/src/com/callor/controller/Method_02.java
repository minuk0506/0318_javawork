package com.callor.controller;

public class Method_02 {
	public static void main(String[] args) {
		
		/*
		 * 수행과제
		 * add(), multi() 를 선언하고
		 * 1 ~ 100까지 범위의 임의의 정수 2개를 생성
		 * add() 는 덧셈, multi()는 곱셈 결과를 return
		 * main() 에서 add(), multi() 를 호출하여
		 * 결과를 변수에 담고 두 변수의 값을 덧셈하여
		 * console 에 출력
		 */
		
		int intAdd = add();
		int intMulti = multi();
		
		int intSum = intAdd + intMulti;
		
		System.out.println(intSum);
		
	}
	public static int add() {
		
		int intNum1 = (int)(Math.random() * 100 ) + 1;
		int intNum2 = (int)(Math.random() * 100 ) + 1;
		
		return intNum1 + intNum2;
	}
	public static int multi() {
		
		int intNum1 = (int)(Math.random() * 100 ) + 1;
		int intNum2 = (int)(Math.random() * 100 ) + 1;
		
		return intNum1 * intNum2;
		
	}
}