package edu.java.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import edu.java.PERSON;

public class ObjectStream {

	public static void main(String[] args) {
		
	Person preson1 =new Person("111111-111111","홍길동",30);
	
	
	ObjectInputStream ios=null;
	ObjectInputStream ois=null;
	
	ObjectOutputStream oos = null;
	
	String link = "c:/data/person1.obj";	
	
	try {
				oos = new ObjectOutputStream(
					new FileOutputStream(link)
					);
				ios =new ObjectInputStream(
						new FileInputStream(link)
						);
				
				oos.writeObject(preson1);
				oos.flush();	
				
				
				ois = new ObjectInputStream(
								new FileInputStream(link)
								);
				Person person2 =(Person)ois.readObject();
				
				System.out.println(person2);
				}
			 catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			 
			catch (IOException eo1) {
				// TODO Auto-generated catch block
				eo1.printStackTrace();
			} 
	finally {
			try {
				oos.close();
				ois.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
	}
	}//main
}//class
