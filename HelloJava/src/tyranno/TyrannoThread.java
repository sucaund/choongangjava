package tyranno;

import java.net.Socket;

//우선 서버에 출력후 클라이언트클래스에 도네값을 입력하면 그값을 가지고 
// 최대금액 최소금액을 비교 함과 동시에 모든 조건을 만족하면
//도네금액을 현재 후원액에 추가한다
// 현재 후원액이 목표금액과 같아진다면 후원 종료 선언 
public class TyrannoThread extends Thread {

	Socket socket;

	public TyrannoThread() {
	}

	public TyrannoThread(Socket socket) {
		this.socket = socket;
	}
//클라이언트 아웃풋 쓰레드는 인풋
	@Override
	public void run() {
		TyrannoDonae don = new TyrannoDonae();
		TyrannoIn iin = new TyrannoIn();

		int max = iin.getMaxmoney();
		int ddon = don.getDonae();
		int money = iin.getMoney();

		while (true) {
			System.out.println("후원내용 : " + iin.getName());
			System.out.println("후원 목표액 : " + iin.getMaxmoney());
			System.out.println("현재 후원액 : " + iin.getMoney());
			System.out.println("후원내용" + iin.getDetail());
			System.out.println("후원 금액을 입력해주세요 : " + don);

			if (10000 > ddon || ddon > max) {
				System.out.println("적정 금액을 입력해주세요!");
			}

		} // while
	}// run

}// class
