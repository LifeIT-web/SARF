package com.sarf.service;

import java.util.List;


import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.sarf.dao.Fst_BoardDAO;
import com.sarf.vo.Fst_BoardVO;

@Service
public class Fst_BoardServiceImpl implements Fst_BoardService {
	@Inject
	private Fst_BoardDAO dao;
	
	// 게시�? 목록 조회 강동
	@Override
	public List<Fst_BoardVO> list1() throws Exception {
		return dao.list1();
	}
	
	// 게시�? 목록 조회 강서
	@Override
	public List<Fst_BoardVO> list2() throws Exception {
		return dao.list2();
	}
	
	// 게시�? 목록 조회 강남
	@Override
	public List<Fst_BoardVO> list3() throws Exception {
		return dao.list3();
	}
	
	// 게시�? 목록 조회 강북
	@Override
	public List<Fst_BoardVO> list4() throws Exception {
		return dao.list4();
	}
	
	// 게시�? ?��?���? 조회
	@Override
	public Fst_BoardVO updateview(int bno) throws Exception {
		return dao.updateview(bno);
	}

	// 게시�? ?��?��
	@Override
	public void write(Fst_BoardVO boardVO) throws Exception {
		dao.write(boardVO);
	}

	// 게시�? ?��?��
	@Override
	public void update(Fst_BoardVO boardVO) throws Exception {
		dao.update(boardVO);
	}

	// 게시�? ?��?��
	@Override
	public void delete(int bno) throws Exception {
		dao.delete(bno);
	}
}