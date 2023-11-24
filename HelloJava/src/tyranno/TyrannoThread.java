package tyranno;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

//쓰레드는 오로지 데이터 값만관리!!!!

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

	@Override
	public void run() {
		try {
			System.out.println("TT");
			System.out.println(socket);
			is= new ObjectInputStream(socket.getInputStream());//?????여기서 막힘!
			System.out.println(is);
//			is = new ObjectInputStream(socket.getInputStream());
			os = new ObjectOutputStream(socket.getOutputStream());
			//			os = new ObjectOutputStream(socket.getOutputStream());
			/*
			while (true) {
				System.out.println("111");

				os.writeObject(tyrannoIn);
				System.out.println("22222");

				os.writeObject(donae);
//				donae = (TyrannoDonae) ((ObjectInputStream) is).readObject();
				System.out.println("33333");

				os.flush();
//						"후원이 완료되었습니다!"

			} // true
			*/
		} // try

		catch (IOException ioe) {
			System.out.println("입출력 오류가 발생했습니다: " + ioe.getMessage());
			ioe.printStackTrace();
		} 
	}// run
}// class
