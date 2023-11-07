package edu.java;

public class JavaVariable2 {

	//non-static member variable
	int realnsi=1;
	static int realsi;
	{
		//local variable
		int nsi=1;
		realnsi=1;
		realsi=1;
		A a =new A();  //static블록안의 A a =new A();와 
//		다르다 선언위치에 따라 스택 힙등으올 나뉜다
	}
	
	static {
		//local variable
		int si=2;
		realsi=1;
		A a =new A();

	}
	
	public static void main(String[] args) {
		System.out.println(nsi);
		System.out.println(si);
	}
	
}
