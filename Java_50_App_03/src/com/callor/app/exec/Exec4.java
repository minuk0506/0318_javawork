package com.callor.app.exec;

public class Exec4 {

	/*
	 * Exec4 클래스 생성 
	 * 1~100까지의 임의의 정수 1개를 생성 
	 * 생성한 정수가 소수(Prime수) 인지 판별하시오 
	 * 소수 
	 * - 1과 자신 이외의 약수를 갖지 않는 수 
	 * - 2부터 (자신-1)까지 수로 나누었을 때 
	 * 나머지가 한번도 0이 나오지 않는 수
	 */

	public static void main(String[] args) {

		int num = (int) (Math.random() * 100) + 1;
		int prime = 0;
		
		for (int i = 1; i < num + 1; i++) {
			if (num % i == 0) {
				prime++;
				/*
				 *  이미 소수를 찾았더라도 i < num +1 조건을 만족 할 때 까지 진행됨
				 *  조건 만족 이후에 진행되는 내용 때문에 오류가 생길 수 있고 낭비가 생김
				 *  prime 조건이 충족되면 break 가 필요함
				 */
				System.out.println(num + " / " + i + " = 0");
			} else {
				// System.out.println(i);
			}
		}
		
		if (prime == 2) { // 위 주석의 이유로 == 보다는 다른 비교연산식으로 if문을 작성하는 것이 바람직함
			System.out.println(num + "\t 소수");
		} else {
			System.out.printf("%d 는 %d 번 나눠짐", num, prime);
		}
	}
}
