package com.callor.app.exec;

import com.callor.app.model.AddressVO;

/*
 * AddressVO 클래스를 사용하여
 * hong, lee, sung 변수명으로 3개의 객체 인스턴스를 생성하고
 * 각각의 객체에 이름, 주소, 전화번호, 나이, 취미를 저장
 * 각 객체에 저장된 이름, 주소, 전화번호, 나이, 취미를 Console 에 출력
 */
public class AddrEx01 {
	
	public static void main(String[] args) {
		AddressVO hong = AddressVO.builder()
				.name("hong")
				.addr("광주")
				.tel("010-0000-0000")
				.age(25)
				.habby("영화감상")
				.build();
		
		AddressVO lee = AddressVO.builder()
				.name("lee")
				.addr("서울")
				.tel("010-1111-1111")
				.age(30)
				.habby("운동")
				.build();
		
		AddressVO sung = AddressVO.builder()
				.name("sung")
				.addr("부산")
				.tel("010-2222-2222")
				.age(28)
				.habby("독서")
				.build();
		
		System.out.printf("%s\n%s\n%s", hong, lee, sung);
		
		
	}
	
	
	
}
