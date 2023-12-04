package board.dao;

import java.util.ArrayList;
import java.util.List;
import board.bean.Board;
import board.iterator.BidAggregate;
import board.iterator.Iterator;
import board.service.AbstractBoard;
import board.service.BoardService;

//여기서 부턴 구현이 가능하다.
public class BoardDao extends AbstractBoard{

	private List<Board> boardList;

//싱글톤 BoardDao객체가 하나만 필요하므로...
	private static BoardDao boardDao = new BoardDao();

	private BoardDao() {
		boardList = new ArrayList<Board>();
		/*
		registBoard(new Board(1, "제목1", "내용1"));
		registBoard(new Board(2, "제목2", "내용2"));
		registBoard(new Board(3, "제목3", "내용3"));
		 */
		
//		part1. Iterator 를 사용한 구현
		Iterator it = (Iterator)new BidAggregate().iterator();
		
		while (it.hasnext()) {
			int itNext = (Integer)it.next();
			registBoard(new Board(itNext,"제목"+ itNext,"내용"+ itNext));
		}
	}

	public static BoardDao getInstance() {
		return boardDao;
	}

//	========================
	@Override
//	반환자 List<Board>타입의 boardList를 넣어준다
	public List<Board> getBoardList() {
		return boardList;
	}

	@Override
//	Board타입에 Board(int bid ,String title, String content)의 조건을 맞춰 생성한 변수를
//	리스트에 list 메소드.add 를 사용하여boardList에 추가한다.
	public void registBoard(Board Board) {
		boardList.add(Board);
	}

	@Override
//	보드삭제--특정보드만 선택하여 삭제해야하므로 기존 Board들을 구분하기 위해 생성한 int bid만을 대입하여
//해당 id를 가지고있는 특정 보드만 삭제하는
	public void deleteBoard(int bid) {
		for (Board board : boardList) {
			if (board.getBid() == bid) {
				boardList.remove(board);
			}
		}

		boardList.remove(boardDao);
	}
	 @Override
	public void updateBoard(Board board) {
		 for (Board brd : boardList) {
			 if (brd.getBid() == board.getBid()) {
				brd.setTitle(board.getTitle());
				brd.setContent(board.getContent());
			 } 
		 }
		
	}
	
}
