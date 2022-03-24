package com.callor.var;

public class Var_03 {
	public static void main(String[] args) {
		
		int intNum1 = 0;
		int intNum2 = 0;
		int intSum = 0;
		
		// 엑셀, 한글 등에서 숫자 3자리마다 콤마를 찍어 보기편하게 하는 것을 코딩에서는 _로 한다
		// 예)999_999_999
		intNum1 = 999_999_999; 
		//intNum1 변수는 int type 이기 때문에 2의 32승 -1 까지 값만 저장가능
		
		
		// int 형 변수는 큰 값을 저장할 수 없다
		// 만약 큰 정수값을 저장하려고 하면
		// long type 으로 변수를 선언해야 한다 (2의 63승 -1 까지 가능)
		// long type 에 저장할때 맨 끝에 대문자 or 소문자 L을 붙여줘야한다
		long longNum1 = 0;
		longNum1 = 999_999_999_999_999_999L;
	}
}
