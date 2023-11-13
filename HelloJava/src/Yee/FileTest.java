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
//	파일을 추상화
		File f = new File("c:/memopad/test.txt");
//		파일존재 확인 !부정이니깐 만약 없으면...
		if(!f.exists()) {
//		없으면 새로만들어라
			try {
		f.createNewFile();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		}
//		문자단위에 파일에 쓰는애
		FileWriter fw=null;
			try {
				fw=new FileWriter(f);
				fw.write("안녕하세요!");
			} catch (IOException ioe) {
			ioe.printStackTrace();
			}finally {
				try {
//					파일을 열었으면 닫는건 필수!
					fw.close();
			}catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	
}
}