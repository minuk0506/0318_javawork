package com.callor.arrays.service;

/*
 * makeScore()
 * printScore()
 * sumScore()
 * 등의 method 를 선언하고
 * 
 * 임의 성적을 생성하여 intKor 에 저장
 * 성적일람표 출력
 * 총점계산
 */
public class ScoreServiceV5 {

	private int[] intKor;
	public static String strLine = "-".repeat(20);
	
	public ScoreServiceV5(int length) {
		intKor = new int[length];
	}

	public void makeScore() {
		for (int i = 0; i < intKor.length; i++) {
			intKor[i] = (int) (Math.random() * 100) + 1;
		}
	}

	public void printScore() {
		boolean bPass = true;
		System.out.println(strLine);
		for (int i = 0; i < intKor.length; i++) {
			bPass = (intKor[i] > 59);
			if (bPass) {
				System.out.println("60점 이상 : " + intKor[i]);
			}
		}
		System.out.println(strLine);
		for (int i = 0; i < intKor.length; i++) {
			bPass = (intKor[i] < 60);
			if (bPass) {
				System.out.println("60점 이하 : " + intKor[i]);
			}
		}
		System.out.println(strLine);

	}

	public void sumScore() {
		int intSum = 0;
		for (int i = 0; i < intKor.length; i++) {
			intSum += intKor[i];
		}
		System.out.println("총점 : " + intSum);
	}

}
