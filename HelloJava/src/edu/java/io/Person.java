package edu.java.io;

import java.io.Serializable;

public class Person implements Serializable{

//	네트워크상의 식별자
	public static final long SerializableUID
		=329476789573159L;
	
	private String ssn;
	private String name;
	private int age;
	
	
	public Person(String ssn, String name, int age) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.age = age;
	}
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [ssn=" + ssn + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}
