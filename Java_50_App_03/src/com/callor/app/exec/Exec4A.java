package com.callor.app.exec;

public class Exec4A {

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
		
		boolean pFlag = true;
		
		for (int i = 2 ; i < num ; i++) {
			
			if (num % i == 0) {
				pFlag = !pFlag;
				break;
			}
		}
		/*
		 * 만약 num 값이 소수인 경우 for() 반복문이 모두 완료되고 종료된다
		 * 그러면 pFlag 는 처음 설정한 값이 변함이 없기 때문에 true 이다
		 * 
		 * 만약 num 값이 소수가 아닌 경우 중간의 if() {} 코드가 실행되어
		 * pFlag 가 반전되고 (즉 false 가 되고) 다음의 if 조건을 만족하지 않아
		 * else {} 코드가 실행된다
		 */
		if (pFlag) {
			System.out.println(num + " 는(은) 소수입니다");
		} else {
			System.out.printf(" 는(은) 소수가 아닙니다");
		}
	}
}
