package kr.ac.jejunu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.jejunu.dao.ProductDao;
import kr.ac.jejunu.model.Product;

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

}
