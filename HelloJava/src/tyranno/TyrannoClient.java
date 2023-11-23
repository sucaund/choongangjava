package tyranno;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TyrannoClient {
	final static String SERVER_IP = "172.30.1.30";
	final static int SERVER_PORT = 7143;

//1123 클라이언트 클래스에 바라는것
//클라이이언트 입력을 티라노도네 or 쓰레드에 보애야 하는가?
	public static void main(String[] args) {
		try (Socket socket = new Socket(SERVER_IP, SERVER_PORT);
				ObjectInputStream is = new ObjectInputStream(socket.getInputStream());
				ObjectOutputStream os = new ObjectOutputStream(socket.getOutputStream());
				Scanner sc = new Scanner(System.in)) {// try

			while (true) {

				TyrannoThread thread = (TyrannoThread) is.readObject();
				System.out.println(thread);
				System.out.println("후원 금액을 입력해주세요: ");
				int answer = sc.nextInt();
				os.writeObject(answer); // 서버에 데이터 전송
				os.flush();
				
			}

		} // try
		catch (UnknownHostException e) {
			System.out.println("서버를 찾을 수 없습니다: " + e.getMessage());
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾을 수 없습니다: " + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("입출력 오류가 발생했습니다: " + e.getMessage());
			e.printStackTrace();
		}
		
	}
}
