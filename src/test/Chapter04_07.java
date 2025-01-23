package test;

import java.util.Scanner;

public class Chapter04_07 {

	public static void main(String[] args) {
		boolean run = true;
		int balance=0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------");
			System.out.println("1.예금 |2.출금 |3.잔고 |4.종료");
			System.out.println("------------------------");
			
			System.out.println("선택> ");
			
			int num = Integer.parseInt(scanner.nextLine());
			switch(num){
			case 1 : 
				balance += Integer.parseInt(scanner.nextLine()); 
				System.out.println("예금액>"+balance); break;
			case 2 : 
				balance -= Integer.parseInt(scanner.nextLine());
				System.out.println("출금액>"+balance); break;
			case 3 : System.out.println("잔고>"+balance); break;
			case 4 : run=false; break;
			}
			
		}System.out.println("프로그램 종료");
		scanner.close();
	}

}
