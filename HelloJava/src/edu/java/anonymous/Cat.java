package edu.java.anonymous;

public class Cat implements Soundable {

	String sound;
	String name;
	Cat(){
		
	}
	Cat(String name,String sound){
		this.name=name;
		this.sound=sound;
	}

	@Override
	public String sound() {
			return "냐옹 (0ω0)";

	}
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return name;
	}

}