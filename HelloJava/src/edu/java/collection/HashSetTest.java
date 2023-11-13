package edu.java.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;

public class HashSetTest {

	public static void main(String[] args) {
		SortedSet<String> set= (SortedSet<String>) new HashSet<String>();
		
		set.add("자동차");
		set.add("비행기");
		set.add("크루즈선");
		
		set.first();
		


	}

}
