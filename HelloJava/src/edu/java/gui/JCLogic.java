package edu.java.gui;

import java.awt.Button;

import javax.swing.JButton;

public class JCLogic {


	String content="";
	
	int add(String content) {
		String prev = content.substring(0,content.indexOf("+"));
		String next = content.substring(content.indexOf("+"));
		return Integer.parseInt(prev)+ Integer.parseInt(next);
	}
	
}
