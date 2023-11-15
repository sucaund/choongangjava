package THREAD;

import java.util.Iterator;

public class ThreadExar1 {
	public static void main(String[] args) {
//1.Runnable 구현했을경우 Thread객체를 생성해서 start()
//	Thread oddprinter =new Thread(new OddPrinter());
//	oddprinter.start();

//2.Thread를 상속 받을경우	
//	new OddPrint2().start();

//3. 	Runnable을 익명객체로 만들어사 해당 콛에 한번만사용 (자주사용)
		Thread thread = new Thread() {
		@Override
			public void run() {
				for (int i = 1; i < 100; i = i + 2) {
					System.out.println("oddprint1 thread : " + i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException ie) {

						ie.printStackTrace();
					}
				}
			}
			};
			thread.start();
thread.setName("홀짝이");
System.out.println(thread.getName());
		for (int i = 2; i < 102; i = i + 2) {
			System.out.println("mainthread : " + i);

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}
		}
	}
}
