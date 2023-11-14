package edu.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.Buffer;

public class BufferdTest {
public static void main(String[] args) {
	InputStream is= null;
	OutputStream os= null;
	InputStreamReader isr=null;
	OutputStreamWriter osw =null;
	BufferedReader br= null;
	BufferedWriter bw=null;
	try {
		br= new BufferedReader(
					new InputStreamReader(
								new FileInputStream("c:/data/연어.jpg")
										)
								);
		
	
		bw = new BufferedWriter(
						new OutputStreamWriter(
								new FileOutputStream("c:/data/연어.jpg")
								)
					);
		
		
		
	} catch (Exception ex) {
	ex.printStackTrace();
	}
}
}
