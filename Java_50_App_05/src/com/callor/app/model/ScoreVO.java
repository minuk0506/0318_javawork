package com.callor.app.model;

public class ScoreVO {
	/*
	 * 학생의 국어, 영어, 수학 점수를 저장 할 model.ScoreVO 클래스를 작성
	 * 
	 * service.ScoreService 클래스를 작성
	 * 
	 * List<ScoreVO> 리스트를 선언하고
	 * 
	 * makeScore() method 에서 각 과목에 50~100 까지 임의의 정수를 생성하여 저장
	 * 
	 * 점수 List 를 20개 생성
	 * 
	 * scorePrint() method 에서 성적 리스트를 출력
	 * 
	 * =============================== 학번 국어 영어 수학 총점 평균
	 * ------------------------------- 1 90 90 90 270 90.00 : : : : : :
	 * =============================== 총점 000 000 000 0000
	 */
	private int scNum;
	private int scKor;
	private int scEng;
	private int scMath;
	private int scSum;
	private float scAvg;

	public ScoreVO() {
		// TODO Auto-generated constructor stub
	}

	public ScoreVO(int scNum, int scKor, int scEng, int scMath, int scSum, float scAvg) {
		super();
		this.scNum = scNum;
		this.scKor = scKor;
		this.scEng = scEng;
		this.scMath = scMath;
		this.scSum = scSum;
		this.scAvg = scAvg;
	}

	public int getScNum() {
		return scNum;
	}

	public void setScNum(int scNum) {
		this.scNum = scNum;
	}

	public int getScKor() {
		return scKor;
	}

	public void setScKor(int scKor) {
		this.scKor = scKor;
	}

	public int getScEng() {
		return scEng;
	}

	public void setScEng(int scEng) {
		this.scEng = scEng;
	}

	public int getScMath() {
		return scMath;
	}

	public void setScMath(int scMath) {
		this.scMath = scMath;
	}

	public int getScSum() {
		return scSum;
	}

	public void setScSum(int scSum) {
		this.scSum = scSum;
	}

	public float getScAvg() {
		return scAvg;
	}

	public void setScAvg(float scAvg) {
		this.scAvg = scAvg;
	}

	@Override
	public String toString() {
		return scNum + "\t" + scKor + "\t" + scEng + "\t" + scMath + "\t" + scSum + "\t" + scAvg + "";
	}

}
