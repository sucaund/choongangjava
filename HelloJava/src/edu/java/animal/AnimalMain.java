package edu.java.animal;

public class AnimalMain {

//	에이블 타입에 라이언 참조값을!
	public static void main(String[] args) {
		
		Able lion= new Lion();
		Able eagle= new Eagle(); 
		
		
		printname(lion);
		printName(eagle);
		
	}
	
	
	public static void printname(Able able) {
		Animal animal=(Animal)able;
		System.out.println(animal.name);
		animal.run();
		animal.walk();
		Lion anima=(Lion)animal;
		anima.eat();
		
	}
	public static void printName(Able able) {
		Animal animal=(Animal)able;
		System.out.println(animal.name);
		animal.run();
		animal.walk();
		}
}
 