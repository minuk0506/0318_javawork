package com.callor.app.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
 * 문자열 학번
 * 정수형 국어, 정수형 수학, 정수형 영어 변수를 갖는 VO 클래스 생성
 * 
 * 모든 변수는 private 으로 선언하고
 * Lombok.jar 설정하고
 * getter, setter, toString, builder 정의
 */

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ScoreVO {

	private String stnum;
	private int intKor;
	private int intMath;
	private int intEng;

}