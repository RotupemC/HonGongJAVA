package chapter04;

public class ForSumFrom1To100_2 {
//1부터 100까지 합을 출력
	public static void main(String[] args) {
		int sum = 0;
		
		int i = 0;
		for(i=1; i<=100; i++) {
			sum += i;
		}

		System.out.println("1~" + (i-1)+ " 합 : "+sum);
	}

}
