package chapter04;

public class ForFloatCounter {
//float 타입 카운터 변수
	public static void main(String[] args) {
		for(float x=0.1f; x<=1.0f; x+=0.1f) {
			System.out.println(x);
			//float 0.1f는 0.1보다 약간 크다.
			//for문 9번만 실행됨
		}

	}

}
