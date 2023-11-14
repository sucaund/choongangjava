package edu.java.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.Buffer;

public class IOExr1 {

	public static void main(String[] args) {

		FileWriter writer = null;
		FileReader reader = null;

		try {
			reader = new FileReader("C:/data/diary.txt");
			writer = new FileWriter("C:/data/diary_copy.txt");
		

			
		String to = "오늘은 추운날이었습니다";
		
		
		writer.write(to);
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
