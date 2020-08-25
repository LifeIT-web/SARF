package com.sarf.dao;

import java.util.List;

import com.sarf.vo.Oneqna_BoardVO;
import com.sarf.vo.SearchCriteria;

public interface Oneqna_BoardDAO {
	
	// 게시물 작성
	public void write(Oneqna_BoardVO boardVO) throws Exception;

	// 게시판 목록 조회
	public List<Oneqna_BoardVO> list(SearchCriteria scri) throws Exception;
	
	// 게시물 조회
	public Oneqna_BoardVO read(int bno) throws Exception;	

	// 게시글 조회수 증가
	public int updateReadCount(int bno) throws Exception;

	// 게시물 수정	
	public void update(Oneqna_BoardVO boardVO) throws Exception;
		
	// 게시물 삭제
	public void delete(int bno) throws Exception;
	
	// 게시물 총 갯수
	public int listCount(SearchCriteria scri) throws Exception;

}
