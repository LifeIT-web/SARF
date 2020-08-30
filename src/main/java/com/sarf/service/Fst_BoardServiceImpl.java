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
	
	// κ²μλ¬? λͺ©λ‘ μ‘°ν κ°λ
	@Override
	public List<Fst_BoardVO> list1() throws Exception {
		return dao.list1();
	}
	
	// κ²μλ¬? λͺ©λ‘ μ‘°ν κ°μ
	@Override
	public List<Fst_BoardVO> list2() throws Exception {
		return dao.list2();
	}
	
	// κ²μλ¬? λͺ©λ‘ μ‘°ν κ°λ¨
	@Override
	public List<Fst_BoardVO> list3() throws Exception {
		return dao.list3();
	}
	
	// κ²μλ¬? λͺ©λ‘ μ‘°ν κ°λΆ
	@Override
	public List<Fst_BoardVO> list4() throws Exception {
		return dao.list4();
	}
	
	// κ²μλ¬? ?? λ·? μ‘°ν
	@Override
	public Fst_BoardVO updateview(int bno) throws Exception {
		return dao.updateview(bno);
	}

	// κ²μκΈ? ??±
	@Override
	public void write(Fst_BoardVO boardVO) throws Exception {
		dao.write(boardVO);
	}

	// κ²μλ¬? ?? 
	@Override
	public void update(Fst_BoardVO boardVO) throws Exception {
		dao.update(boardVO);
	}

	// κ²μλ¬? ?­? 
	@Override
	public void delete(int bno) throws Exception {
		dao.delete(bno);
	}
}