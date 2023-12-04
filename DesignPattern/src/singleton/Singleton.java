package singleton;

public class Singleton {

//	자기자신을 가지는것은 문제가 없다...
	private static Singleton sing
		= new Singleton();
//	생성자 다른데서 생성못하게...
	private Singleton() {
		
	}

	public static Singleton getInstance() {
		return sing();
	}

}


