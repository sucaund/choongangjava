package edu.java.net;



public class AddQ {

private String question;
private String answer;

public AddQ () {
	
}

public AddQ(String question, String answer) {
	super();
	this.question = question;
	this.answer = answer;
}

public String getQuestion() {
	return question;
}

public void setQuestion(String question) {
	this.question = question;
}

public String getAnswer() {
	return answer;
}

public void setAnswer(String answer) {
	this.answer = answer;
}
	
	
//		맵에서 키와 밸류를 따로 추출해서 질문리스트, 정답리스트에 각 넣어준다!
//		이후 문제 출력시 질문리스트에서 질문만 순차적으로 나열
//		질문 출력-정답입력- 정답리스트에서 해당 순차 정보 가져오기 비교(10초뒤 다음 질문으로 넘어감)
//		10초뒤 질문과 사용자 입력값이 초기화되며 다음 짊누으로 다시올라감
//		10초안 정답입력후 비교시 같은 값일경우 정답카운터++
//		이후 10개의 질문이 이끝나면 "총문제 10개중에"+정답카운터+"맞히셧습니다!"
//		필요한 클래스 문제클래스, 해당문제를 추출하여 각자의 리스트에 넣을 클래스 해당퀴즈를 진행할 클래스
//		서버클래스, 클라이언트 클래스
		
	
}
