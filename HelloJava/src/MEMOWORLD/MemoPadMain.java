package MEMOWORLD;

import java.util.Scanner;

public class MemoPadMain {
public static void main(String[] args) {
	System.out.print("메모패드 기능을 선택해주세요(L/R/W/D/Q) :");
	Scanner scan =new Scanner(System.in);
	String select;
	select = scan.nextLine();
	
	switch(select) {
	case"L":System.out.println("리스트를 불러오겟습니다");
	break;
	case"R":System.out.println("읽기를 진행하겟습니다 몇번을 불러올까요?");
	break;
	case"W": System.out.println("메모를 입력하겠습니다.");
	break;
	case"D": System.out.println("글자를 삭제 하겠습니다 몇번을 삭제할까요?");
	break;
	case"Q": System.out.println("메모를 종료합니다 감사합니다");
	break;
	}

}
}
