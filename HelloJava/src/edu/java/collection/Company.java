package edu.java.collection;

public class Company {
//private을 추가함으로서 get,set을 통한 접근 수정이 가능하다.
	private String ssn; // 사업자 번호
	private String name; // 회사명
	private int income2022; // 2022년도 수익
	private int income2023; // 2023년도 수익

	//1.생성자 생성
	public Company() {

	}
//2.생성자 지정
	public Company(String ssn, String name, int income2022, int income2023) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.income2022 = income2022;
		this.income2023 = income2023;
	}

	//생성자 get,set 설정(설정하고,가져오고)
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIncome2022() {
		return income2022;
	}

	public void setIncome2022(int income2022) {
		this.income2022 = income2022;
	}

	public int getIncome2023() {
		return income2023;
	}

	public void setIncome2023(int income2023) {
		this.income2023 = income2023;
	}

	//해당데이터들을 문자열로 나열
	@Override
	public String toString() {
		return "Company [ssn=" + ssn + ", name=" + name + ", income2022=" + income2022 + ", income2023=" + income2023
				+ "]";
	}

}
