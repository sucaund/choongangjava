package edu.java.animal;

//abstract를 클래스앞에 붙여서 추상클래스 선언
//추상클래스는 메소드 오바이딩 즉구현 안해도되니깐!
public abstract class Animal	implements Walkable,Runnerable,Flyable,Soundable {

	String sort;
	String name;
	@Override
	public void walk() {
		System.out.println("걷는다!");
		// TODO Auto-generated method stub

	}	@Override
	public void run() {
		System.out.println("뛴다!");
		// TODO Auto-generated method stub

	}	@Override
	public void fly() {
		System.out.println("난다!");
		// TODO Auto-generated method stub

	}	@Override
	public void sound() {
		System.out.println("소리낸다!");
		// TODO Auto-generated method stub

	}
}

