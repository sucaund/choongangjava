package tyranno;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TyrannoClient {
	final static String SERVER_IP = "127.0.0.1";
	final static int SERVER_PORT = 7843;

	public static void main(String[] args) {
		Socket socket = null;
		ObjectInputStream is = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		try {// try
			socket = new Socket(SERVER_IP, SERVER_PORT);
			is = new ObjectInputStream(socket.getInputStream());
			dos = new DataOutputStream(socket.getOutputStream());
			dos.writeInt(answer);// 단순히 int값의 데이터를 보낼떈 Object가 아닌 DataOutputStream로 보내준다
			dos.flush();

			while (true) {

				TyrannoIn ti = (TyrannoIn) is.readObject();
				TyrannoDonae td = (TyrannoDonae) is.readObject();
//				클라이언트 클래스가 있는 컴퓨너에는 클라이언트만이 아니라 생성자클래스들도 있어야한다!
				System.out.println("======================================");
				System.out.println("           __\r\n" + "                / _)\r\n" + "       _.----._/ /\r\n"
						+ "      /        /\r\n" + "  __/ (  | (  |\r\n" + "/__.-'|_|--|_|");
				System.out.println("======================================");
				System.out.println("프로젝트 이름 : " + ti.getName());
				System.out.println("프로젝트 목표액 : " + ti.getMaxmoney());
				System.out.println("현재 모금액 : " + ti.getMoney());
				System.out.println("후원내용 : " + ti.getDetail());
				System.out.println("\n");
				System.out.println("쓰레드에서 전송받은 도네값 : " + td.getDonae());
				System.out.print("후원액을 입력해주세요 : ");
				answer = sc.nextInt();
			}
//				구현희망1.  오로지 숫자만입력및 1000부터 100000까지만입력가능한 제약
			// 단순히 int값의 데이터를 보낼떈 Object가 아닌 DataOutputStream로 보내준다

//				작성자가 원하는것은 클라이언트에서 입력한값이 쓰레드 클래스로 넘어간후 해당객체값을 바꾸는것이다...

		} // try
		catch (UnknownHostException e) {
			System.out.println("서버를 찾을 수 없습니다: " + e.getMessage());
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("입출력 오류가 발생했습니다1 " + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("입출력 오류가 발생했습니다2" + e.getMessage());
			e.printStackTrace();
		}
	}// main
}
