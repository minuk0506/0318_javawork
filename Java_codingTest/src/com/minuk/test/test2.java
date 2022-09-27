package com.minuk.test;

public class test2 {
	public static void main(String[] args) {
		long n = 12345;
		int[] answer = {};
		System.out.println(n);
		for(int i = 0; i < n; i++) {
			answer[i] += (int)n%10;
			System.out.println(answer[i]);
		}
		
	}
}
