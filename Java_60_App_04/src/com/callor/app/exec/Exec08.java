package com.callor.app.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
/*
 * Data.txt 파일의 내용을
 * console 에 한 라인씩 출력하시오
 */
public class Exec08 {

	public static void main(String[] args) {
		String filename = "src/com/callor/app/exec/Data.txt";
		
		// file 과 관련한 클래스는 
		// 객체 선언문과 생성(초기화)를 분리한다
		// try-catch 선언때문에
		FileInputStream is = null;
		Scanner scan = null;
		
		try {
			is = new FileInputStream(filename);
			scan = new Scanner(is);
			
			while(scan.hasNext()) {
				String line = scan.nextLine();
				System.out.println(line);
			}
			
			scan.close();
			is.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없음");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
}
