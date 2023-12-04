package iterator;

public interface Iterator {
//다음요소가 존재하는지 참거짓으로 알아보며 그에따른 조치는  iterator를 상속받은 클래스에서 살을 붙힌다
	public abstract boolean hasnext();
	
	public abstract Object next();
	
}
