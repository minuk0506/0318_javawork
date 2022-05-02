package com.callor.app.controller;

import com.callor.app.service.ScoreService;
import com.callor.app.service.impl.ScoreServiceImplV3;

public class ScoreControllerV3 {
	public static void main(String[] args) {
		
		ScoreService scService = new ScoreServiceImplV3(); // V3 에는 아무것도 없지만 V3가 V2를 상속받았기에 출력이 나옴
		scService.makeScore();
		scService.printScore();
		
	}
}
