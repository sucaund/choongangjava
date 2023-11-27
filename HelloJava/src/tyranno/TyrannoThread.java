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
	ObjectInputStream is = null;
	ObjectOutputStream os = null;

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
			System.out.println("쓰레드 입장하였습니다");
			System.out.println("해당 쏘켓 주소입니다!" + socket);
			os = (ObjectOutputStream) socket.getOutputStream();
			is= (ObjectInputStream) socket.getInputStream();//해답은 서버쪽 도네 생성자 값에 아무것도 넣지않아서이다!

			
			int don = (int)is.readObject();
			donae.setDonae(don);
		
			
			System.out.println("첫번쨰 쓰레드 문제 해결입니다!");
//			donae.setDonae(new Integer((int) is.readObject()));
//			while (true) {
				System.out.println("111");
				((ObjectOutputStream) os).writeObject(tyrannoIn);
				((ObjectOutputStream) os).writeObject(donae);
				os.flush();
				System.out.println("오브젝트 tyrannoIn writeObject는 성공입니다!");//여기서 막힘!
				System.out.println("33333");
							
//				os.writeObject(donae);
//						"후원이 완료되었습니다!"

//			} // true
		
		} // try

//		catch (ClassNotFoundException e) {
//			System.out.println("클래스 오류입니다!");
//			e.printStackTrace();
//		}
		catch (IOException ioe) {
			System.out.println("입출력 오류가 발생했습니다!!!!!!! " + ioe.getMessage());
			ioe.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		} 		finally {
			try {
				is.close();
				os.close();
				socket.close();
				
			} catch (IOException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
			}
		}
		
	}// run
}// class
