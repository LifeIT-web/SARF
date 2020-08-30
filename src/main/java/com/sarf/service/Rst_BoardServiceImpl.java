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
	
	// κ²μλ¬? λͺ©λ‘ μ‘°ν κ°λ
	@Override
	public List<Rst_BoardVO> list1() throws Exception {
		return dao.list1();
	}
	
	// κ²μλ¬? λͺ©λ‘ μ‘°ν κ°μ
	@Override
	public List<Rst_BoardVO> list2() throws Exception {
		return dao.list2();
	}
	
	// κ²μλ¬? λͺ©λ‘ μ‘°ν κ°λ¨
	@Override
	public List<Rst_BoardVO> list3() throws Exception {
		return dao.list3();
	}
	
	// κ²μλ¬? λͺ©λ‘ μ‘°ν κ°λΆ
	@Override
	public List<Rst_BoardVO> list4() throws Exception {
		return dao.list4();
	}
	
	// κ²μλ¬? ?? λ·? μ‘°ν
	@Override
	public Rst_BoardVO updateview(int bno) throws Exception {
		return dao.updateview(bno);
	}

	// κ²μκΈ? ??±
	@Override
	public void write(Rst_BoardVO boardVO) throws Exception {
		dao.write(boardVO);
	}

	// κ²μλ¬? ?? 
	@Override
	public void update(Rst_BoardVO boardVO) throws Exception {
		dao.update(boardVO);
	}

	// κ²μλ¬? ?­? 
	@Override
	public void delete(int bno) throws Exception {
		dao.delete(bno);
	}
}