package com.callor.var;

public class Var_06 {
	public static void main(String[] args) {
		
		// ( Math.random() *100 ) 괄호 쳐주는 이유는 int로 바뀌고 *100 하면 0 * 100 = 0 이기 때문
		int intAge = (int)(Math.random() * 100) + 10;
		
		String strName = "홍길동";
		
		//%d : 정수형, %f : 실수형, %s : 문자열형
		System.out.printf("\t%s 의 나이는 %d 이다\n",strName,intAge);
	}
}
