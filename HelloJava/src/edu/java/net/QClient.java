package edu.java.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class QClient {


	final static String SERVER_IP = "172.30.1.30";
	final static int SERVER_PORT = 7878;
	
	public static void main(String[] args) {
		Socket socket = null;
		InputStream is = null;
		OutputStream os = null;
		Scanner sc = new Scanner(System.in);
		int count =0;
		byte[] buffer = new byte[1024];
		int readNum = 0;
		
		try {
//접속할서버와 서버포켓 을 지정한다
			socket = new Socket(SERVER_IP,SERVER_PORT);	
//			해당서버에서 들어온 InputStream을 변환
			is = socket.getInputStream();
//			서버에 보낼 입력내용을 변환
			os = socket.getOutputStream();
//			서버에서 불러온 InputStream을 읽고 바이트배열에 저장
			readNum=is.read(buffer);
			
			System.out.println(new String(buffer,0,readNum));
			
//			클라이언트또한 계속 유지되야하니 무한 반복문을 설정
			while(true) {

//			문제 10회 시 종료...
				if(count==10) break;
//			서버에서 데이터가 넘어올때까지 즉 서버반응이 있기전까지대기하는상태@@@@@질문필요 이게 맞는가????
				while(true) {
					if((readNum=is.read(buffer)) != -1) break;
				}
//				바이트로 변환된 서버에서 넘어온 입력값을 문자열로 변환후 출력!
				System.out.println(new String(buffer,0,readNum));
//			유저입력Scanner sc 를 바이트로 형변환 시키고 출력
				os.write(sc.nextLine().getBytes());
//				서버에서 데이터가 넘어올때까지 즉 서버반응이 있기전까지대기하는상태@@@@@질문필요 이게 맞는가????
				while(true) {
					if((readNum=is.read(buffer)) != -1) break;
				}
//				바이트로 변환된 서버에서 넘어온 입력값을 문자열로 병환후 출력!
				System.out.println(new String(buffer,0,readNum));
//				문제 종료를 결정할 카운트는 문제 풀이후 1++!
				count++;
			}
			
//			서버에서 데이터가 넘어올때까지 즉 서버반응이 있기전까지대기하는상태@@@@@질문필요 이게 맞는가????
			while(true) {
				if((readNum=is.read(buffer)) != -1) break;
			}
			System.out.println(new String(buffer,0,readNum));
		}
		
		catch(IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				socket.close();
				is.close();
				sc.close();
				os.close();
			} catch(IOException ioe) {
				ioe.printStackTrace();
			}
		}
		
	}
	
}
