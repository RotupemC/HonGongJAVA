package chapter02;

import java.util.Scanner;

public class ScannerExample {
//키보드에서 입력된 내용을 문자열로 얻기
	public static void main(String[] args)throws Exception {
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열: " + inputData );
			if(inputData.equals("q")) { break;}
			
			
		}
		
		System.out.println("end");
		scanner.close();
	}
}
