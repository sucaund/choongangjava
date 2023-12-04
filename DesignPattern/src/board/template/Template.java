package board.template;



public abstract class Template implements BoardTemplate {

	
	public static void printTop();
	public static void printMidle();
	public static void printBottom();
	
	public static void printList() {
		printTop();
		printMidle();
		printBottom();
	};
}
