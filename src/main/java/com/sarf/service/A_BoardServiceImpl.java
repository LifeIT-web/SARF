package com.sarf.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.sarf.dao.A_BoardDAO;
import com.sarf.vo.A_BoardVO;
import com.sarf.vo.SearchCriteria;

@Service
public class A_BoardServiceImpl implements A_BoardService {

	@Inject
	private A_BoardDAO dao;
	
	// 게시물 목록 조회
	@Override
	public List<A_BoardVO> list(SearchCriteria scri) throws Exception {
		return dao.list(scri);
	}

	// 게시물 총 갯수
	@Override
	public int listCount(SearchCriteria scri) throws Exception {
		return dao.listCount(scri);
	}

	// 게시글 작성
	@Override
	public void write(A_BoardVO boardVO) throws Exception {
		dao.write(boardVO);
	}

	// 게시물 조회
	@Override
	public A_BoardVO read(int bno) throws Exception {
		dao.updateReadCount(bno); // 조회수 증가
		return dao.read(bno);
	}

	// 게시물 수정
	@Override
	public void update(A_BoardVO boardVO) throws Exception {
		dao.update(boardVO);
	}

	// 게시물 삭제
	@Override
	public void delete(int bno) throws Exception {
		dao.delete(bno);
	}

}
