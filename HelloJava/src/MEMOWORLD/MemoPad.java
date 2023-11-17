package MEMOWORLD;

import java.util.Scanner;

//메모를 저장하는 객체
public class MemoPad {

	private int memoLength=0;
	private final Memo[] memoentity;
	private final int MEMO_SIZE =20;


	
public  MemoPad() {
	this.memoentity= new Memo[MEMO_SIZE];
}

//메모전체보기



//메모작성및 용량확인
public void addMemo() {
	System.out.println("");
	if(MEMO_SIZE==memoLength) {
		System.out.println("메모가 가득합니다");
		System.out.println("");
		return;
		}
	
	Scanner scanner =new Scanner(System.in);
	System.out.println("제목을 입력해주세요!");
	String name = scanner.nextLine();

	System.out.println("내용을 입력해주세요!");
	String write = scanner.nextLine();

	memoentity[this.memoLength++]=
			Memo.memo(name,write);
	
	System.out.println();
}
	
}
