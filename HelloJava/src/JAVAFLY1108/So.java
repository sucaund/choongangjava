package JAVAFLY1108;
//상속과 오버로딩

public class So extends Bird1{

	String eye;
	String eyes;
	So(String flyname, String action, int wing) {
		super(flyname, action, wing);
		eye = "맑아요";
		eyes = "맑아";
		}
	void action() {
		System.out.println("논다");
	}
	public void flying() {
		System.out.println(flyname+"날아보자");
	}
	
	void wings() {
		System.out.println(wing+"회 난다");
	}
	
	public boolean noon(String str) {
		if(str.equals(eye)) {
			System.out.println("sdf");
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	
	

	
	


}
