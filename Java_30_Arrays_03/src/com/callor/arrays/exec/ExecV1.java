package com.callor.arrays.exec;

public class ExecV1 {

	public static void main(String[] args) {
		/*
		int intNum = (int) (Math.random() * 100) + 1;

		if (intNum % 2 == 0) {
			System.out.println(intNum + "은 짝수");
		} else {
			System.out.println(intNum + "은 짝수가 아니다");
		}
		*/
		
		int intNum = 0;
		intNum = (int) (Math.random() * 100) + 1;
		
		boolean bEven = false;
		// intNum 변수를 2로 나눈 나머지가 0이냐
		// intNum 변수에 담긴 값을 2로 나눈 나머지가 0이냐
		// 0이면 true가 bEven에 저장, 아니면 false 가 bEven 에 저장
		bEven = (intNum % 2) == 0;
		
		if(bEven) {
			System.out.println(intNum + "는 짝수");
		} else {
			System.out.println(intNum + "는 짝수가 아님");
		}
		
	}
}
