package com.callor.app;

import com.callor.utils.Line;

public class LineEx1 {
/*
 * Java_00_lib 에서 Line -> export -> java -> .jar파일 -> 편한곳에 저장하면 됨 (이번엔 jdk_3rd) 라이브러리만들기
 * 사용할 프로젝트에서 Buildpath -> Configuer Buildpath ->
 */
	public static void main(String[] args) {
		
		System.out.println(Line.dLine(50));
		System.out.println("나의 라이브러리");
		System.out.println(Line.sLine(50));
	}
	
}
