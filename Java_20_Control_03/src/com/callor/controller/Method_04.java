package com.callor.controller;

import com.callor.service.ServiceV1;
import com.callor.service.ServiceV2;

public class Method_04 {
	public static void main(String[] args) {
		/*
		 * ServiceV1 클래스에 선언된 add(), multi() 는
		 * static 으로 선언되었다.
		 */
		
		//Math.random() : Math라는 클래스에 random() 를 불러옴
		//System.out.println() : System 클래스에 out 클래스에 println() 를 불러옴
		int intSum1 = ServiceV1.add(); // ServiceV1 클래스에 add() 를 불러옴
		
		
		String string;
		int num;
		/*
		 * ServiceV2 class type 으로 변수 선언하기
		 * 여기에서 ServiceV2 클래스는 이 프로젝트에서
		 * 생성한 임의의 키워드다.
		 * 
		 * 프로젝트에서 선언된 class는 변수처럼 선언을 할 수 있다.
		 * 
		 * ServiceV2 라는 클래스 타입으로 serviceV2 라는 변수를 선언했다.
		 */
		ServiceV2 serviceV2; // 선언하기
		serviceV2 = new ServiceV2(); // 클래스를 초기화 시키는 문장
		// Ctrl + Shift + O 누르면 현재 4번라인처럼 import 됨
		
		ServiceV2 sV2 = new ServiceV2(); // 선언과 초기화
		/* 
		 * JDK 11 에 들어 있은 클래스가 너무 많아
		 * static이 붙어있지 않은 클래스는 자동으로 불러오지 않는다.
		 * 쓰려면 선언, 초기화, 생성해서 사용해야 한다.
		 */
		int intSum2 = serviceV2.add();
		int intSum3 = sV2.add();
		
		// int type의 변수 intNum4를 선언하고 정수 0으로 clear
		int intNum4 = 0;
		// String type 의 변수 strNation을 선언하고
		// 빈(blank)문자열로 clear
		String strNation1 = "";
		
		// String class type 의 인스턴스 strNation2를 선언하고
		// 인스턴스를 초기화( new String()) 하였다.
		String strNation2 = new String();
		
		// ServiceV2 class type 의 인스턴스 sV3 를 선언하고
		// 인스턴스를 초기화 ( new ServiceV2() )하였다
		ServiceV2 sV3 = new ServiceV2();
		
		// ServiceV2 class type 의 객체(object)를 선언했다
		ServiceV2 sV4;
		// 초기화( new ServiceV2() )를 실행하여
		// sV4 가 인스턴스가 되었다
		sV4 = new ServiceV2(); // class이름과 똑같은 method
		
	}

}
