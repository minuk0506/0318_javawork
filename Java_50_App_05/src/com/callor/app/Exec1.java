package com.callor.app;

public class Exec1 {

	/*
	 * 1. 학생 25명에게 간식을 주려고 한다
	 * 		설문조사 결과 피자를 간식으로 원하고 있다
	 * 
	 * 2. 피자는 "한 판에 6개의 조각으로 되어 있다
	 * 
	 * 3. 6개 조각의 피자를 25명이 부족하지 않게 나눠 먹으려면
	 * 		최소 5판의 피자를 주문해야 한다.
	 * 
	 * 4. random() 메서드를 사용하여 25~50의 정수를 생성하고
	 * 		주문할 피자 판수를 계산하는 코드를 구현해 봅니다.
	 */
	public static void main(String[] args) {
		int intStu = (int)(Math.random() * 25) +25;
		/*
		int index = 0;
		boolean bPizza = true;
		
		while(bPizza) {
			index++;
			if(index * 6 >= intStu) {
				System.out.printf("학생수 : %d\n피자 판수 : %d\n피자조각수 : %d", intStu, index, index * 6);
				bPizza = false;
			}
		}
		*/
		int num = 0;
		if(intStu % 6 == 0) {
			num = intStu / 6;
		} else {
			num = intStu / 6 + 1;
		}
		System.out.printf("학생수 : %d\n피자 판수: %d", intStu, num);
	}
}
