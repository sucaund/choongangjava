package edu.java;

public class ReperencTest {
	static PERSON person1;
	static PERSON person2;

	public static void main(String[] args) {
//		기존 PERSON.class의 person1,person2 를 가져오지만
//		현재ReperencTest.class 안에서 새로 생성해야 적용된다
//		이유는 PERSON.class의 기본값만 가지고올뿐 ReperencTest.class
//		안에서 person1,person2안의 값이 없으므로 새로 생성해야한다.
//		간단하게 말해 객체를 생성해야한다.((new는 생성))
		person1 = new PERSON();
		person2 = new PERSON();

		System.out.println(person1);
		System.out.println(person2);

//		기존 PERSON의 si는 100이지만 ReperencTest.class
//		안에서 새로생성된 person1 = new PERSON();으로인해
//		새로운 값을 적용받을수있다
		person1.si = 2;
		System.out.println(person2.si);

		person1.setName("홍길동");
		person2.setName("곽길동");
		System.out.println(person1.getName());
		System.out.println(person2.getName());
		System.out.println(person1.name.hashCode());
		System.out.println(person2.name.hashCode());
		System.out.println(person1.name==person2.name);
		System.out.println(person1.name.equals(person2.name));
		
	}
}
