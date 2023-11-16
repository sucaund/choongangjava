package edu.java.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.xml.sax.InputSource;

public class WebPageCrawler {
public static void main(String[] args) {
	
	URL url= null;
	URLConnection urlConn =null;
	BufferedReader br =null;
	
	
	try {
//		url생성
		url = new URL ("http://www.google.com");
//		url연결
		urlConn = url.openConnection();
		
		br=new BufferedReader(
				new InputStreamReader(
						urlConn.getInputStream()
						)
				);
		String readedLine =null;
		while ((readedLine=br.readLine())!=null) {
			System.out.println(readedLine);
		}
		
	} catch (IOException ea) {
		// TODO: handle exception
	}
}//main
}
