package edu.java.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {

//	접속할 서버아이피
	final static String TCPSERVER_IP="172.30.1.30";
//	접속할서버의 포트
	final static int TCPSERVER_PORT= 8888;
//	클라이언트에게 보내는 메세지
	final static String MESSAGE_FROM_CLIENT="BAB MU GU YO";
	
	public static void main(String[] args) {
		
//		클라이언트 소켓
		Socket socket=null;
//		클라이언트가 서버에 보낼바이트 스츠림
		OutputStream os=null;
//		서버에서 받을 바이트 스트림
		InputStream is= null;
		
		
		try {
//			클라이언트 소캣을 생성
			socket =new Socket(TCPSERVER_IP,TCPSERVER_PORT);
			System.out.println("socket 연결");
			
			os= socket.getOutputStream();
			is= socket.getInputStream();
//			서버에 메세지를 전송
			os.write(MESSAGE_FROM_CLIENT.getBytes());
			os.flush();
//			서버가보낸 바이트 스트림을 저장할 버퍼
			byte[] data =new byte[16];
			int n =is.read(data);
			final String messageFromserver =new String(data,0,n);
			System.out.println(messageFromserver);
		}
		catch (UnknownHostException uhe) {
		uhe.printStackTrace();
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
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
		

}//class
