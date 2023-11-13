package edu.java.collection;

public class Student {

//	
	// TODO Auto-generated method stub
	private String sno; // 학번
	private String name; // 성명
	private int kor; // 국어점수
	private int eng;
	private int math;

//=============생성자===============	상단 소스 
	public Student() {

	}

	public Student(String sno, String name, int kor, int eng, int math) {
		super();
		this.sno = sno;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
//=============생성자 끝==============

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}
}
