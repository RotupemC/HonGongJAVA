package chapter02;

public class ContinueKeyCode {
//입력된 키의 개수와 상관없이 키코드 읽기
	public static void main(String[] args) throws Exception {
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
		}

	}

}
