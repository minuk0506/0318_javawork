package com.callor.app.service;

/*
 * 인터페이스를 선언하여
 * 학생의 점수를 생성할 makeScore() method 와
 * 성적리스트를 출력할 printScore() method 를 정의하기
 * 
 * Control을 제외한 나머지 클래스는 인터페이스를 만들고 가는 것이 좋다
 */

public interface ScoreService {
	
	public void makeScore();
	public void printScore();
	
}
