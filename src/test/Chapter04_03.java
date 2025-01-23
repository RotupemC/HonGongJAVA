package test;

public class Chapter04_03 {

	public static void main(String[] args) {
		
		while(true) {
			int i = (int)(Math.random()*6)+1;
			int j = (int)(Math.random()*6)+1;
			System.out.println("나온 눈: ("+i+","+j+")");
			
			if(i+j == 5) break;
		}
		
		
		
		
	}

}
