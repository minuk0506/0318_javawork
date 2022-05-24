package com.callor.app.exec;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;

public class App_05AddrEx02 {
	public static void main(String[] args) {
		
		AddressVO VO = new AddressVO();
		VO = AddressVO.builder()
				.name("hong")
				.addr("광주")
				.build();
		
		AddrServiceV1 adSerV1 = new AddrServiceV1();
		
		adSerV1.printAddr(VO);
		
	}
}
