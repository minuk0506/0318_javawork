package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;

public class AddrEx04 {

	public static void main(String[] args) {

		List<AddressVO> vo = new ArrayList<>();

		AddressVO adVO = new AddressVO();
		adVO.setName("hong");
		adVO.setAddr("광주");
		vo.add(adVO);
		
		adVO = new AddressVO();
		adVO = AddressVO.builder()
				.name("0")
				.addr("1")
				.build();
		vo.add(adVO);

		AddrServiceV1 adSv = new AddrServiceV1();
		adSv.printAddrList(vo);
		
	}
}
