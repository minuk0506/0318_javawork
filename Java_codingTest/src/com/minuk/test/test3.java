package com.minuk.test;

public class test3 {
	boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        s.toLowerCase();
        for(int i = 0; i < s.length(); i++) {
	        if(s.contains("p")) {
	        	p++;
	        	System.out.println("p값"+p);
	        }
	        if(s.contains("y")){
	        	y++;
	        	System.out.println("y값"+y);
	        }
        }
        if(p != y) {
        	answer = false;
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
	
	public static void main(String[] args) {
		test3 test = new test3();
		test.solution("ppyYPydafqwp");
	}
}
