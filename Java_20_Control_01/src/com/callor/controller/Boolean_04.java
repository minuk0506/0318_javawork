package com.callor.controller;

public class Boolean_04 {
	public static void main(String[] args) {
	
		/*
		 * A	B	OR	AND		A	B	+	*
		 * f	f	f	f		0	0	0	0
		 * t	f	t	f		1	0	1	0
		 * f	t	t	f		0	1	1	0
		 * t	t	t	t		1	1	1	1
		 */
		boolean bYes1 = true;
		boolean bYes2 = true;
		
		int intNum1 = 33;
		int intNum2 = 55;
		
		bYes1 = intNum1 == intNum2; // false
		bYes2 = intNum1 < intNum2; // true
		
		/*
		 * || : boolean 데이터의 OR(덧셈) 연산
		 * && : boolean 데이터의 AND(곱셈) 연산
		 */
		boolean bWhat = bYes1 || bYes2; // true ( \위에 | 를 필터문자라함)
		bWhat = bYes1 && bYes2; // false
				
		/* print 하면 true 쪽만 출력됨
		 * bYes1 || bYes2 ( 33 == 55 OR 33 < 55 )
		 * bYes1 && bYes2 ( 33 == 55 AND 33 < 55 )
		 */
		if(bYes1 || bYes2) { 
			System.out.println(intNum1 + " 가 " + intNum2 + " 보다 작거나 같다");
		} else if(bYes1 && bYes2) {
			System.out.println(intNum1);
		}
		
		/* !(f OR t) ↓
		 * !f AND !t ↓
		 *  t AND f ↓
		 *  false
		 *  드모르간 법칙
		 *  
		 *  !(bYes1 || bYes2) ↓
		 *  !bYes1 && !bYes2
		 */
		bWhat = !(bYes1 || bYes2);
		System.out.println(bWhat);
		
		// !(false AND true)
		bWhat = !(bYes1 && bYes2);
		System.out.println(bWhat);
	}
}
