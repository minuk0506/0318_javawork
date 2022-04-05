package com.callor.service;

public class ServiceV1 {
	
	/*
	 * void type method를
	 * guguDan 이름으로 선언하기
	 * void type method 는 return 명령이 없어도 된다
	 */
	public void guguDan() {
		
		int intSamDan = 3;
		int intMul = 1;		
		
		System.out.printf("%d x %d = %d\n", intSamDan, intMul, intSamDan * intMul++);
		System.out.printf("%d x %d = %d\n", intSamDan, intMul, intSamDan * intMul++);
		System.out.printf("%d x %d = %d\n", intSamDan, intMul, intSamDan * intMul++);
		System.out.printf("%d x %d = %d\n", intSamDan, intMul, intSamDan * intMul++);
		System.out.printf("%d x %d = %d\n", intSamDan, intMul, intSamDan * intMul++);
		System.out.printf("%d x %d = %d\n", intSamDan, intMul, intSamDan * intMul++);
		System.out.printf("%d x %d = %d\n", intSamDan, intMul, intSamDan * intMul++);
		System.out.printf("%d x %d = %d\n", intSamDan, intMul, intSamDan * intMul++);
		System.out.printf("%d x %d = %d\n", intSamDan, intMul, intSamDan * intMul);
	}
	// 반복문 생각나서 해봤음
	public void guguDan2() {
		
		int intSamDan = 3;
		int intRslt = 0;
		
		// C 나 python 하고 for 문 좀 다름 for(초기화; 조건식;증감식;){}
		for (int i = 0; i < 10; i++) {
			intRslt = intSamDan * i;
			System.out.printf("%d x %d = %d\n", intSamDan, i, intRslt);
		}
	}
}
