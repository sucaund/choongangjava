package iterator;

public class ToysMain {

	public static void main(String[] args) {
//	Iterator를 만드는 상위인터페이스Aggregate 를 타입으로 새로운Toybox를 만든다
		Aggregate aggregate = new Toybox();
//	배열의 검색역할을 하는 iterator 안에 aggregate = new Toybox();를 집어넣은후
//		.iterator 메소드를 실행하면 iterator방식으로 Toybox의 값을 조정한다.
		Iterator iterator = (Iterator)aggregate.iterator();
		while (iterator.hasnext()) {
			System.out.println(iterator.next());
		}
}
	
}
