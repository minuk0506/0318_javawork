package com.callor.app.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.ScoreVO;
import com.callor.app.util.Line;

public class ScoreService {
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

	public final List<ScoreVO> scScore = new ArrayList<ScoreVO>();

	public void makeScore(int length) {
		ScoreVO scVO = new ScoreVO();
		for (int i = 0; i < length; i++) {
			scVO = new ScoreVO();
			int scKor = (int) (Math.random() * 50) + 50;
			int scEng = (int) (Math.random() * 50) + 50;
			int scMath = (int) (Math.random() * 50) + 50;
			int scSum = scKor + scEng + scMath;
			float scAvg = scSum / 3;
			scVO.setScNum(i + 1);
			scVO.setScKor(scKor);
			scVO.setScEng(scEng);
			scVO.setScMath(scMath);
			scVO.setScSum(scSum);
			scVO.setScAvg(scAvg);
			scScore.add(scVO);
		}

	} // end makeScore

	public void scorePrint() {
		int totalKor = 0;
		int totalEng = 0;
		int totalMath = 0;
		int totalSum = 0;

		System.out.println(Line.dLine(45));
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println(Line.sLine(45));

		for (int i = 0; i < scScore.size(); i++) {
			System.out.println(scScore.get(i));
			totalKor += scScore.get(i).getScKor();
			totalEng += scScore.get(i).getScEng();
			totalMath += scScore.get(i).getScMath();
			totalSum += scScore.get(i).getScSum();

		}
		System.out.println(Line.dLine(45));
		System.out.printf("총점\t%d\t%d\t%d\t%d", totalKor, totalEng, totalMath, totalSum);

	}
}
