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
	final static String SERVER_IP = "127.0.0.1";
	final static int SERVER_PORT = 7843;

	
	
	public static void main(String[] args) {
		Socket socket=null;
		ObjectInputStream is =null;
		ObjectOutputStream os = null;
		Scanner sc =null;
		try {// try
				
			socket = new Socket(SERVER_IP, SERVER_PORT); 		
			is =new ObjectInputStream (socket.getInputStream());
			os = new ObjectOutputStream (socket.getOutputStream());
			sc = new Scanner(System.in);
			String answer = sc.nextLine();
			System.out.println(answer);
			while (true) {
//				클라이언트 클래스가 있는 컴퓨너에는 클라이언트만이 아니라 생성자클래스들도 있어야한다!
				System.out.println("asdasd");
				TyrannoIn ti = (TyrannoIn)is.readObject();
				System.out.println("asdasd");
				TyrannoDonae td = (TyrannoDonae)is.readObject();
				
				System.out.println( "프로젝트 이름 : " + ti.getName());
				System.out.println("프로젝트 목표액 : "+ ti.getMaxmoney());
				System.out.println("현재 모금액 : "+ ti.getMoney());
				System.out.println("후원내용 : " + ti.getDetail());
				System.out.print("후원액을 입력해주세요");
				//int answer = sc.nextInt();
				//os.write(answer); // 서버에 데이터 전송
				//os.flush();				
				
				

			}

		} // try
		catch (UnknownHostException e) {
			System.out.println("서버를 찾을 수 없습니다: " + e.getMessage());
			e.printStackTrace();
		}  catch (ClassNotFoundException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}
		catch (IOException e) {
			System.out.println("입출력 오류가 발생했습니다: " + e.getMessage());
			e.printStackTrace();
		}
		
	}
}
