package template;

public class TvTemplate extends TemplateModul {
	
	String string;
	
	public TvTemplate(String string) {
		this.string =string;
	}
	@Override
	public void open() {
		System.out.println("tv를 작동합니다");
		super.open();
	}
	public void print() {
		System.out.println(string);
		super.print();
	}
	@Override
	void close() {
	System.out.println("tv를 종료합니다/");
	}
}
