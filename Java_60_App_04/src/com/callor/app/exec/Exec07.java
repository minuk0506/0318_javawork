package com.callor.app.exec;

import com.callor.utils.Line;

public class Exec07 {

	public static void main(String[] args) {
		
		int dan = 7;
		int mul = 0;
		System.out.println(Line.dLine(20));
		System.out.println("7 단 구구단");
		System.out.println(Line.sLine(20));
		for(int i = 2; i < 10; i++) {
			mul = dan * i;
			System.out.printf("%d x %d = %d\n",dan,i,mul);
		}
		System.out.println(Line.dLine(20));
	}
}
