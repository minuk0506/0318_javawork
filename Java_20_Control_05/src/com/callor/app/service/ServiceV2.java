package com.callor.app.service;


/*
 * ServiceV2 클래스에 guguDan()를 선언하고
 * guguDan()는 3단 구구단을 출력한다.
 * ControllerV2 에서는 guguDan() 호출하여
 * 구구단을 보여준다
 */
public class ServiceV2 {
	
	/*
	 * 지금 ServiceV2 클래스에는 guguDan() 가 두번 선언되어 있다
	 * 보통은 같은 이름의 method 를 두번 이상 선언하면 오류가 발생한다.
	 * 그런데 자바에서는 
	 * method 의 매개변수(argument) 의 있고 없음에 따라
	 * 이름은 같지만 서로 다른 method 로 판단하여 오류가 발생하지 않는다.
	 * 이 것은 자바뿐만 아니라 객체지향 프로그래밍 언어의 공통된 특징이다.
	 */
	public void guguDan() {
		
		int intGuGuDan = 3;
		int intMul = 0;
		int intRst = 0;
		/*
		 * for(초기화코드 ; 비교코드 ; 변화코드) { }
		 * 0. 초기화코드는 for() 명령을 만나면 최초에 한번만 실행
		 * 1. 비교코드는 코드를 실행하여 결과가 
		 * 2. ture 이면 { } 내부의 코드 실행
		 * 3. { } 코드가 실행 완료되면 변화코드 실행
		 * 
		 * 1 ~ 3 이 계속 반복 ( 비교코드가 false 가 되는 순간까지 )
		 */
		for (intMul = 1 ; intMul < 10 ; intMul++) {
			
			intRst = intGuGuDan * intMul;
			
			System.out.printf("%d x %d = %d\n", intGuGuDan , intMul , intRst);
		/*
		 * for( 초기화; 조건식; 증감식 ){ }
		 * for문은 조건식이 true 일때 실행됨 (false가 될때까지)
		 * 맨처음은 초기화
		 * 조건식 -> 내용 -> 증감식 -> 조건식 ~ 반복
		 * 
		 * int intGuGuDan = 3;
		 * int intMul = 100;
		 * for( intMul = 1; intMul < 10 ; intMul++){
		 * 		System.out.print( GuGuDan );
		 * 		System.out.print( " x " );
		 * 		System.out.print( intMul );
		 * 		System.out.print( " = " );
		 * 		System.out.println( GuGuDan * intMul );
		 * }
		 */
		}
		
	}// end guguDan()
	/*
	 * guguDan(변수선언) 형식으로 method 선언하기
	 * method 의 괄호안에 선언된 변수를 "argument(알규먼트)" 라고 한다
	 * argument : 매개변수, parameter(파라메터)
	 * 		호출하는 곳에서 값을 전달하면 전달된 값을 변수에 저장하고
	 * 		코드내에서 변수 값을 사용하여 연산을 수행한다.
	 * argument 가 포함된 method 를 호출할 때는
	 * 		반드시 argument 에 합당한 값을 함께 전달해 주어야 한다.
	 * 		(값을 주입해 주어야 한다)
	 * 
	 * 이번 에는 main() 에서 sV2.guguDan(7); 라고 쓰면 guguDan(7) 에 넣은 값이 dan변수에 담긴다
	 */ 
	public void guguDan(int dan) {
		
		int index = 1;
		
		for( index = 1; index < 10 ; index++){
			System.out.print( dan );
			System.out.print( " x " );
			System.out.print( index );
			System.out.print( " = " );
			System.out.println( dan * index );
		}
	}
}
