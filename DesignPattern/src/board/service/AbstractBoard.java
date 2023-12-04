package board.service;

import java.util.List;


import board.bean.Board;

// 보드서비스를 구현한 추상 클래스
//기본구현만 해놓는...
public abstract class AbstractBoard implements BoardService{

	
	@Override
	public List<Board> getBoardList() {
		return null;
	}
	
	@Override
	public void registBoard(Board Board) {
		
	}
	
	@Override
	public void deleteBoard(int bid) {
		
	}
	
	@Override
	public void updateBoard(int bid) {
		
	}
}
