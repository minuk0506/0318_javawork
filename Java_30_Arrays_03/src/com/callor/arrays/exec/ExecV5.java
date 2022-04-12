package com.callor.arrays.exec;

public class ExecV5 {
	public static void main(String[] args) {
		// 1~100까지 수를 덧셈하여 출력
		/*
		int intNum = 0;

		for (int i = 1; i < 101; i++) {
			intNum += i;
		}
		System.out.println(intNum);
		*/
		
		int intNum = 0;

		for (int i = 0; i < 100; i++) {
			intNum += (i + 1);
		}
		System.out.println(intNum);
	}
}
