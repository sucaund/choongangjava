package edu.java.anonymous;

public class Dog implements Soundable {
	String sound;
	String name;
	Dog(){
		
	}
	Dog(String name,String sound){
		this.name=name;
		this.sound=sound;
	}

	@Override
	public String sound() {
			return "멍멍 (0ω0)";

	}
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return name;
	}

}
