package kr.ac.jejunu.service;

import java.util.List;

import kr.ac.jejunu.dao.ProductDao;
import kr.ac.jejunu.model.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateServiceImpl implements UpdateService {
	@Autowired
	private ProductDao productDao;

	@Override
	public List<Product> list() {
		return productDao.findAll();
	}
}
