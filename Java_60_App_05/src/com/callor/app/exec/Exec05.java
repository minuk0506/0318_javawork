package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.AddressVO;

public class Exec05 {
	public static void main(String[] args) {
		
		List<AddressVO> addrs = new ArrayList<>();
		
		AddressVO aVO = new AddressVO();
		aVO.setName("홍길동");
		aVO.setAge(30);
		addrs.add(aVO);
		
		aVO = AddressVO.builder()
				.name("이몽룡")
				.age(20)
				.build();
		addrs.add(aVO);
		
		addrs.add(AddressVO.builder().name("성춘향").age(16).build());
		
		addrs.add(new AddressVO());
		
		int size = addrs.size();
		
		addrs.get(size - 1).setName("임꺽정");
		addrs.get(size - 1).setAge(40);
		
		for(AddressVO vo : addrs) {
			System.out.println(aVO.toString());
		}
		// 이름 순서로 오름차순 정렬
		size = addrs.size();
		for(int i = 0; i < size ; i++) {
			for(int j = i + 1; j < size; j++) {
				if(addrs.get(i)
						.getName()
						.compareTo(addrs.get(j)
								.getName()) > 0) {
					AddressVO _tVO = addrs.get(i);
					addrs.set(i, addrs.get(j));
					addrs.set(j, _tVO);
				}
			}
		}
		for(int i = 0; i < size; i++) {
			for(int j = 0; j <size; j++) {
				String nameI = addrs.get(i).getName();
				String nameJ = addrs.get(j).getName();
				if(nameI.compareTo(nameJ) < 0) {
					AddressVO nVO = addrs.get(i);
					addrs.set(i, addrs.get(j));
					addrs.set(j, nVO);
				}
			}
		}
		System.out.println("=".repeat(70));
		for(AddressVO vo : addrs) {
			System.out.println(vo.toString());
		}
	}
}
