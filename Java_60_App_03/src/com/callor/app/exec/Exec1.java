package com.callor.app.exec;

public class Exec1 {
	/*
	 * 수행과제
	 * 1. random() 메서드를 사용하여
	 * 		1~100까지 임의의 정수를 생성하여 변수에 저장
	 * 2. 변수에 저장된 값이 짝수인지 홀수인지 판별하여 console 에 출력
	 * 3. 이 과정을 10회 반복
	 * 
	 * 위와 같은내용
	 * 1. for()반복문으로 10번 반복하면서
	 * 2. 1~100까지 임의 정수를 생성하고
	 * 3. 짝수인지 홀수인지 판별
	 */
	
	public static void main(String[] args) {
		int intRan = 0;
		for(int i = 0; i < 10 ; i++) {			
			intRan = (int)(Math.random() * 100) + 1;
			if(intRan % 2 != 0) {
				System.out.println(intRan+"\t홀수");
			} else {
				System.out.println(intRan+"\t짝수");
			}
		}
	}
}
