package com.callor.arrays.controller;

import com.callor.arrays.service.ScoreServiceV5;

public class ScoreControllerV5 {
	public static void main(String[] args) {
		System.out.println("점수 현황");
		ScoreServiceV5 scoreServiceV5 = new ScoreServiceV5(10);
		scoreServiceV5.makeScore();
		scoreServiceV5.printScore();
		scoreServiceV5.sumScore();
		
	}

}
