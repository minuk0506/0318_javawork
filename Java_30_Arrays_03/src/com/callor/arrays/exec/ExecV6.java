package com.callor.arrays.exec;

public class ExecV6 {
/*
 * 정수형 배열 100개를 선언하고
 * Math.random()를 사용하여
 * 1~100까지 임의의 수를 생성하고 각각 요소에 저장
 * 배열의 각 요소에 저장된 수 중에서
 * "짝수의 리스트"를 예제처럼 출력하시오
 * 	짝수리스트
 * -------------------------
 * 2,	76,		54,		72,		28,
 * 86,	74,		92,		46,		92,
 * .
 * .
 * .
 * ========================
 */
	
	public static void main(String[] args) {
		
		int[] intNum = new int[100];
		boolean bYes = true;
		int intLn = 0;
		String strLine = "-";
		
		System.out.println("짝수리스트");
		System.out.println(strLine.repeat(50));
		
		for (int i = 0 ; i < 100 ; i ++ ) {
			intNum[i] = (int)(Math.random() * 100) + 1;
		}
		for (int i = 0 ; i < 100 ; i ++ ) {
			bYes = (intNum[i] % 2) == 0;
			if (bYes) {
				System.out.print(intNum[i] + ",\t");
				intLn ++ ;
				if (intLn % 5 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println("\n" + strLine.repeat(50));
	}
}
