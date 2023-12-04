package board;

import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import board.bean.Board;
import board.dao.BoardDao;
import board.service.BoardService;
import board.template.Template;

public abstract class BoardMain extends Iterator
	{
	static BoardService boardService = BoardDao.getInstance();

//서비스를 사용하는 클라이언트역할 ,서비스를 통해 모든할수있는!!!
	public static void main(String[] args) {
//		메인에서는  인터페이스 boardService 만사용 하고있다는걸 유의
//		boardService.deleteBoard(2);
//		Template bt = new BoardMain();
//@기본 정보 저장 변수들만모아놓은 Board타입의board4변수안에 new Board(4, "모두다4", "힘내세요4");
//		생성자를 만들어 새로히 만들어준다!
		Board board4 = new Board(4, "모두다4", "힘내세요4");
//		기존board 클래스의 상위타입인 boardService인터페이스로 .registBoard메소드를 실행시켜준다!
		boardService.registBoard(board4);

//		new를 하면 수정이아닌 메모리에 새로운 객체가 생성되는 꼴이니 이렇게 만든다.
		board4.setTitle("수정된4");
		board4.setContent("수정된 새내용4");
		boardService.updateBoard(board4);
		printMidle();
//		bt.printList();

	}

//	@Override
//	public void printTop() {
//		System.out.println("=======top========");
//	}
//

	public static void printMidle() {
//		람다식
		boardService.getBoardList().forEach(bl -> {
			System.out.println("제목 : " + bl.getTitle());
			System.out.println("내용 : " + bl.getContent());
				});
	}
//
//	@Override
//	public void printBottom() {
//		System.out.println("======bottom=======");
//	}
//
//	@Override
//	public void printList() {
//		printTop();
//		printMidle();
//		printBottom();
//	}

}
