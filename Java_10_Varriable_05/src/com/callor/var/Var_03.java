package com.callor.var;

public class Var_03 {
	public static void main(String[] args) {
	
//		수행과제
//		두개의 실수(double)형 변수를 선언하고
//		Math.random()을 사용하여 1~1000 범위의 임의의 실수를
//		각각 생성하여 저장하고
//		두 실수의 4칙 연산을 수행하여 printf() or println()으로 Console에 출력
		
		// douRan1 = 0.0000 ~ 0.9999 범위의 실수가 생성되어 저장
		double douRan1 = Math.random();
			
		/*
		 * Math.random() 이 실행된 결과가 담긴 douRan1 변수의 값에
		 * 1000 을 곱하여 다시 douRan1 에 저장하라
		 * douRan1 = douRan1 * 1000; 과 같다
		 * douRan1 : 0.000 ~ 999.999 범위의 실수가 저장
		 */
		douRan1 *= 1000;
		
		/*
		 * douRan1 에 담긴 값에 1을 더하여 다시 douRan1 에 저장
		 * douRan1 : 1.000~ 1000.999 범위의 실수가 저장
		 */
		douRan1 ++;
		
		//정수값으로 변환
		//intRan1 : 1 ~ 1000 범위의 정수가 저장
		int intRan1 = (int)douRan1;
		
		double douRan2 = Math.random() * 1000 + 1;
		
		int intRan2 = (int)douRan2;
		
		int intSum = intRan1 + intRan2;
		int intDes = intRan1 - intRan2;
		int intMul = intRan1 * intRan2;
		int intDiv = intRan1 / intRan2;
		
		System.out.printf("\t%d + %d = %d\n",intRan1,intRan2,intSum);
		System.out.printf("\t%d - %d = %d\n",intRan1,intRan2,intDes);
		System.out.printf("\t%d x %d = %d\n",intRan1,intRan2,intMul);
		System.out.printf("\t%d ÷ %d = %d\n",intRan1,intRan2,intDiv);
	}
}
