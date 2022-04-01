package com.callor.method;

public class method_02 {

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
	
	public static String nation() {
		String strNation = null;
		return null;
	}
	public static boolean bYes() {
		boolean bYes = false;
		return false;
	}
	public static float floatNum() {
		float floatNum = 0;
		return 0;
	}
	public static long longNum() {
		long longNum = 0;
		return 0;
	}
	public static double doNum() {
		double douNum = 0;
		return 0;
	}
	public static int num() {
		/*
		 * main() 안에는 이름이 같은 변수가 있으면 안되지만
		 * 밑에 String nation() 과 같이 method 구역이 다르다면 쓸 수 있다
		 */
		/*
		 * intNum1 변수는 main() 에서 선언하여 사용하고 있지만
		 * num() 에서 intNum1 이름으로 변수를 선언하여도 된다
		 * main() 에서 선언 intNum1 과 num() 에서 선언 intNum1 은
		 * 부르는 이름만 같고 완전히 다른 변수다
		 * 
		 * main() 에 선언된 intNum1 변수는 main() 의 지역변수 (local var)라고 하고
		 * num() 에 선언된 intNum1 변수는 num() 의 지역변수 라고 한다.
		 * 
		 * 지역변수는 서로 다른 영역에서 접근할 수 없다.
		 */
		int intNum1 = 0;
		intNum1 = 300 + 400;
		
		// main() 에서 intNum1 변수의 값을 사용할 수 있도록
		// intNum1 변수의 값을 return 한다
		return intNum1;
	}
}
