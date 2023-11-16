package edu.java.net;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.Buffer;

public class WebImageCrawler {

	public static void main(String[] args) {
		
		URL url= null;
		URLConnection urlConn =null;
		BufferedInputStream bis= null;
		BufferedOutputStream bos= null;
	
	
	try {
		url = new URL ("http://www.google.com/imgres?imgurl=https%3A%2F%2Fi.namu.wiki%2Fi%2FAsx9I5r7MFtgpzkhILx3fV9oSY8wdXkct2fmrGU5WnfvWzgEDr7KxWXb-UemK_voVlvcjxkpA8y8te83tmrT2w.webp&tbnid=FgZenIRD3YwQVM&vet=12ahUKEwjss_-7gMiCAxWYe_UHHdOuA9UQMygAegQIARBt..i&imgrefurl=https%3A%2F%2Fnamu.wiki%2Fw%2F%25EB%2585%25B9%25EC%25B0%25A8&docid=_g10te-EGQF9PM&w=1000&h=667&q=%EB%85%B9%EC%B0%A8&ved=2ahUKEwjss_-7gMiCAxWYe_UHHdOuA9UQMygAegQIARBt");
		urlConn = url.openConnection();
		
		bis = new BufferedInputStream(urlConn.getInputStream());
		
		bos =new BufferedOutputStream(
					new FileOutputStream("c:/data/tea.jpg")
		);
		byte[] buffer = new byte[1024];
		int readedBytes=0;
		
		while ((readedBytes=bis.read(buffer))!=-1) {
			bos.write(buffer,0,readedBytes);
			
		}
	}
	catch (IOException ea) {
		// TODO: handle exception
	}
	finally {
	try {
		bis.close();
		bos.close();
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	}
		
			
		
		
		
}
}

