package com.callor.var;

public class Var_04 {
	public static void main(String[] args) {
		
		int intNum1 = (int)(Math.random() * 100) + 1;
		int intNum2 = (int)(Math.random() * 100) + 1;
		
		boolean bCompare = true;
		
		bCompare = intNum1 > intNum2;
		
		if(bCompare) {
			System.out.println(intNum1 + " 이 " + intNum2 + " 보다 크다");
		}
		else {
			System.out.printf("%d 이 %d 보다 크지 않다\n", intNum1, intNum2);
		}
		
	}
}