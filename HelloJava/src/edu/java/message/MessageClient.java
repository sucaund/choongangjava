package edu.java.message;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class MessageClient {
	
	final static String SERVER_IP = "127.0.0.1";
	final static int SERVER_PORT = 4444;
	public static void main(String[] args) {
		Socket socket = null;
		ObjectOutputStream os = null;
		byte[] buffer = new byte[1024];

		
		
	try {
		//접속할서버와 서버포켓 을 지정한다
		socket = new Socket(SERVER_IP,SERVER_PORT);
//		서버에 보낼 입력내용Object 임으로  ObjectOutputStream변환 해준다
		os = new ObjectOutputStream (socket.getOutputStream());
		List<Message> messagelist =new ArrayList<Message>();
		
		Message mes =new Message("hello","goodday!", null);
		
		messagelist.add(new Message("hello","goodday!", null));
		messagelist.add(new Message("ello","sadday!", null));
		messagelist.add(new Message("wowhello","noodday!", null));
		os.writeObject(messagelist);
	
	}//try
	catch (Exception e) {
		// TODO: handle exception
	}
	finally {
		try {
			socket.close();
			os.close();
		} catch (IOException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}
	}
	}//main
	
}
