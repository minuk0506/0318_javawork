package com.callor.app.exec;
/*
 * 1. 정수형 배열 10개를 선언하고
 * 2. 1~100까지 임의의 정수를 생성하여 배열에 저장
 * 3. 배열의 리스트를 보여주고
 * 4. 배열에 저장된 정수들의 합을 구하여 console 에 출력
 */
public class Exec3 {

	public static void main(String[] args) {
		
		int[] num = new int[10];
		int length = num.length;
		int sum = 0;
		float avg = 0;
		
		for(int i = 0; i < length; i++) {
			num[i] = (int)(Math.random() * 100) + 1;
		}
		for(int nums : num) {
			System.out.println(nums);
		}
//		for(int i = 0; i < length; i++) {
//			System.out.println(i + "번째 값은 " + num[i]);
//		}
		
		for(int nums : num) {
			sum += nums;
		}
//		for(int i = 0; i < length; i++) {
//			sum += num[i];
//		}
		System.out.println("배열의 합은 " + sum);
		
//		avg = sum;
//		avg /= length;
		avg = (float)sum / length;
		System.out.println("평균은 "+ avg);
		
		/*
		 * 총점을 구하는 연산이 없다면
		 * 평균을 구할때 먼저 총점을 나누어 평균을 나누는 것이 좋다
		 * 
		 * 각 항목의 평균을 구하여 누적 덧셈을 하는 것은
		 * 연산 오차를 일으킬 수 있다
		 */
	}
}
