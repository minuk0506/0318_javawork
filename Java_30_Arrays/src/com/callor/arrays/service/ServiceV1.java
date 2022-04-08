package com.callor.arrays.service;

/*
 * 수행과제 : 5명 학생의 국어점수를 합산
 * ServiceV1 클래스에 scoreKorSum() 선언
 * 국어점수를 저장할 변수 5개를 선언
 * 5개의 변수에 1 ~ 100까지 임의의 점수를 저장
 * 5개 변수의 점수를 합산하여 return
 */

public class ServiceV1 {

	public int scoreKorSum() {
		
		int intKor1 = (int)(Math.random() * 100) + 1;
		int intKor2 = (int)(Math.random() * 100) + 1;
		int intKor3 = (int)(Math.random() * 100) + 1;
		int intKor4 = (int)(Math.random() * 100) + 1;
		int intKor5 = (int)(Math.random() * 100) + 1;

		int intKorSum = intKor1;
		intKorSum += intKor2;
		intKorSum += intKor3;
		intKorSum += intKor4;
		intKorSum += intKor5;
		
		return intKorSum;
	}
}
