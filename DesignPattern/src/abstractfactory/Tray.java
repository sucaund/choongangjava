package abstractfactory;

public abstract class Tray extends Item{

	private String tray;
	
	public String getTray() {
		return tray;
	}
	
	@Override
	public abstract String makeHTML();
	
}
