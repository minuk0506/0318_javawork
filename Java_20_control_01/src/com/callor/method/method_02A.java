package com.callor.method;

public class method_02A {

	public static void main(String[] args) {
		
		/*
		 * 오늘 저녁 8시 까지 오류가 나지 않게 완성하고 깃에 올리기
		 * 깃 주소 선생님께 보내드리기
		 */
		
		/*
		 * 명령문 해석
		 * 1. num() 를 실행하여 -> num() 를 호출하여 실행하고
		 * 2. num() 가 return 하는 데이터를 intNum1 변수에 저장하라
		 */
		int intNum1 = num();
		double douNum1 = doNum();
		long longNum1 = longNum();
		float fNum1 = floatNum();
		boolean bYes = bYes();
		String str = nation();
		
		System.out.println(intNum1);
		System.out.println(douNum1);
		System.out.println(longNum1);
		System.out.println(fNum1);
		System.out.println(bYes);
		System.out.println(str);
		
	}
	public static int num() {
		return 10;
	}
	public static double doNum() {
		return 10.0123456789123;
	}
	public static long longNum() {
		return 1000000000;
	}
	public static float floatNum() {
		return 0.1234567f;
	}
	public static boolean bYes() {
		return true;
	}
	public static String nation() {
		return "안녕하세요";
	}
}
