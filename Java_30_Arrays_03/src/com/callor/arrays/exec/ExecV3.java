package com.callor.arrays.exec;

public class ExecV3 {
	/*
	 * 정수형 배열 100개를 선언하고 Math.random()를 사용하여 1~100까지 임의의 수를 생성하고 각각 요소에 저장 배열의 각 요소에
	 * 저장된 수 중에서 "짝수가 몇 개" 인지 판별하여 출력하시오
	 */
	public static void main(String[] args) {

		int[] intNum = new int[100];
		// 짝수의 개수를 세어서 저장할 변수
		int intSum = 0;
		boolean bYes = true;

		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = (int) (Math.random() * 100) + 1;
		}
		for (int i = 0; i < intNum.length; i++) {
			bYes = (intNum[i] % 2) == 0;

			if (bYes) {
				intSum++;
			}
		}
		System.out.println("짝수는 " + intSum + " 개");

	}
}
