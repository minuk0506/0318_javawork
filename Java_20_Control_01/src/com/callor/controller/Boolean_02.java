package com.callor.controller;

public class Boolean_02 {

	public static void main(String[] args) {
		
		boolean bYes = true; //그냥 담기
		
		// bYes 에 저장된 값을 출력
		System.out.println(bYes);
		
		// bYes 에 저장된 값이 true 인지 비교연산하여 결과를 출력
		System.out.println(bYes == true);
		
		boolean bWhat = bYes; // 변수에 담긴 값을 담기
		bWhat = bYes == true; // 연산결과를 담기
		bWhat = bYes();
		
		
	} // end main()

	public static boolean bYes(){
		return true;
	}
	
	
	
}
