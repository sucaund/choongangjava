package edu.java.net;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Qthread extends Thread{

	private Socket socket;
	private QSave list;

public Qthread() {
	// TODO 자동 생성된 생성자 스텁
}
public Qthread(Socket socket, QSave quizList) {
	super();
	this.socket = socket;
	this.list = quizList;
}	

@Override
public void run() {
//	외부의 들어값을 저장하는...
	InputStream is = null;
//외부로 배출하는 값을 저장하는...
	OutputStream os = null;
//	문제들이 담긴 리스트이 크기 문제집합(문제,답) 의 양을 추출한다. .size는  목록(list의 요소 수를 반환)
	int listSize = list.quizList.size();
	
	long prevMS = 0;
	long nextMS = 0;
//	클라이언트 사용자가 입력할 값을 담아주기위해...
	String answer ="";

	try {
		is = socket.getInputStream();
		os = socket.getOutputStream();
		byte[] buffer = new byte[1024];
		int readByteNum = 0;
		int correctCount = 0;

		os.write("서버---퀴즈 프로그램을 시작합니다.".getBytes());

		os.flush();
		
//		리스트인 quizList 안의 요소인 문제목록 의 갯수만큼 해당 퀴즈프로그램을 시작한다는말...
		for(int i=0;i<listSize;i++) {

			os.write(
// 리스트인 quizList 안의 요소를 꺼내야 하는데 get(i)를 통해 get의 이름 그대로 가져오는 역할 ()안의 번쨰로부터...
//자 그럼 quizList 안의 요소를 가져오는데 그요소 안에서 AddQ(String question, String answer) 를보자면
//문제 인String question만을 가져와야할것아닌가? 해당 생성자에서
//public String getQuestion() {
//					return question;}  를통해question만을 설정하는 생성자만을 가져올수있다!
//					.getBytes()는 그런 가져온 질문을 네트워킹에서 유일하게 사용하는 바이트로 변환하여준다.
					("서버---퀴즈"+(i+1)+" : "+list.quizList.get(i).getQuestion()).getBytes()

					);
			os.flush();
			
			prevMS = System.currentTimeMillis();
//is는외부에서 받은 InputStream인데 이를 .read (읽다) 이때 .read(안에 바이트배열)를 진행한다면
//내용을 바이트단위로 변환시켜 저장한다 int readByteNum안에 해당바이트를 저장한다. 
//-1은 read메소드가 더이상 읽을게 없을떄 반환한다.
			while((readByteNum = is.read(buffer))==-1);
			nextMS = System.currentTimeMillis();
//answer에 다가는 새로운 string 생성자로 적용해준다.  buffer(바이트배열)안에 0부터 is를 변환시킨 바이트값인 readByteNum까지
			answer = new String(buffer,0,readByteNum);
			System.out.println(answer);
			if(nextMS-prevMS <= 10000 ) {

				// 정답 판별 부분
//이번에도 리스트인 quizList안에서 i번쨰 요소를 get하고 또그 요소중에서 AddQ(String question, String answer)중에
//answer 부분만을 담당하는 객체인 getAnswer을 지정하고 그내부값과 정답으로 입력한 answer의 내용을 비교한다
//.equals 이므로 내용이 같다는 조건하에 정답 출력! 아닐시 오답 출력문을 출력!
//==============================				
//public String getAnswer() {
//	return answer;
//}
//==============================	
				if(list.quizList.get(i).getAnswer().equals(answer)) {

					os.write("서버---정답입니다.".getBytes());
					os.flush();
					correctCount++;
				} else {
					os.write("서버---오답입니다.".getBytes());
					os.flush();
				}
			} else {
				os.write("서버---시간초과".getBytes());
				os.flush();
			}

			
		
		}//for
//		해당 문제 트리 가 끝난후...
		os.write(("서버---10문제 중 "+correctCount+"문제 정답입니다.").getBytes());
		os.flush();
	} catch (Exception e) {
		// TODO: handle exception
	}

}//run

}//class
