package kr.ac.jejunu.dao;

import java.util.List;

import kr.ac.jejunu.model.Product;
import kr.ac.jejunu.model.WishList;

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

	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		sqlSession.update("updateProduct", product);
	}

	@Override
	public void deleteProduct(int boardNum) {
		// TODO Auto-generated method stub
		sqlSession.delete("deleteProduct", boardNum);
	}

	@Override
	public void insertWishList(WishList wishList) {
		// TODO Auto-generated method stub
		sqlSession.insert("insertWishList", wishList);
	}

	@Override
	public List<Product> findWishList(String userId) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("findWishList", userId);
	}

	@Override
	public void deleteWishList(WishList wishList) {
		// TODO Auto-generated method stub
		sqlSession.delete("deleteWishList", wishList);
	}

	@Override
	public int findDuplicateWishList(WishList wishList) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("findDuplicateWishList", wishList);
	}
}