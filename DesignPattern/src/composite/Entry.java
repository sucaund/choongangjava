package composite;

public abstract class Entry {

	Directory directory;
	
	abstract String getName();
	abstract long getSize();
	abstract void PrintList();
	
	
}
