package edu.java.anonymous;

public class SoundableMain {

	public static void main(String[] args) {
		printsound(new Dog("강아지","멍멍"));
		printsound(new Cat("고양이","야옹"));
		
	}

	public static void printsound(Soundable soundable) {
		System.out.println(soundable.name()+soundable.sound()+" "+"소리를 냅니다!");
		
			
	
	}

}
