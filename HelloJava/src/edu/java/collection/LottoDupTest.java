package edu.java.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.naming.spi.DirStateFactory.Result;

public class LottoDupTest {



	
	public static void main(String[] args) {
		Object noDup7num=noDup();
		System.out.println(noDup7num);
	}

	static <Integer> Object noDup() {
//		컬렉션 관련 코드
Set<Integer> no= new HashSet<Integer>();

for(int i=1;i<=7;i++) {
	int lott=(int) (Math.random()*45)+1;
	no.add=((Int) lott);
}

return noDup();
	}

	
	
}
