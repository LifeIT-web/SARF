package com.sarf.dao;

import java.util.List;

import com.sarf.vo.BoardVO;

public interface BoardDAO {

	// 게시글 작성
	public void write(BoardVO boardVO) throws Exception;

	//게시판 목록 조회
	public List<BoardVO> list() throws Exception;

}
