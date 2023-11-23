package tyranno;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

//우선 서버에 출력후 클라이언트클래스에 도네값을 입력하면 그값을 가지고 
// 최대금액 최소금액을 비교 함과 동시에 모든 조건을 만족하면
//도네금액을 현재 후원액에 추가한다
// 현재 후원액이 목표금액과 같아진다면 후원 종료 선언 
public class TyrannoThread extends Thread {

	Socket socket;
	TyrannoIn tyrannoIn;
	TyrannoDonae donae;
	ObjectInputStream is;
	ObjectOutputStream os;
	public TyrannoThread() {
	}

	public TyrannoThread(Socket socket, TyrannoIn tyrannoIn, TyrannoDonae donae) {
		this.socket = socket;
		this.tyrannoIn = tyrannoIn;
		this.donae = donae;
	}

//클라이언트 아웃풋 쓰레드는 인풋
	@Override
	public void run() {
		try {
			is = new ObjectInputStream(socket.getInputStream());
			os = new ObjectOutputStream(socket.getOutputStream());
			donae = (TyrannoDonae) is.readObject();
			int don = donae.getDonae();
			int mon = tyrannoIn.getMoney();
			while (true) {
//네트워크간의 통신에선 무조건 바이트 다누이이다
//버퍼안에  아웃풋 스트링라이터 안에 소켓.겟바이트
				while (tyrannoIn.getMaxmoney() <= tyrannoIn.getMoney())
				{
					
					System.out.println("후원내용 : " + tyrannoIn.getName());
					System.out.println("후원 목표액 : " + tyrannoIn.getMaxmoney());
					System.out.println("현재 후원액 : " + tyrannoIn.getMoney());
					System.out.println("후원내용" + tyrannoIn.getDetail());
					System.out.println("후원 금액을 입력해주세요 : " + donae.getDonae());

					if (10000 > donae.getDonae() || donae.getDonae() > tyrannoIn.getMaxmoney()) {
						System.out.println("적정 금액을 입력해주세요!");
						return;
					}
						tyrannoIn.setMoney(don + mon);


					System.out.println("후원이 완료되었습니다!");
				} // 비교while
			} // true
		} // try
		catch (IOException ioe) {
			System.out.println("입출력 오류가 발생했습니다: " + ioe.getMessage());
			ioe.printStackTrace();
		} catch (ClassNotFoundException ce) {
			System.out.println("입출력 오류가 발생했습니다: " + ce.getMessage());
			ce.printStackTrace();
		}
	}// run
}// class
