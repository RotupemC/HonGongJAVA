package chapter02;

public class Printf {
//메소드 사용법 - 메소드 : printf, println ..
	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격:%d원\n", value); //123원 엔터
		System.out.printf("상품의 가격:%6d원\n", value); //___123 엔터
		System.out.printf("상품의 가격:%-6d원\n", value); //123___
		System.out.printf("상품의 가격:%06d원\n", value); //123000
		
		//***
		double area = 3.14159*10*10;
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n",10,area); //

		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job); 
		//_____1|홍길동_______|________도적
	}

}
