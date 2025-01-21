package chapter04;

public class IfDiceExample {
//주사위의 번호 뽑기
	public static void main(String[] args) {
		int num = (int) (Math.random()*6)+1;
		
		if(num==1) {
			System.out.println("1 나왔습니다");
		}else if (num==2) {
			System.out.println("2 나왔습니다");
		}else if (num==3) {
			System.out.println("3 나왔습니다");
		}else if (num==4) {
			System.out.println("4 나왔습니다");
		}else if (num==5) {
			System.out.println("5 나왔습니다");
		}else {
			System.out.println("6 나왔습니다");
		}
		
		

	}

}
