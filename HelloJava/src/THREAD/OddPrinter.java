package THREAD;

public class OddPrinter implements Runnable {

	@Override
	public void run() {
		for(int i =1; i<100; i=i+2) {
			System.out.println("oddprint1 thread : "+ i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException ie) {
				
				ie.printStackTrace();
			}
		}
		
		
		
		
	}

	
}
