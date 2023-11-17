package edu.java.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer extends Thread{
//서버는 계속 살아있어야하므로 쓰레드로 항시 가동한다.
	
	final static int SERVER_PORT =7878; //0부터 1023제외 ~65534까지중하나.
//서버에서 문자열을 하나 보낼껀데
	final static String MESSAGE_FROM_SERVER ="Hello Client im hwang!!";
	
			public static void main(String[] args) {
				
//				서버는 서버소켓이필요함
//				ServerSocket 은 클라이언트에게 할당할 내sokect을 관리하는역할
				ServerSocket serversocket =null;
				
				try {
//					설정한 포트를사용하는 소켓 생성
					serversocket = new ServerSocket(SERVER_PORT);
				}
				catch (IOException ioe) {
				ioe.printStackTrace();
				}
//				클라이언트>서버
				InputStream is=null;
//				서버>클라이언트
				OutputStream os=null;
				try {
//					무한반복-안해주면 서버가 끝나니깐!				
					while (true) {
					System.out.println("socket 대기");
//					서버소켓의 accept 메소드는 Blocking 메소드라 부르며
//					accept 메소드가 호출되면 클라이언트의 연결을 대기

					//클라이언트 통신할 서버 소켓
					Socket  socket = serversocket.accept();
					System.out.println("hosrt : "+socket.getInetAddress()+"연결성공");
					
					//클라이언트와 연결되었을떄 클라이언트에 할당한 소켓의 입출력 스트림을 얻을수있다.
						is =socket.getInputStream(); //클라이언트>서버 바이트스트림
						os = socket.getOutputStream(); //서버> 클라이언트 바이트스트림
//						InputStream,OutputStream byte단위로 통신
//						16바이트 버퍼생성
						byte[] data = new byte[16];
//						읽어드릴 바이트 수 변환
						int n=is.read(data);
//						클라이언트에게 받은 바이트스림을 문자열로 변환
						final String messageFromClient =new String(data,0,n);
//						서버에서 클라이언트에게 바이트 배열을 보냄
						os.write(MESSAGE_FROM_SERVER.getBytes());
//						OutputStream은 flush를 해주어야 클라이언트에게 전송됨
						os.flush();
				 }
				} catch (IOException ioe) {
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
			
			
			}
	
}
