package com.callor.score.domain;

public class ScoreV2VO {// extends Object 자동으로 있음 생략해도됨 (Object를 상속받는다)
	
	private String stName;
	private int intKor;
	private int intEng;
	private int intMath;
	private int intSum;
	private float fAvg;
	/*
	 * 객체지향의 5가지 특징
	 * 추상화, 정보의 은닉, 캡슐화, 상속, 다형성
	 */
	/*
	 * public void setStName(String stName) { this.stName = stName; }
	 * public String getStName() { return this.stName; }
	 * 
	 * 빈공간에서 우클릭
	 * source
	 * Generate Getter and Setters
	 * 로 자동으로 만들수도 있음
	 */
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public int getIntKor() {
		return intKor;
	}
	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}
	public int getIntEng() {
		return intEng;
	}
	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}
	public int getIntMath() {
		return intMath;
	}
	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}
	public int getIntSum() {
		
		intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		return intSum;
	}
	public float getfAvg() {
		fAvg = (float)getIntSum() / 3.0f;
		return fAvg;
	}
	@Override
	public String toString() {
		return "ScoreV2VO [stName=" + stName + ", intKor=" + intKor + ", intEng=" + intEng + ", intMath=" + intMath
				+ ", intSum=" + getIntSum() + ", fAvg=" + getfAvg() + "]";
	}
	
	
	
}
