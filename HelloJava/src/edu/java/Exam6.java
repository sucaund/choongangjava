package edu.java;

public class Exam6 {

	public static void main(String[] args) {

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
	}
}