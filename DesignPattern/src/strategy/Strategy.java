package strategy;

public interface Strategy {

	public abstract Hand nexthand();
	public abstract void study(boolean ss);
}
