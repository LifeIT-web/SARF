package com.sarf.dao;

import java.util.List;



import com.sarf.vo.Rst_BoardVO;

public interface Rst_BoardDAO {
	// 게시�? ?��?��
	public void write(Rst_BoardVO boardVO) throws Exception;

	// 게시?�� 목록 조회 강동
	public List<Rst_BoardVO> list1() throws Exception;

	// 게시?�� 목록 조회 강서
	public List<Rst_BoardVO> list2() throws Exception;
	
	// 게시?�� 목록 조회 강남
	public List<Rst_BoardVO> list3() throws Exception;
	
	// 게시?�� 목록 조회 강북
	public List<Rst_BoardVO> list4() throws Exception;
	
	// 게시?�� ?��?���? 조회
	public Rst_BoardVO updateview(int bno) throws Exception;
	
	// 게시�? ?��?��
	public void update(Rst_BoardVO boardVO) throws Exception;
		
	// 게시�? ?��?��
	public void delete(int bno) throws Exception;
}