package com.callor.app.exec;

public class App_03Exec3 {

	public static void main(String[] args) {
		int[] num = new int[10];
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random() * 100) + 1;
		}
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
	}
}
