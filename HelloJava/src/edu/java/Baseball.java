package edu.java;

import java.util.Scanner;

public class Baseball {

public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int strike = 0;
		int ball = 0;
		char[] coml = new char[3];
		char[] userl = new char[3];
	

		
		
while (count < 10) {

			System.out.println("숫자를 3자리 입력해주세요!중복숫자 안되용");
			int user = scanner.nextInt();
			int user1 = user / 100;
			int user2 = user / 10 % 10;
			int user3 = user % 10;
			
			System.out.println(user1);	
			
			if (user1 == user2 || user1 == user3 || user2 == user3) {
				return;
			}

			else {
				userl[0] = (char) user1;
				userl[1] = (char) user2;
				userl[2] = (char) user3;
			}

			int com = (int) Math.random() * 3 + 1;
			int com1 = com / 100;
			int com2 = com / 10 % 10;
			int com3 = com % 10;

			if (com1 == com2 || com1 == com3 || com2 == com3) 
			{
				return;
			}

			else {
				coml[0] = (char) com1;
				coml[1] = (char) com2;
				coml[2] = (char) com3;
			}
			if(userl[0]==coml[0]) 
				{strike ++;
				System.out.println(strike+"스트라이크"+ball+"볼");
				}
				else{
				ball ++;
				System.out.println(strike+"스트라이크"+ball+"볼");
			}
			if (userl[1]==coml[1]) {
				strike ++;
				System.out.println(strike+"스트라이크"+ball+"볼");
			}
				else{
				ball ++;
				System.out.println(strike+"스트라이크"+ball+"볼");
			}
			if (userl[2]==coml[2]) {
				strike ++;
				System.out.println(strike+"스트라이크"+ball+"볼");
			}
				else{
				ball ++;
				System.out.println(strike+"스트라이크"+ball+"볼");
			}
			if(strike>=3) {
				System.out.println("오우! 축하드려요! 점집차리세요!");
				System.exit(0);
			}
			count++;
			
			System.out.println("이런 10회동안 점수가 안나왔군요");
			System.out.println("다시 하시겠나요? Y/N");
			while (true) {
				String re = scanner.nextLine();
				if(re.equals("Y")) {
					continue;
				}
				else if (re.equals("N")) {
					System.exit(0);
				}
			}
			
			
			
		} // while 끝
	}
}
