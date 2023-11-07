package edu.java;

public class TypeCastingMain {
public static void main(String[] args) {
	

		Parent parent1 =new Parent();
		Child child1=new Child();
		
		System.out.println(parent1.getName());
		System.out.println(child1.getName());
//	upcasting (상위형변환,묵시적형변환,상위타입>하위타입)
//parent2 는 parent 타입 가지고있는는 참조는 Child 참조
		Parent parent2=new Child();
		System.out.println(parent2.getName());
//	downcasting(하위형변환,명시적 형변환,상위타입>하위타입)
//		child2는 child 타입 가지고있는 참조는 child참조
		
		Child child2=(Child) parent2;
		System.out.println(child2.getName());
		Parent parent3=child2;
}
}
