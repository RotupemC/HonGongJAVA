package chapter03;

public class CharOperation {
//char 타입의 산술 연산
	
	public static void main(String[] args) {
		char c1 = 'A' + 1; //char 타입도 정수 타입이므로 int로 변환된다. 65+1 -> 66 -> (char)B
		char c2 = 'A';
		//char c3 = c2+1; char가 산술연산에 사용되면 int타입으로 변한다. 따라서 c3은 int 타입이어야함
		int c4 = c2+1;
		char c5 = (char) (c2+1);
		System.out.println("c1 : " + c1); //B
		System.out.println("c2 : " + c2); //A
		//System.out.println("c3 : " + c3);
		System.out.println("c4 : " + c4); //66
		System.out.println("c5 : " + c5); //B
	}

}
