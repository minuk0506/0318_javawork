package com.callor.var;

public class Var_04 {

	public static void main(String[] args) {
		//random은 난수(랜덤수)를 만드는 메소드 (0 <= X < 1) (*10을 하면 0 <= X < 10)
		// 0 부터 1000 미만의 임의의 실수를 생성하여
		// 변수에 저장해달라
		double douRnd = Math.random() * 1000; // random은 실수 int키워드 변수에 담으면 0.자리가 달라지니 빨간줄나옴
		
		System.out.println(douRnd);
		
		// 실제 필요한 코드는 0 ~ 999 까지의 정수만 필요하다
		
		/* 
		 * 강제 형 변환, 명시적 형 변환
		 * 실수값을 정수변수에 저장하면
		 * 기억장치의 크기때문에 오류가 발생한다
		 * 그렇기 때문에 코드는 오류 메세지를 보여준다
		 * 하지만 개발자가 실수값 중에서 소수점 이하는 필요가 없고
		 * 정수부분만 필요하니 소수점 이하 값을 제거하고
		 * 정수부분만 intRnd 변수에 담아달라고
		 * 강제로 명령을 내린다
		 * type 키워드를 () 묶어 변수 앞에 표시한다
		 * 
		 * 자연 형 변환, 묵시적(암시적) 형 변환
		 * 실수 = 정수 와 같은 명령을 수행하면
		 * 실수형 변수는 정수값을 저장하기에 충분히 큰 기억장치 이므로
		 * 문제가 발생하지 않는다
		 * double num = 30; 과 같은 코드가 실행되면
		 * num 변수에는 30.000000 과 같이 저장이 된다.
		 */
		int intRnd = (int)douRnd;
		System.out.println(intRnd);
		
	}

}
