package com.callor.var;

/* Project : Java_10_Varriable_02
 * package : com.callor.Var
 * Class : Var_01.Java
 * 수행과제
 * 두개의 정수형 변수를 선언하고
 * 각각 55와33을 저장
 * 두 정수형 변수에 저장된 값을 사용하여 4칙연산을 수행하고
 * 결과를 Console에 출력
 */

public class Var_01 {
	
	/* 1. 변수명은 키워드 등으로 사용할 수 없다
	 * 2. 같은 변수명은 한 블럭( { } ) 내부에서 두번이상 선언할 수 없다
	 * 3. 변수명은 첫글자가 반드시 소문자다
	 * 4. 두 단어 이상을 조합하여 의미있는 단어로 작성한다
	 */
	
	public static void main(String[] args) {
	
		int intNum1 = 0; // 변수 선언과 0으로 초기화(clear라고 표현)
		int intNum2 = 0; // int intNum1 = 0, intNum2 = 0 도 가능은 하나 가독성 등이 별로임
		
		intNum1 = 55;
		intNum2 = 33;
		
		System.out.println("55 + 33 = " + (intNum1 + intNum2));
		System.out.println("55 - 33 = " + (intNum1 - intNum2));
		System.out.println("55 * 33 = " + intNum1 * intNum2);
		System.out.println("55 / 33 = " + intNum1 / intNum2);
		
	}
}
