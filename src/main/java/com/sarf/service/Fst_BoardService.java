package com.sarf.service;

import java.util.List;


import com.sarf.vo.Fst_BoardVO;	

public interface Fst_BoardService {
	// 게시�? ?��?��
	public void write(Fst_BoardVO boardVO) throws Exception;
	
	// 게시�? 목록 조회 강동
	public List<Fst_BoardVO> list1() throws Exception;
	
	// 게시�? 목록 조회 강서
	public List<Fst_BoardVO> list2() throws Exception;
	
	// 게시�? 목록 조회 강남
	public List<Fst_BoardVO> list3() throws Exception;
	
	// 게시�? 목록 조회 강북
	public List<Fst_BoardVO> list4() throws Exception;
	
	// 게시�? ?��?���? 조회 
	public Fst_BoardVO updateview(int bno) throws Exception;
	
	// 게시�? ?��?��
	public void update(Fst_BoardVO boardVO) throws Exception;
		
	// 게시�? ?��?��
	public void delete(int bno) throws Exception;
}