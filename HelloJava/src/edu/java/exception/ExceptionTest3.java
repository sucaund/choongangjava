package edu.java.exception;

public class ExceptionTest3 {

	public static void main(String[] args) {
		try {
		a();
		}
		catch (NumberFormatException nfe) {
			System.out.println("집에 간다고?");
			nfe.printStackTrace();
		}
	}

	public static void a() throws NumberFormatException {
		b();
	}
	public static void b() throws NumberFormatException{
		int i= Integer.parseInt("천");
	}
}
