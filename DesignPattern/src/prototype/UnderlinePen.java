package prototype;

public class UnderlinePen implements Product{

	Product ulchar;
	
	private void use(String string) {
		System.out.println("UnderlinePen");
	}
	
	public Product createClone () {
		return ulchar;
	}
		

}
