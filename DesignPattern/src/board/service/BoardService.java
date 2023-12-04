package board.service;

import java.util.List;

import board.bean.Board;

//패턴 공부 1.포샤드 (집입점 역할 특정서비스를 위한 진입로,최소한 알아야하는)
//boare서비스의 focade 모든 보드 서비는 이걸통해서
//많이쓰는 이유  다양한 것들이 사용되니깐
public interface BoardService { // 포샤드역할 모든서비스는 여기를 통해서
//게시물보다,일가,목록  등등 진입로 역할

//목록
	public abstract List<Board> getBoardList();

//등록
	public abstract void registBoard(Board board);

//삭제
	public abstract void deleteBoard(int bid);
// 업데이트(수정)
	public abstract void  updateBoard(Board board);
}
