package com.callor.controller;

public class Mathod_01 {
	public static void main(String[] args) {
		
		/*
		 * 수행과제 - num()를 선언하고 1~100까지 범위의
		 * 임의의 정수 2개를 만든 후 두 수를 덧셈하여 결과를 return
		 * main() 에서 num() 를 호출하여 결과를 변수에 담고 console에 출력
		 */
		
		// num() 를 호출하여(실행하고) return 된 값을
		// intMethod 에 저장하기
		int intMethod = num();		
		System.out.println(intMethod);
		
	}
	// int num() { } : 어떤 정수(int)값을 리턴 하겠다.
	public static int num() {
		
		// 임의 정수 2개를 만들고 (변수에 저장하고)
		int intNum1 = (int)(Math.random() * 100) + 1;
		int intNum2 = (int)(Math.random() * 100) + 1;
		
		// 두 값을 덧셈하여 return
		int intSum = intNum1 + intNum2;
		return intSum;
		//return intNum1 + intNum2; 로 해도됨
		
	}
}