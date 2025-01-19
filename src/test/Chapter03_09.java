package test;

import java.util.Scanner;

public class Chapter03_09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 수 : ");
		String num1 = scanner.next();
		System.out.print("두 번째 수 : ");
		String num2 = scanner.next();
		
		System.out.println("첫 번째 수 : "+num1);
		System.out.println("두 번째 수 : "+num2);
		System.out.println("-----------------");
		
		double doubleNum1 = Double.parseDouble(num1);
		double doubleNum2 = Double.parseDouble(num2);
		
		if((doubleNum1==0) | (doubleNum2==0.0)) {
			System.out.println("결과:무한대");
		}
		else {
			double result = doubleNum1/doubleNum2;
			System.out.println("결과:"+result);
		}
		
		scanner.close();
		

	}

}
