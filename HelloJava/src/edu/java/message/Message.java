package edu.java.message;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.Date;

public class Message implements Serializable{

//	메세지 객체의 아이디 지정
	public static final long serialVersionUID=3289478932479L;
	
	private String subject; //제목
	private String content; //내용
	private Date writeDate; //작성일시

	public ObjectOutputStream os;
	
public Message() {

}

public Message(String subject, String content, Date writeDate) {
	super();
	this.subject = subject;
	this.content = content;
	this.writeDate = writeDate;
}

public String getSubject() {
	return subject;
}

public void setSubject(String subject) {
	this.subject = subject;
}

public String getContent() {
	return content;
}

public void setContent(String content) {
	this.content = content;
}

public Date getWriteDate() {
	return writeDate;
}

public void setWriteDate(Date writeDate) {
	this.writeDate = writeDate;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}

@Override
public String toString() {
	return "Message [subject=" + subject + ", content=" + content + ", writeDate=" + writeDate + "]";
}



}
