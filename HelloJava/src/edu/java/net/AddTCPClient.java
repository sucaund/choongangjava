package edu.java.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class AddTCPClient {

//	접속할 서버아이피
final static String ADDSERVER_IP="172.30.1.30";
//접속할서버의 포트
final static int ADDSERVER_PORT= 8888;

final static String MESSAGE_FROM_CLIENT="BAB MU GU YO";

public static void main(String[] args) {
//	클라이언트 소켓
	Socket socket=null;
//	클라이언트가 서버에 보낼바이트 스츠림
	OutputStream os=null;
//	서버에서 받을 바이트 스트림
	InputStream is= null;
try {
	socket =new Socket(ADDSERVER_IP,ADDSERVER_PORT);
	os= socket.getOutputStream();
	is= socket.getInputStream();
	
	os.write(MESSAGE_FROM_CLIENT.getBytes());
	os.flush();
	
	byte[] data =new byte[16];
	int n =is.read(data);
	final String messageFromserver =new String(data,0,n);
	System.out.println(messageFromserver);
	
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
