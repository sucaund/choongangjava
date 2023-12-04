package abstractfactory;

public abstract class Factory {

	public static Factory factory ;

	private Factory() {
		
	}
	
	public static Factory getFactory() {
		return factory;
	}
	
	public abstract Link createLink();
	
	public abstract String createTray();
	
	public abstract String createPage();
}
