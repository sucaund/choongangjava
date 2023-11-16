package THREAD;

public class ThreadExer2 {

	public static void main(String[] args) {
	Thread oddThread =new OddThread();
	Thread evenThread	=new Eventhread();
	Thread charThread=	new CharThread();
		
	oddThread.start();
	evenThread.start();
	charThread.start();
	
		
		//		1.10보다 작은 홀수가 먼저 출력후
//		2.그후 홀수와 짝수가 같이 출력
//		3.짝수 20이 출력된후 영문자가 출력되야함

//		ex))
//		1
//		3
//		5
//		7
//		9
//		10
//		11
//		...
//		20
//		21
//		22
//		A
//		23
//		24
//		B
	}
}
