package com.callor.var;

public class Var_05 {
	public static void main(String[] args) {
		
		int intNum1 = 0;
		int intNum2 = 0;
		
		int intSum = 0;
		
		intNum1 = 55;
		intNum2 = 77;
		intSum = intNum1 + intNum2;
		System.out.println(intNum1);
		System.out.println(intNum2);
		System.out.println(intSum);
		
		// println 에서 ln을 빼면 줄바꿈이 안됨 ln(New Line)(line feed라고도 함)
		System.out.print(intNum1); 
		System.out.print(" + "); 
		System.out.print(intNum2);
		System.out.print(" = "); 
		System.out.println(intSum);

		System.out.println(intNum1 
				+ " + " 
				+ intNum2 
				+ " = " 
				+ intSum); // 보기에 복잡해서 안좋은코드
		
		intNum1 = 101;
		intNum2 = 202;// form으로 해서 변수 값이 바껴도 손대지 않고 계산 가능
		
		System.out.printf("%d + %d = %d\n", intNum1, intNum2, intSum);
		//printf (f = form), %d 자리에 변수들이 들어감, \n(줄바꿈(New Line))
		System.out.printf("%d x %d = %d\n", intNum1, intNum2, intNum1 * intNum2);
		System.out.printf("%d - %d = %d\n", intNum1, intNum2, intNum1 - intNum2);
		System.out.printf("%d / %d = %d\n", intNum1, intNum2, intNum1 / intNum2);
		
		
	}
}
