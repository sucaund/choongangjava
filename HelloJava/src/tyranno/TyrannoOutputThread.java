package tyranno;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

//쓰레드는 오로지 데이터 값만관리!!!!

public class TyrannoOutputThread extends Thread {

	Socket socket;
	TyrannoIn tyrannoIn;
	TyrannoDonae donae;
	ObjectOutputStream os = null;

	public TyrannoOutputThread() {
	}

	public TyrannoOutputThread(Socket socket, TyrannoIn tyrannoIn, TyrannoDonae donae) {
		this.socket = socket;
		this.tyrannoIn = tyrannoIn;
		this.donae = donae;
	}

	@Override
	public void run() {
		try {
while (true) {
	
			os = new ObjectOutputStream(socket.getOutputStream());
				os.writeObject(tyrannoIn);
				os.writeObject(donae);
				os.flush();
				System.out.println("당신은 최고입니다! output 순환");
			}//while

		}			
	
		catch (IOException ioe) {
			System.out.println("입출력 오류가 발생했습니다!!!!!!! " + ioe.getMessage());
			ioe.printStackTrace();
		}

	}// run
}// class
