package chapter02;

public class LongOperationExample {
//정수 타입의 연산
	public static void main(String[] args) {
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		
		//long타입 변수가 있으므로 결과값은 long 타입으로 정해야한다.
		long result = value1 + value2 + value3; 
		System.out.println(result);

	}

}
