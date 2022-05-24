package com.callor.app.service;

import java.util.List;

import com.callor.app.model.AddressVO;

public class AddrServiceV1 {

	public void printAddr(AddressVO vo) {
		System.out.println(vo.toString());
	}
	public void printAddrList(AddressVO[] vo) {
		for(AddressVO add : vo) {
			System.out.println(add.toString());
		}
	}
	public void printAddrList(List<AddressVO> vo) {
		for(int i = 0; i < vo.size(); i++) {
			AddressVO adVO = vo.get(i);
			System.out.println(adVO.toString());
		}
	}
	
}
