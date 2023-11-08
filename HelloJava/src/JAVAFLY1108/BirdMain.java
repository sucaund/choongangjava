package JAVAFLY1108;
//상속과 오버로딩

public class BirdMain {
	
	public static void main(String[] args) {
		
		So so = new So("소쩍새","우아한",150);
		Bird1 bird1 = new Bird1("종달새","우아한",150);
		System.out.println(so.flyname);
		String d= "맑아";
		boolean b = true;
		
		so.flying();
		bird1.flying();
		so.action();
		System.out.println(so.noon(d));
		if(so.noon(d)) {
			System.out.println("동일합니다!");
		}
		else {
			System.out.println("불일치합니다.");
		}
	}

}
