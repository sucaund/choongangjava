package edu.java;

public class Exam7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
//			""차례 규칙4~0 --1 print
			for (int j = 1; j <= 5-i; j ++) {
				System.out.print("  ");
			}
//			"*"차례규칙
			for(int k=1;k<=i*2-1;k++) {
				System.out.print("*");
			}
			System.out.println( );
		}
		
		for (int i = 4; i >= 1; i--) {
//			""차례 규칙
			for (int j = 1; j <= 5-i; j ++) {
				System.out.print("1");
			}
//			"*"차례규칙
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println( );
		}
	}

}
