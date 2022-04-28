package com.callor.app.exec;

public class Exec1 {
	/*
	 * - 정수형 배열 100개를 선언하고
	 * 		각요소에 1~100까지의 임의의 정수 저장
	 * - 각 배열 요소에 담긴 정수 중
	 * - 55이상의 정수 리스트 전체를 출력
	 */
	public static void main(String[] args) {
		int[] nums = new int[100] ;
		for(int i = 0; i < nums.length; i++) {
			int num = (int)(Math.random() * 100) + 1;
			nums[i] = num;
		}
		for(int i = 0; i < nums.length; i++) {
			if(!(nums[i] < 55)) {
				System.out.println("55 이상인 수는 : " + nums[i]);
			}
		}
	}
}
