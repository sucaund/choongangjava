package Yee;

public class Task implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
		}
		
	}

}
