package com.sarf.dao;

import java.util.List;



import com.sarf.vo.Fst_BoardVO;

public interface Fst_BoardDAO {
	// κ²μλ¬? ??±
	public void write(Fst_BoardVO boardVO) throws Exception;

	// κ²μ? λͺ©λ‘ μ‘°ν κ°λ
	public List<Fst_BoardVO> list1() throws Exception;

	// κ²μ? λͺ©λ‘ μ‘°ν κ°μ
	public List<Fst_BoardVO> list2() throws Exception;
	
	// κ²μ? λͺ©λ‘ μ‘°ν κ°λ¨
	public List<Fst_BoardVO> list3() throws Exception;
	
	// κ²μ? λͺ©λ‘ μ‘°ν κ°λΆ
	public List<Fst_BoardVO> list4() throws Exception;
	
	// κ²μ? ?? λ·? μ‘°ν
	public Fst_BoardVO updateview(int bno) throws Exception;
	
	// κ²μλ¬? ?? 
	public void update(Fst_BoardVO boardVO) throws Exception;
		
	// κ²μλ¬? ?­? 
	public void delete(int bno) throws Exception;
}