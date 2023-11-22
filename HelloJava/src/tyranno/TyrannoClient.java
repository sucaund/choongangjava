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
	final static String SERVER_IP = "172.30.1.30";
	final static int SERVER_PORT = 7878;

	public static void main(String[] args) {
		Socket socket = null;
		ObjectInputStream is = null;
		ObjectOutputStream os = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			socket = new Socket(SERVER_IP,SERVER_PORT);
			is = (ObjectInputStream) socket.getInputStream();
			os = (ObjectOutputStream) socket.getOutputStream();
			int d=sc.nextInt();
			os.write(d);
			
		} catch (UnknownHostException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}	

		
	}
}
