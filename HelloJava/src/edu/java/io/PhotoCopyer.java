package edu.java.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
//사진 파일 입력
public class PhotoCopyer {

	public static void main(String[] args) {

		InputStream is = null;
		OutputStream os= null;
		
//		"c:/data/연어.JPG"
		try {
			is = new FileInputStream("C:/data/kings.zip");
			os=new FileOutputStream("C:/data/man.zip");
//			버퍼란 데이터를 모아놓았다 한번에! 사진을 데이터를 저장할공간
			byte[] buffer = new byte[1024];
				long startTime =System.currentTimeMillis();
			while (true) {
				int readByteNum = is.read(buffer);
				if (readByteNum == -1) break;
				os.write(buffer);
			}
			long endTime =System.currentTimeMillis();
			System.out.println(endTime-startTime);
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				is.close();
				os.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}

}
