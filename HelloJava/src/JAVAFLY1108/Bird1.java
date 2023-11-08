package JAVAFLY1108;
//상속과 오버로딩
public class Bird1 {

	String flyname;
	String action;
	int wing;
	
	Bird1(String flyname,String action,int wing){
		this.flyname=flyname;
		this.action=action;
		this.wing=wing;
	}
	
	public void flying() {
		System.out.println(flyname+"날아요");
	}
	

		
	}







