package tyranno;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

//쓰레드는 오로지 데이터 값만관리!!!!

public class TyrannoInputThread extends Thread {

	Socket socket;
	TyrannoIn tyrannoIn;
	TyrannoDonae donae;
	DataInputStream dis = null;
	int i = 0;

	public TyrannoInputThread() {
	}

	public TyrannoInputThread(Socket socket, TyrannoIn tyrannoIn, TyrannoDonae donae) {
		this.socket = socket;
		this.tyrannoIn = tyrannoIn;
		this.donae = donae;
	}

	@Override
	public void run() {
		try {
			while (true) {
				
			dis = new DataInputStream(socket.getInputStream());// 해답은 서버쪽 도네 생성자 값에 아무것도 넣지않아서이다!
			
				i = dis.readInt();
				donae.setDonae(i);
				System.out.println("힘을내세요!(input순환)");
			}
				
				
		

		} // try
		catch (IOException ioe) {
			System.out.println("입출력 오류가 발생했습니다!!!!!!! " + ioe.getMessage());
			ioe.printStackTrace();
		}

	}// run
}// class
