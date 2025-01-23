package chapter04;

public class BreakOutter {
//바깥쪽 반복문 종료
	public static void main(String[] args) {
		Outter : for(char upper='A'; upper<='Z'; upper++) { //이것까지 종료
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper+"-"+lower);
				if(lower=='g') {
					break Outter;
				}
			}
		}
		System.out.println("프로그램 종료");
	}

}
