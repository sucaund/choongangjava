package template;

public class audioTemplate extends TemplateModul{

String string;
	
	public audioTemplate(String string) {
		this.string =string;
	}
	
	@Override
	public void open() {
		System.out.println("라디오를 작동합니다");
		super.open();
	}
	public void print() {
		System.out.println(string);
		super.print();
	}
	@Override
	void close() {
	System.out.println("라디오를 종료합니다/");
	}
}
