package com.callor.classes.controller;

import com.callor.classes.service.ScoreServiceV1;

public class ControllerV1 {
	public static void main(String[] args) {
		ScoreServiceV1 ssV1 = new ScoreServiceV1(3);
		int intResult = ssV1.input();
		if(intResult < 0) {
			System.out.println("입력 도중 중단함");
		} else {
			System.out.println("입력을 모두 마침");
		}
	}
}
