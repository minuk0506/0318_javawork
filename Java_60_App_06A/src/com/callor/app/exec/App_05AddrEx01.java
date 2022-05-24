package com.callor.app.exec;

import com.callor.app.model.AddressVO;

public class App_05AddrEx01 {

	public static void main(String[] args) {
		
		AddressVO hong = new AddressVO();
		
		hong = AddressVO.builder()
				.name("hong")
				.addr("광주")
				.tel("01012345678")
				.build();
		
		AddressVO lee = new AddressVO();
		
		lee.setName("lee");
		lee.setAddr("서울");
		lee.setTel("01023456789");
		
		System.out.println(hong);
		
	}
	
}
