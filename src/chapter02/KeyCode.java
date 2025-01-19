package chapter02;

public class KeyCode {
//입력된 키코드를 변수에 저장
	public static void main(String[] args) throws Exception {
		int keyCode;
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode); //a=97
	
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode); //enter CR=13
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode); //enter LF=10
	}

}
