package com.callor.app.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class App_04Exec8 {

	public static void main(String[] args) {
		
		String filename = "src/com/callor/app/exec/Data.txt";
		
		FileInputStream input = null;
		Scanner scan = null;
		
		try {
			input = new FileInputStream(filename);
			scan = new Scanner(input);
			
			while(scan.hasNext()) {
				System.out.println(scan.nextLine());
			}
			input.close();
			scan.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}
}
