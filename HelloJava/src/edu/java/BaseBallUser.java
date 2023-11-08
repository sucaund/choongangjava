//package edu.java;
//import java.util.Scanner;
//
//public class BaseBallUser {
//	
//	Scanner scanner = new Scanner(System.in);
//	int user = scanner.nextInt();
//	int user1 = user / 100;
//	int user2 = user / 10 % 10;
//	int user3 = user % 10;
//	char[] userl = new char[3];
//	
//	
//	//생성자는 기본데이터를 초기화 하는 역할을 한다.
//	//그렇기에 하단 BaseBallUser(파라미터) 안에는 초기화할 데이터 들을 넣는다
//	//char(캐릭터)와 char[] 캐릭터 배열은 다르다 유의하자!
//	BaseBallUser(int user1,int user2,int user3,char[] userl) 
//	{
//		this.user1=user1;
//		this.user2=user2;
//		this.user3=user3;
//		this.userl=userl;
//		}
////	BaseBallUser() {
////	}
//	
//	
//	
//	
//	boolean usercon() {
//		
//		
//		if (user1 == user2 || user1 == user3 || user2 == user3) {
//			System.out.println("같은 중복수 입니다");
//			return false;
//		}
//		
//		else {
//			userl[0] = (char) user1;
//			userl[1] = (char) user2;
//			userl[2] = (char) user3;
//			return true;
//		}
//		
//	}
//	
//	
//
//}
