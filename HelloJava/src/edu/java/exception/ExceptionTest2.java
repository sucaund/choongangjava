package edu.java.exception;

public class ExceptionTest2 {

		public static void main(String[] args) {
			//실습1 out of memory 에러를 내보세요 무한정객체
			//실습2	stack overflow 에러를 내보세요
			
			
	/*	int count=0;
		while (true) {
			ExceptionTest2 e2=new ExceptionTest2();
			System.out.println(++count + "|"+e2);
		}
	*/
			
			A();
		}
	
		public static void A() {
			B();
		}
		public static void B() {
			A();
		}
}
