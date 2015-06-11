package kr.ac.jejunu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.jejunu.dao.ProductDao;
import kr.ac.jejunu.model.Product;
import kr.ac.jejunu.model.WishList;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao productDao;

	@Override
	public List<Product> list() {
		return productDao.findAll();
	}

	@Override
	public List<Product> boardView(Product product) {
		// TODO Auto-generated method stub
		return productDao.findBoard(product);
	}

	@Override
	public void insertProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.insertProduct(product);
	}

	@Override
	public int getBoarderNum() {
		// TODO Auto-generated method stub
		return productDao.findMaxBoardNum() + 1;
	}

	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.updateProduct(product);
	}

	@Override
	public void deleteProduct(int boardNum) {
		// TODO Auto-generated method stub
		productDao.deleteProduct(boardNum);
	}

	@Override
	public void insertWishList(WishList wishList) {
		// TODO Auto-generated method stub
		productDao.insertWishList(wishList);
	}

	@Override
	public List<Product> wishList(String userId) {
		// TODO Auto-generated method stub
		return productDao.findWishList(userId);
	}

}
