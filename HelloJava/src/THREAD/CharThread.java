package THREAD;

//대문자 a~z까지 출력하는 스레드
public class CharThread extends Thread {

	Eventhread even = new Eventhread();
	
	@Override
	public void run() {

		for (int i = 65; i < 91; i++) {
			System.out.println("CharThread : " + (char) i);
		

		try {
			Thread.sleep(500);
			}
		catch (InterruptedException ie) {
			}
	
		}
	}
}
