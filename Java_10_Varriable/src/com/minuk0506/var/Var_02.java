package com.minuk0506.var;

public class Var_02 {
	public static void main(String[] args) {
		
		// class가 달라지면 이름이 같은 변수도 선언할 수 있다
		int num1 = 100;
		int num2 = 200;
		
		
		int num3 = 0;
		int num4 = 0;
		// 변수에 값을 저장(할당, 대입)하거나
		// 읽을려면 반드시 이전에 변수가 선언되어 있어야 한다
		num3 = 200;
		num4 = 300;
		System.out.println(num3 + num4);
		
		// 이미 저장되 있는 값을 초기화 시키고 다음에 있는 값이 할당됨
		int num5 = 100;
		num5 = 0;
		num5 = 1000;
		System.out.println(num5);
		num5 = 99;
		System.out.println(num5);
		num5 = -1;
		System.out.println(num5);
		
	}
}
