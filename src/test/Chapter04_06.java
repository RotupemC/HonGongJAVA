package test;

public class Chapter04_06 {

	public static void main(String[] args) {
		for(int i = 1; i<=4;i++) { //i=2
			for(int j = 4; j>=1;j--) { //j=432
				if(i<j) {
					System.out.print(" "); //``
				}else { System.out.print("*");	
				}
			}
			System.out.println();
		}

	}

}
