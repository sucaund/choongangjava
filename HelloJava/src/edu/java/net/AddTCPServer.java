package edu.java.net;
//요구사항
//클라이언트가 서버에 접속하면 매10초마다 클라이언트에게 퀴즈를 낸다.
//클라이언트는 10촌안에 서버에 답문자를 보냔다
//서버는 총10번의퀴즈를 내며 최종적으로 정답 횟수를 출력해준다
//출력예
//서버---:퀴즈프로그램을 시작합니다
//서버---퀴즈1 세상에서 가장 슬픈채소는?
//클라이언트---답 :우엉
//서버---(정답입니다)
//서버---퀴즈2 햄버거의 색은?
//클라이언트--- 답: 몰라
//서버---(오답입니다).
//서버--- :10문제중 7문제 정답입니다
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

//출력예
//서버---:퀴즈프로그램을 시작합니다
//서버---퀴즈1 세상에서 가장 슬픈채소는?
//클라이언트---답 :우엉
//서버---(정답입니다)
//서버---퀴즈2 햄버거의 색은?
//클라이언트--- 답: 몰라
//서버---(오답입니다).
//서버--- :10문제중 7문제 정답입니다

public class AddTCPServer extends Thread {

	final static int SERVER_PORT =7878;
	final static String MESSAGE_FROM_SERVER ="퀴즈프로그램을 시작합니다!";
	final static String MESSAGE_FROM_O ="정답입니다.";
	final static String MESSAGE_FROM_X ="오답입니다.";

	
	public static void main(String[] args) {
		AddQ quizQuestions = new AddQ();
		
		
		
		//		서버소캣 제작
		ServerSocket serversocket =null;
				
		try {
//			설정할 서버포트를 사용할 소켓이 있어야 하므로
			serversocket = new ServerSocket(SERVER_PORT);
		}
		catch (IOException ioe) {
		ioe.printStackTrace();
		}
//		클라리언트에게 받는
		InputStream is=null;
//		클라이언트에게 보낼
		OutputStream os=null;
	try {
		while (true) {
//			서버와 클라이언트 연결 허용!!!!
			Socket  socket = serversocket.accept();
		
//			클라이언트의 답변을 입력!
			is =socket.getInputStream(); 
//			서버의 질문을 클라이언트에게 송출
			os = socket.getOutputStream();
			
			byte[] data = new byte[1024];
			int n=is.read(data);
			final String messageFromClient =new String(data,0,n);
//			서버에서 클라이언트에게 바이트 배열을 보냄
			
			
			
//			getBytes를 통해 srting MESSAGE_FROM_SERVER을 변환하고 os에 write하여 작성
			os.write(MESSAGE_FROM_SERVER.getBytes());
			
			
			os.flush();
			
			
			
			
			
			
						
		}//while
	}//try
	catch (Exception e) {
		// TODO: handle exception
	}
	finally {
		 try {
			 is.close();
			 os.close();
		 } catch (IOException ioe) {
			 ioe.printStackTrace();
		 }
	}
	}//main
	
}









