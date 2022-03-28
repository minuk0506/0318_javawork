package com.callor.var;

public class Var_01 {
	
	//main method
	public static void main(String[] args) {
		
//		수행과제
//		두개의 정수형 변수를 선언하고
//		각각 33과 55를 저장
//		두 정수의 4칙연산을 수행하고
//		4칙연산 결과를 변수에 저장
//		변수에 저장된 결과를 printf()를 사용하여 출력
		
		
		// 변수를 선언하고 clear(0을 저장, 대입)
		int intNum1 = 0;
		int intNum2 = 0;
		
		// 변수에 값 저장하기
		// 변수에 어떤 값을 저장하면 이미 저장된 값은? : 무조건 사라진다
		intNum1 = 33;
		intNum2 = 55;
		
		// 4칙연산 결과를 저장(보관)하기 위한 변수 선언 clear
		int intSum = 0;
		int intMin = 0;
		int intMul = 0;
		int intDiv = 0;
		
		//intNum1, intNum2 변수에 담긴 값을 읽어와서
		//4칙연산을 수행한 후 각각의 변수에 저장하기
		//변수에 담긴 값을 읽어서 연산을 수행한 후 다른 변수에 저장하기
		intSum = intNum1 + intNum2;
		intMin = intNum1 - intNum2;
		intMul = intNum1 * intNum2;
		intDiv = intNum1 / intNum2;
				
		// 화면에 form을 만든 후 출력하기
		System.out.printf("%d + %d = %d\n" , intNum1, intNum2, intSum);
		System.out.printf("%d - %d = %d\n" , intNum1, intNum2, intMin);
		System.out.printf("%d x %d = %d\n" , intNum1, intNum2, intMul);
		System.out.printf("%d ÷ %d = %d\n" , intNum1, intNum2, intDiv);
	}
}
