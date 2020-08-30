package com.sarf.service;

import java.util.List;



import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.sarf.dao.Rst_BoardDAO;
import com.sarf.vo.Rst_BoardVO;

@Service
public class Rst_BoardServiceImpl implements Rst_BoardService {
	@Inject
	private Rst_BoardDAO dao;
	
	// 게시�? 목록 조회 강동
	@Override
	public List<Rst_BoardVO> list1() throws Exception {
		return dao.list1();
	}
	
	// 게시�? 목록 조회 강서
	@Override
	public List<Rst_BoardVO> list2() throws Exception {
		return dao.list2();
	}
	
	// 게시�? 목록 조회 강남
	@Override
	public List<Rst_BoardVO> list3() throws Exception {
		return dao.list3();
	}
	
	// 게시�? 목록 조회 강북
	@Override
	public List<Rst_BoardVO> list4() throws Exception {
		return dao.list4();
	}
	
	// 게시�? ?��?���? 조회
	@Override
	public Rst_BoardVO updateview(int bno) throws Exception {
		return dao.updateview(bno);
	}

	// 게시�? ?��?��
	@Override
	public void write(Rst_BoardVO boardVO) throws Exception {
		dao.write(boardVO);
	}

	// 게시�? ?��?��
	@Override
	public void update(Rst_BoardVO boardVO) throws Exception {
		dao.update(boardVO);
	}

	// 게시�? ?��?��
	@Override
	public void delete(int bno) throws Exception {
		dao.delete(bno);
	}
}