package com.callor.app.controller;

import com.callor.app.service.ServiceV2;

/*
 * ServiceV2 클래스에 guguDan()를 선언하고
 * guguDan()는 3단 구구단을 출력한다.
 * ControllerV2 에서는 guguDan() 호출하여
 * 구구단을 보여준다
 */
public class ControllerV2 {
	public static void main(String[] args) {
		
		// 보통 ServiceV2 serviceV2 = new ServiceV2(); 로 만듬
		ServiceV2 sV2 = new ServiceV2();
		
		sV2.guguDan();
		
		System.out.println("==============================");
		sV2.guguDan(7); // 7이 ServiceV2 guguDan(int dan) 의 dan에 들어감
		
	}
}