package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

public class Exec2 {
/*
 * 정수형 리스트를 생성하고
 * 1~100 까지의 임의의 정수 100개를 생성하여 추가
 * 리스트에 담긴 정수들 중
 * 55 이상의 정수들 리스트를 요소(위치)와 함께 출력
 */
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		for(int i = 0; i < 100; i++) {
			nums.add((int)(Math.random() * 100) + 1);
		}
		int count = 0;
		for(int num : nums) {
			if(num >= 55) {
				System.out.printf("값 : %d,\t위치 : %d\n", num, count);
			}
			count++;
		}
	}
}
