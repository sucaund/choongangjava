package edu.java.message;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.List;

import edu.java.net.Qthread;

public class MessageServer {

	final static int SERVER_PORT = 4444;

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		ObjectInputStream is = null;
		FileWriter fw= null;
		try {
			serverSocket = new ServerSocket(SERVER_PORT);
			while (true) {
				socket = serverSocket.accept(); // 소켓 연결에 성공하면
//클라이언트에서 소캣을 타고 넘어온 InputStream을 ObjectInputStream
//로 재생성해 준다

				is = new ObjectInputStream(socket.getInputStream());
				try {
//			메세지 타입으로 변환 해주자
					List<Message> messagelist =
							(List<Message>)is.readObject();
					
					File dir =new File("c:/java_logs");
					if(!dir.exists()) dir.createNewFile();

					File file =new File("c:/java_logs/log_2031121.txt");
					if(!file.exists()) file.createNewFile();
					
					fw = new FileWriter(file);
					
					for (Message message : messagelist) {
					System.out.println("제목"+message.getSubject());
					System.out.println("내용"+message.getContent());
					SimpleDateFormat sdf
						=new SimpleDateFormat("YYYY년MM월DD일");
					String writeDate = sdf.format(message.getWriteDate());
					System.out.println(message.getWriteDate());

					fw.write(writeDate + ":" + message.getSubject()+ ":"+
							message.getContent()+"\n");
					fw.flush();
					}//for
					
				}//try
				catch (ClassNotFoundException e) {
					e.printStackTrace();
				}//catch

			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				socket.close();
				is.close();
			} catch (IOException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
			}
		}
	}
}
