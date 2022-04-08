package com.callor.app.controller;

import com.callor.app.service.ServiceV2;

public class ControllerV2 {
	public static void main(String[] args) {
		
		// ControllerV2 에 있는 sum()
		int sum = sum();
		System.out.println(sum);
		
		// ServiceV2 에 있는 sum()
		ServiceV2 serviceV2 = new ServiceV2();
		// ServiceV2 클래스의 sum method 는
		// private 이기 때문에 여기에서 호출할 수 없다
		// int sum2 = serviceV2.sum();
		
		// ServiceV2 클래스의 add method 는
		// 한정자가 생략되어 있지만
		// Controller Package 의 ControllerV2 클래스에서는
		// 호출 할 수 없다.
		// 왜? Package 위치가 다르기 때문에
		// int add = serviceV2.add();
		
	} // end main()
	
	// public은 누구나 호출할 수 있다.
	// private는 누구도 호출할 수 없다.
	private static int sum() {
		
		return 30 + 40;
		
	}
	
}
