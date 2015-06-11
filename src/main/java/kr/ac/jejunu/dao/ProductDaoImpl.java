package kr.ac.jejunu.dao;

import java.util.List;

import kr.ac.jejunu.model.Product;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<Product> findAll() {
		return sqlSession.selectList("findAll");
	}

	@Override
	public List<Product> findBoard(Product product) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("findBoard", product);
	}

	@Override
	public void insertProduct(Product product) {
		// TODO Auto-generated method stub
		sqlSession.insert("insertProduct", product);
	}

	@Override
	public int findMaxBoardNum() {
		return sqlSession.selectOne("findMaxBoardNum");
	}

}