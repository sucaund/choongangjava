package Yee;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {

//// 파일에	문자를 쓰는것
//	FileWriter();
//// 파일을 읽는ㄱ서
//	Filereader

	public static void main(String[] args) {
		File f = new File("c:/memopad/test.txt");
		if(!f.exists()) {
		try {
		f.createNewFile();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		}
		FileWriter fw=null;
			try {
				fw=new FileWriter(f);
				fw.write("안녕하세요!");
			} catch (IOException ioe) {
			ioe.printStackTrace();
			}finally {
				try {
					fw.close();
			}catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	
}
}