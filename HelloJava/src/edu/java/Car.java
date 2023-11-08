package edu.java;

public class Car {
	String name;
	int tireCount;

	@Override
	public String toString() {
		return this.name+"차량이면 바퀴가"+
				this.tireCount+"개 입니다!";
	}
	
}
