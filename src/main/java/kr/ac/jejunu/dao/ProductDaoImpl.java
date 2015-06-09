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
		return sqlSession.<Product> selectList("findAll");
	}

}