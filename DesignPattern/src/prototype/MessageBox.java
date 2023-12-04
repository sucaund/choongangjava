package prototype;

public class MessageBox implements Product,Cloneable {

	private String str;
	
	public MessageBox(String str) {
		this.str = str ;
	}
	
	@Override
	public Object createClone() throws CloneNotSupportedException {
		// TODO 자동 생성된 메소드 스텁
		return this.clone();
	}
	
	@Override
	public void use() {
		System.out.println(str);
	}
	
}
