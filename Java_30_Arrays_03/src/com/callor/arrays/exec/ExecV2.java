package com.callor.arrays.exec;

public class ExecV2 {
	/*
	 * 정수형 배열 100개를 선언하고 Math.random()을 사용하여 1~100까지 임의의 수를 생성하고 각각 요소에 저장 배열의 각 요소에
	 * 저장된 수가 짝수인가 아닌가를 판별하는 코드 작성
	 */

	public static void main(String[] args) {
		/*
		 * 
		 * int[] intNum = new int[100];
		 * 
		 * for (int i = 0; i < 100 ; i ++) { intNum[i] = (int)(Math.random() * 100) + 1;
		 * 
		 * if (intNum[i] % 2 == 0) { System.out.println(i + "번째 " + intNum[i] + " 짝수");
		 * } else { System.out.println(i + "번째 " + intNum[i] + " 짝수아님"); } }
		 */
		/*
		 * int[] intNum = new int[100]; int index = 0;
		 * 
		 * for (index = 0; index < 100; index++) { intNum[index] = (int) (Math.random()
		 * * 100) + 1; }
		 * 
		 * for (index = 0; index < 100; index++) {
		 * 
		 * if (intNum[index] % 2 == 0) { System.out.println(index + "번째 " +
		 * intNum[index] + " 짝수");
		 * 
		 * } else { System.out.println(index + "번째 " + intNum[index] + " 짝수아님"); } }
		 */
		/*
		 * int[] intNum = new int[100]; int index = 0;
		 * 
		 * for (index = 0; index < 100; index++) { intNum[index] = (int) (Math.random()
		 * * 100) + 1; }
		 * 
		 * boolean bYes = false;
		 * 
		 * for (index = 0; index < 100; index++) {
		 * 
		 * bYes = (intNum[index] % 2) == 0;
		 * 
		 * if (bYes) { System.out.println(index + "번째는 " + intNum[index] + " 짝수");
		 * 
		 * } else { System.out.println(index + "번째는 " + intNum[index] + " 짝수아님"); } }
		 */
		
		int[] intNum = new int[100];
		// for() 명령문의 선언부에서 변수를 선언하면
		// for() {} 이 끝날때 변수가 소멸된다
		// 같은 method 내에서 같은 이름의 변수를 계속 사용할 수 있다
		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = (int) (Math.random() * 100) + 1;
		}
		for (int i = 0; i < intNum.length; i++) {
			
			boolean bEven = (intNum[i] % 2) == 0;
			
			if (bEven) {
				System.out.printf("\t%d 는 짝수 \n", intNum[i]);
			} else {
				System.out.printf("\t%d 는 짝수가 아님\n", intNum[i]);
			}
		}
	}

}
