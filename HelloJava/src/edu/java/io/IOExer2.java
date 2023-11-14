package edu.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;




public class IOExer2 {

	public static void main(String[] args) {

		BufferedWriter bfw = null;
		BufferedReader bfr = null;
		for(int i=1;i<=3;i++) {
		try {
			String filepath= "c:/data/poem"+i+".txt";
			bfw = new BufferedWriter(
					new FileWriter(filepath)
					);
			bfr =new BufferedReader(
						new FileReader(filepath)
					);
			
			while (true) {

				String a = "죽는"+i+" 날까지 한늘을 우러러\n 한점부끄럼이 없기를\n 그 다음 몰라!!!";
				bfw.write(a);
				bfw.flush();
				break;
				
			}
			String line = null;
			while ((line=bfr.readLine())!=null) {
				System.out.println(line);
			}
		} catch (IOException ef) {
			ef.printStackTrace();
		}

		finally {
			try {
				bfw.close();
				bfr.close();
			} catch (IOException efo) {
				efo.printStackTrace();
			}
		}
		}
	}

}
