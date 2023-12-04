package template;

public abstract class TemplateModul {

	public void open() {
	}
	public void print() {
	}
	public void close() {
		}
	public void display() {
		open();
		print();
		close();
	}
	
}
