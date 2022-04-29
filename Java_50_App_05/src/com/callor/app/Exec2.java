package com.callor.app;

public class Exec2 {
	
	/*
	 * 대한민국의 통화는 5만원, 1만원, 5천원, 1천원
	 * 	500원, 100원, 50원, 10원 권이 있다
	 * 
	 * 급여를 현금으로 지급하는데 최소한의
	 * 	액면권 개수로 지급하려고 한다
	 * 
	 * 급여 금액을 임의로 설정하고
	 * 	액면권 개수를 계산하여 출력
	 */
	public static void main(String[] args) {
		int num = (int)(Math.random() * 2000000) + 2000000;
		
		int[] intMon = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		
		int intRlt = 0;
		System.out.printf("월급 %d원\n", num);
		for(int i = 0; i < intMon.length; i++) {
			num = (num % intMon[i]);
			System.out.printf("%7d원권 : %5d장\n", intMon[i], num);
				
		}
	}
}
