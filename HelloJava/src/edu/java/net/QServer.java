package edu.java.net;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class QServer {

final static int SERVER_PORT = 7878;
	
	public static void main(String[] args) {
		
		List<AddQ> qList = new ArrayList<AddQ>();
		qList.add(new AddQ("슬픈채소는?","우엉"));
		qList.add(new AddQ("10개의 도넛중에 9개를 점심으로 챙긴 또띠씨에게 무었이 있나?","당뇨병"));
		qList.add(new AddQ("팥이 콩한테 목마를떄 하는말은","콩나물"));
		qList.add(new AddQ("엄마와아빠는 결혼기념일이","같다"));
		qList.add(new AddQ("햄버거 색깔은?","버건디"));
		qList.add(new AddQ("왕이 월요일에 하는말은?","궁시렁"));
		qList.add(new AddQ("해장국에 넣으면 안되는것은?","들깨"));
		qList.add(new AddQ("웃기는 강아지인간은?","개그"));
		qList.add(new AddQ("푸틴 15살떄이름은?","피푸틴"));
		qList.add(new AddQ("추장보다 높은 사람은?","고추장"));
//		List<AddQ>중 퀴즈리스트 를 추가...
		QSave quizList = new QSave(qList); 
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(SERVER_PORT);
			while(true) {
				socket = serverSocket.accept();	//소켓 연결에 성공하면
				new Qthread(socket,quizList).start();	//쓰레드 만들어 방치
			}
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
		
	} // main
	
}
