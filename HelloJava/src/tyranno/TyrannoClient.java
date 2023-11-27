package tyranno;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TyrannoClient {
	final static String SERVER_IP = "127.0.0.1";
	final static int SERVER_PORT = 7843;

	public static void main(String[] args) {
		Socket socket = null;
		ObjectInputStream is = null;
		ObjectOutputStream os = null;
		Scanner sc = new Scanner(System.in);
		try {// try
			socket = new Socket(SERVER_IP, SERVER_PORT);
			is = new ObjectInputStream(socket.getInputStream());
			os = new ObjectOutputStream(socket.getOutputStream());
			
//			while (true) {
				
				TyrannoIn ti = (TyrannoIn)is.readObject();
				TyrannoDonae td = (TyrannoDonae)is.readObject();
//				클라이언트 클래스가 있는 컴퓨너에는 클라이언트만이 아니라 생성자클래스들도 있어야한다!
				System.out.println("======================================");
				System.out.println("           __\r\n"
						+ "                / _)\r\n"
						+ "       _.----._/ /\r\n"
						+ "      /        /\r\n"
						+ "  __/ (  | (  |\r\n"
						+ "/__.-'|_|--|_|");
				System.out.println("======================================");
				System.out.println("프로젝트 이름 : " + ti.getName());
				System.out.println("프로젝트 목표액 : " + ti.getMaxmoney());
				System.out.println("현재 모금액 : " + ti.getMoney());
				System.out.println("후원내용 : " + ti.getDetail());
				System.out.println("\n");
				System.out.print("후원액을 입력해주세요 : ");
				int answer = sc.nextInt();
//				작성자가 원하는것은 클라이언트에서 입력한값이 쓰레드 클래스로 넘어간후 해당객체값을 바꾸는것이다...
//				TyrannoDonae donae.setDonae(is.read)
				
				os.writeObject(answer);
				os.flush();
				
//				ti.setMoney(ti.getMoney()+td.getDonae());

//				ti.setMaxmoney(new Integer(ti.getMoney())+ new Integer(td.getDonae()));
				
//				if(ti.getMoney()<=ti.getMaxmoney()) {
//					
//				}
//				
				
					
					
//			}//while

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
//		finally {
//			try {
//				
//				is.close();
//				os.close();
//				socket.close();
//				
//			} catch (IOException e) {
//				// TODO 자동 생성된 catch 블록
//				e.printStackTrace();
//			}
//		}
//		
	}//main
}
