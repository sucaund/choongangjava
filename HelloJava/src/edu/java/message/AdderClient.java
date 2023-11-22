package edu.java.message;

import java.awt.BorderLayout;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
//패널 제작
//서버와 연결할 클라이언트 생성
//숫자 리스트 클래스 제작
//gui 버튼 클릭시 서버에서 제공하는 숫자들을 리스트에 저장 후 저장받은 리스트값의 총합을 출력
import javax.swing.JTextArea;

public class AdderClient extends JFrame{

	
	final static String SERVER_IP = "172.30.1.34";
	final static int SERVER_PORT = 5678;
	private static ArrayList<Integer> numbers = new ArrayList<>();
	public AdderClient() {
		init();
	}
	
	void init() {

//	제목
		this.setTitle("adder++");
//		클라이언트 gui 기본세팅
		this.setLayout(new BorderLayout());
//		새경계 직사각형 에 맞게 구성요소BorderLayout의 크기를 지정
		this.setBounds(0, 0, 400, 400);
		

		JPanel topPanel = new JPanel();
		JPanel midPanel = new JPanel();
		JPanel botPanel = new JPanel();

		JTextArea textArea = new JTextArea(10, 30);
		JTextArea textArea1 = new JTextArea();
		textArea1.setFont(new Font("Arial", Font.BOLD, 16));
		
		

		

	ad
		

		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new AdderClient();

		Socket socket = null;
		DataInputStream is = null;
		
		try {
			socket = new Socket(SERVER_IP,SERVER_PORT);
			is = new DataInputStream(socket.getInputStream());
			System.out.println(socket.getInetAddress()+"에 접속!!");
			int num= is.readInt();
		
		} catch (IOException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
