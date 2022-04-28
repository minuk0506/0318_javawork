package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

public class Exec3 {
/*
 * 정수형 리스트를 생성하고
 * 1~100까지의 임의의 정수 100개를 생성하여 추가
 * 리스트에 담긴 정수들 중
 * 55 이상의 정수가 "최초로 몇 번째" 에서
 * 		나타나는가 찾아서
 * 위치와 값을 함께 출력
 */
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		for(int i = 0; i < 100; i++) {
			int num = (int)(Math.random() * 100) + 1;
			nums.add(num);
		}
		int count = 0;
		for(int num : nums) {
			if(num >= 55) {
				System.out.printf("위치 : %d\t 값 : %d", count, num);
				break;
			}
			count ++;
		}
	}
}
