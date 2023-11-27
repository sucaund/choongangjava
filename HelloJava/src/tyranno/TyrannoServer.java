package tyranno;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import edu.java.net.Qthread;

public class TyrannoServer {
	final static int SERVER_PORT = 7843;

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;			
		try {
			serverSocket = new ServerSocket(SERVER_PORT);
			while (true) {
				socket = serverSocket.accept(); // 소켓 연결에 성공하면
				System.out.println("후원채널에 연결을 성공하셨습니다!");
				
				TyrannoIn in = new TyrannoIn("티라노 병따개", 1000000, 0,
						"티라노 병따개! 고대의 포식자가 \r\n" + "\r\n" + "현대로넘어와 맥주까지 노립니다!!!\r\n" + "\r\n" + "순순히 맥주를 넘기고 목숨을 지키세요!");
				TyrannoDonae donae = new TyrannoDonae(0);

				new TyrannoThread(socket, in,donae).start();//				

			}
		} catch (IOException e) {
			System.out.println("입출력에 문제가있어요!");
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		} 
		finally {
			try {
					
				socket.close();
			} catch (IOException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
			}
		}
	}// main
}// class
