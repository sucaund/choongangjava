package edu.java.exception;

public class AgeUnder19Main {

	public static void main(String[] args) {
		
		int age = 51;
		if (age < 19) {
			try {
				// 하단 throws와 햇갈리지말자 그것은 넘기다 이것은 호출!
//				AgeUnder19Exception클래스 객체로보낸후
//				캐치에서 잡은 AgeUnder19Exception ae에서
//				ae를 프린트하면 해당 개체값을 소환!
				throw new AgeUnder19Exception();
			} catch (AgeUnder19Exception ae) {
				System.out.println(ae);
			}
		} else if (age > 50) {
			try {
				throw new AgeOver50Exception();
			} catch (AgeOver50Exception ae) {
				System.out.println(ae.wa());
			}
		}
	}
}
