package com.sarf.dao;

import java.util.List;


import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.sarf.vo.Fst_BoardVO;

@Repository	
public class Fst_BoardDAOImpl implements Fst_BoardDAO{
	@Inject
	private SqlSession sqlSession;
	
	String mapper = "fst_boardMapper";
	
	// κ²μ? λͺ©λ‘ μ‘°ν κ°λ
	@Override
	public List<Fst_BoardVO> list1() throws Exception {
		return sqlSession.selectList(mapper + ".listPage1");
	}
	
	// κ²μ? λͺ©λ‘ μ‘°ν κ°μ
	@Override
	public List<Fst_BoardVO> list2() throws Exception {
		return sqlSession.selectList(mapper + ".listPage2");
	}
	
	// κ²μ? λͺ©λ‘ μ‘°ν κ°λ¨
	@Override
	public List<Fst_BoardVO> list3() throws Exception {
		return sqlSession.selectList(mapper + ".listPage3");
	}
	
	// κ²μ? λͺ©λ‘ μ‘°ν κ°λΆ
	@Override
	public List<Fst_BoardVO> list4() throws Exception {
		return sqlSession.selectList(mapper + ".listPage4");
	}
	
	// κ²μ? ?? λ·? μ‘°ν
	@Override
	public Fst_BoardVO updateview(int bno) throws Exception {
		return sqlSession.selectOne(mapper + ".updateview", bno);
	}

	@Override
	public void write(Fst_BoardVO boardVO) throws Exception {
		sqlSession.insert(mapper + ".write", boardVO);
	}

	@Override
	public void update(Fst_BoardVO boardVO) throws Exception {
		sqlSession.update(mapper + ".update", boardVO);
	}

	@Override
	public void delete(int bno) throws Exception {
		sqlSession.delete(mapper + ".delete", bno);
	}
}
