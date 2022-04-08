package com.callor.app.service;

public class ServiceV1 {
	/*
	 * ServiceV1 클래스에 scoreSum() 선언
	 * intKor, intEng, intMath 변수 선언
	 * 1 ~ 100 까지 임의 값을 생성하여 각 변수에 저장
	 * 변수에 저장된 값을 합산하여 return
	 * Controller1 에서 scoreSum() 을 호출하여
	 * return 된 결과를 Console 에 출력
	 */
	
	public int scoreSum() {
		
		int intKor = (int)(Math.random() * 100) + 1;
		int intEng = (int)(Math.random() * 100) + 1;
		int intMath = (int)(Math.random() * 100) + 1;
		
		int intRst = intKor;
		intRst += intEng;
		intRst += intMath;
		
		return intRst;
	}
}