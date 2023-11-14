package Yee;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class file11 {

	public static void main(String[] args) throws IOException {
		File file1= new File("C:/data/file1.txt");
		File file2= new File("C:/data/file2.txt");
		File file3= new File("C:/data/file3.txt");
		File file4= new File("C:/data/file4.txt");

		if(file1.exists()==false) {file1.createNewFile();  }
		if(file2.exists()==false) {file2.createNewFile();  }
		if(file3.exists()==false) {file3.createNewFile();  }
		if(file4.exists()==false) {file4.createNewFile();  }
		
		File temp= new File("C:/data");
		File[] contents = temp.listFiles();
		
		System.out.println("시간\t\t\t 형태\t\t 크기\t 이름");
		System.out.println("===============================================");
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for (File file : contents) {
			System.out.println(sdf.format(new Date(file.lastModified())));
			if (file.isDirectory()) {
				System.out.println("\t<DIR>\t\t\t"+file.getName());
			}
			else {
				System.out.println("\t\t\t"+file.length()+"\t"+file.getName());
			}
			System.out.println();
			
			}
		}
	}
