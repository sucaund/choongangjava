package edu.java.thread;

// 1~30의 정수 중 짝수만 출력하는 쓰레드
public class EvenThread extends Thread {
	
//	공유객체를 스레드가 가지도록 (has a)
	private SharedObject sharedObject;

	public SharedObject getSharedObject() {
		return sharedObject;
	}

	public void setSharedObject(SharedObject sharedObject) {
		this.sharedObject = sharedObject;
	}

	@Override
	public void run() {
		while (true) {
//		짝수일떄만 실행
			if (sharedObject.isEvened()) {
				try {
//			동기화 블럭 : 공유객체에 대해서 락을 획득 
//			(Eventhread가 SharedObject를 독점)
					synchronized (sharedObject) {
						System.out.println("EvenThread : " 
								+ sharedObject.getSharedNum());
						sharedObject.setSharedNum
							(sharedObject.getSharedNum()+1);
//						홀수 출력할 차례
						sharedObject.setEvened(false);
//						30에서 종료하기위해서 interruptedException을 강제 발생시킴
						if (sharedObject.getSharedNum()==30) interrupt();						
					}
					Thread.sleep(500);
				} catch (InterruptedException ie) {
					System.out.println("EvenThread 종료!");
					break;
				}
			} // if
		} // while
	} // run
	
}
