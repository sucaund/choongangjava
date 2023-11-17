package edu.java.net;

import java.util.List;

public class QSave {

List<AddQ> quizList;
	
	public QSave() {
		// TODO 자동 생성된 생성자 스텁
	}
	public QSave(List<AddQ> quizList) {
		super();
		this.quizList = quizList;
	}
	

	public List<AddQ> getQuizList() {
		return quizList;
	}

	public void setQuizList(List<AddQ> quizList) {
		this.quizList = quizList;
	}
	
	
}
