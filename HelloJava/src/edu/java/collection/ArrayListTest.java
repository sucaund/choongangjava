package edu.java.collection;

import java.util.ArrayList;
import java.util.List;
public class ArrayListTest {

	public static void main(String[] args) {
	
		List<String>al
			=new ArrayList<String>();
		
		al.add("사과");
		al.add("딸기");
		al.add("바나나");
		al.add(2,"두리안");
		al.add(3,"사과");
		al.add(1,"치즈열매");

System.out.println(al);		
	
String ba=al.get(0);
System.out.println(ba);
	}

}
