package edu.java;

import java.util.Scanner;

public class BaseBallMain {

	int count;
	int strike;
	int ball;

	public static void main(String[] args) {
		BaseBallMain game = new BaseBallMain();
		game.startgame();
	}

//	게임시작
	public void startgame() {

		Scanner scanner=new Scanner(System.in);
		//유저 입력값을 3자리수로 만들고 각 자릿수별로 나누어 배열에 집어넣은 클래스 생성▼
		BaseBallUser user = new BaseBallUser();
		//컴퓨터 입력값을 3자리수로 만들고 각 자릿수별로 나누어 배열에 집어넣은 클래스 생성▼
		BaseBallCom com = new BaseBallCom();
		
		while (count<10) {
			//게임시작시 유저입력값을 적용받아 BaseBallUser생성자에 적용하려함▼
			System.out.println("세자리숫자를 입력하세요!(중복은 안됩니다)");
			int userInput = scanner.nextInt();
			user.setUserInput(userInput);
			
			for(int i=0;i<=3;i++) {
				if(userl[i]==coml[i])
				strike++;
				else if (userl[i]!=coml[i]) {
					ball++;
				}
			}
			
			count++;
		System.out.println(strike+"스트라이크,"+ball+"볼!");
		}
		
		while (true) {
			
		
		if(count<10) {
			System.out.println("졌어요 :(");
			System.out.println("게임을 다시 시작하시겠습니까? y/n");
			
			String re = scanner.nextLine();
			if (re.equals("Y")) {
				return startgame;
			} else if (re.equals("N")) {
				System.exit(0);
		}
		
		
		if(strike>3) {
			System.out.println("이겼어요:)");
		}
		}
	
	}
	

}
