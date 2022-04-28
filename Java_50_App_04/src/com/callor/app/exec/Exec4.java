package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

public class Exec4 {
/*
 * 정수형 리스트를 생성하고
 * 1~100까지의 임의의 정수 100개를 생성하여 추가
 * 리스트에 담긴 정수들 중
 * 55이상의 정수가
 * 		"가장 마지막으로" 나타난 경우를 찾아서
 * 위치와 값을 함께 출력
 */
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		for(int i = 0; i < 100; i++) {
			int num = (int)(Math.random() * 100) + 1;
			nums.add(num);
		}
		int last = 0;
		int count = 0;
		for(int index = 0; index < nums.size(); index++) {
			if(nums.get(index) >= 55) {
				last = nums.get(index);
				count = index;
			}
		}
		System.out.printf("위치 : %d\t 값 : %d", count, last);
	}
}
