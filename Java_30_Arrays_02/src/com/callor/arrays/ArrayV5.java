package com.callor.arrays;

public class ArrayV5 {
	public static void main(String[] args) {
		
		/*
		 * intScore 배열을 100개 선언
		 * 각 배열 요소에 1~100까지 임의의 점수 저장
		 * 배열에 저장된 점수를 한 라인에 5개씩 출력 
		 */
		
		/* 내가 만든 코드
		int[] intScore = new int[100];
		
		for (int i = 0 ; i < intScore.length ; i ++) {
			
			intScore[i] = (int)(Math.random() * 100) + 1;
			
			if ( (i + 1) % 5 != 0) {
				System.out.print(intScore[i] + ", \t");
			}
			else {
				System.out.println(intScore[i]);
			}
			
		}
		*/
		
		// 선생님이 만드신 코드 (내가 한거랑 비슷하지만 print와 random 이 따로 되있음)
		// 나는 프린트 둘다 if에 넣었는데 선생님거는 5번째를 만났을때 엔터만함
		/*
		 * intScore 배열에 담긴 값을 for() 문을 사용하여
		 * 각 요소별로 한줄로 출력 하다가
		 * 5번째 요소를 출력한 후 Enter(new line, println() )을 하라
		 * i(index) 값을 5로 나눈 나머지가 0이 될때 println()을 실행하여 
		 * 		new line 을 부여한다
		 * 그런데 i 값은 0부터 시작한다 0 % 5 의 결과는 0이 되어
		 * 처음 요소를 출력한 후 new line 이 되어 버린다
		 * 그래서 i + 1 을 먼저 실행하여 index % 5 의 연산을 1부터 시작하도록해 준다
		 */
		int[] intScore = new int[100];
		
		for(int i = 0; i < intScore.length ; i++) {
			intScore[i] = (int)(Math.random() * 100) + 1;
		}
		
		for(int i = 0; i < intScore.length ; i++) {
			System.out.print(intScore[i] + ",\t");
			
			if((i + 1) % 5 == 0) {
				System.out.println();
			}
		}
		
	}
}
