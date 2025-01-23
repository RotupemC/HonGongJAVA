package chapter04;

public class Continue {
//continue를 사용한 for문
	public static void main(String[] args) {
		for(int i = 1; i<=10; i++) {
			if(i%2 != 0) {
				continue; //홀수일 때는 for문으로 간다(sysout 실행X)
			}
			System.out.println(i);
		}

	}

}
