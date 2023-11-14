package Exam03;

import java.awt.Toolkit;

public class Snippet {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//작업1 소리를 5번
		Thread thread =new Thread() {
			@Override
		
				public void run() {
					Toolkit toolkit = Toolkit.getDefaultToolkit();
					for(int i=0;i<5;i++) {
						toolkit.beep();
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							
						
					}
					
				}
			}
		};

		thread.start();
		//작업2
		for(int i=0;i<5;i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
		}
		
	}
	
}

