package chapter03;

public class CompareOperator2 {
//비교 연산자
	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2==v3); //true
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4==v5); //false 0.1f = 0.1000000014901..
		System.out.println(v4<=v5); //true
		System.out.println((float)v4==v5); //true

	}

}
