package com.sarf.service;

import java.util.List;



import com.sarf.vo.Rst_BoardVO;	

public interface Rst_BoardService {
	// κ²μλ¬? ??±
	public void write(Rst_BoardVO boardVO) throws Exception;
	
	// κ²μλ¬? λͺ©λ‘ μ‘°ν κ°λ
	public List<Rst_BoardVO> list1() throws Exception;
	
	// κ²μλ¬? λͺ©λ‘ μ‘°ν κ°μ
	public List<Rst_BoardVO> list2() throws Exception;
	
	// κ²μλ¬? λͺ©λ‘ μ‘°ν κ°λ¨
	public List<Rst_BoardVO> list3() throws Exception;
	
	// κ²μλ¬? λͺ©λ‘ μ‘°ν κ°λΆ
	public List<Rst_BoardVO> list4() throws Exception;
	
	// κ²μλ¬? ?? λ·? μ‘°ν 
	public Rst_BoardVO updateview(int bno) throws Exception;
	
	// κ²μλ¬? ?? 
	public void update(Rst_BoardVO boardVO) throws Exception;
		
	// κ²μλ¬? ?­? 
	public void delete(int bno) throws Exception;
}