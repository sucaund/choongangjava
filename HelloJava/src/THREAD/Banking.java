package THREAD;

public class Banking {
public static void main(String[] args) {
	
	Account account = new Account(10000);
	
	Person person1 =new Person("홍길동",account);
	Person person2 =new Person("강감찬",account);

Person1Thread person1Therad
=new Person1Thread(person1);

Person2Thread person2Therad
=new Person2Thread(person2);

person1Therad.start();
person2Therad.start();

}

	
}
