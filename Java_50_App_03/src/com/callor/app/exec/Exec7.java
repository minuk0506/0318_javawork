package com.callor.app.exec;

public class Exec7 {

	/*
	 * - Exec7 클래스 생성
	 * - 정수형 배열 선언하고
	 * 		각 요소에 1~100까지의 임의의 정수 저장
	 * - 각 배열 요소에 담긴 정수 중
	 * - 소수의 개수를 세어 출력
	 */
	
	public static void main(String[] args) {
		
		int[] intNum = new int[10];
		int num = 0;
		int index = 0;
		int i = 0;		
		int intRsl = 0;
		
		for(index = 0 ; index < intNum.length ; index++) {
			num = (int)(Math.random() * 100) + 2 ;
			intNum[index] = num;
		}
		
		for(index = 0 ; index < intNum.length ; index++) {
			for(i = 2 ; i < intNum[index] ; i++) {
				if(intNum[index] % i == 0) {
					break;
				} 
			} 
			if(i+1 < intNum[index]){
				continue;
			} else {
				intRsl += 1;
				System.out.println("값" + intRsl);
			}
		}
		
		System.out.println("값은" + intRsl);
	}
}
