package com.callor.var;

public class Var_02 {
	
	// 변수에 값을 저장하는 방법
	// 1. 
	// 2. 
	// 3. 어떤 변수를 수행해서 값을 담는 방법
	
	//start main()
	public static void main(String[] args) {
		
		int intNum1 = 0;
		intNum1 = num1();
		
		System.out.println(intNum1); // intNum1에 값이 잘 들어갔는지 확인하는 디버깅코드
		
		int intNum2 = 0;
		intNum2 = 33;
		intNum2 = intNum1;
		intNum2 = intNum1 + 100; // 변수 = (??) : ?? 에서 진행된 것의 값(결과)을 변수에 담아라 리터럴
		
		System.out.println(intNum2);
		
		/*
		 * add() : add method 라고 읽는다
		 * add() 를 실행(run, 명령을 수행)하여 그 결과를
		 * 		intNum2에 저장해 달라
		 */
		intNum2 = add();
		System.out.println(intNum2);
	}//end main()
	/* 
	 * add() 를 선언하기
	 */
	public static int add() {
		// 정수 55와 33을 덧셈하여 return 하기
		return 55 + 33;
	}
	
	/*
	 * num1() 를 선언하기
	 */
	// num1 이라는 키워드가 아닌 변수를 키워드로 선언하기 위해 public static int(정수형 키워드로 만듬)
	public static int num1() {
		return 100;
	}
	
}
