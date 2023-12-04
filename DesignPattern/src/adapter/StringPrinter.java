package adapter;

public class StringPrinter {
	
	private String name ;
	private int age;
	
	public StringPrinter(String string, int in) {
		this.name = string;
		this.age = in;
	}
	
	void printInfo() {
		System.out.println("이름은"+ name +"이고 나이는"+ age);
	}

	

}
