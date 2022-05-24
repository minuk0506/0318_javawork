package com.callor.app.exec;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;

public class App_05AddrEx03 {
	public static void main(String[] args) {
		AddressVO[] vo = new AddressVO[3];
		vo[0] = AddressVO.builder()
				.name("vo")
				.addr("vo")
				.tel("010")
				.build();
		
		vo[1] = new AddressVO();
		vo[1].setName("a");
		vo[2] = new AddressVO();
		vo[2].setName("b");
		AddrServiceV1 adServ = new AddrServiceV1();
		adServ.printAddrList(vo);
	}
}
