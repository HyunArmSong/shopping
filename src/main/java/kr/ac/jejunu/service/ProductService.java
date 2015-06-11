package kr.ac.jejunu.service;

import java.util.List;

import org.springframework.stereotype.Service;

import kr.ac.jejunu.model.Product;


public interface ProductService {

	List<Product> list();

	List<Product> boardView(Product product);

	void insertProduct(Product product);

	int getBoarderNum();

	void updateProduct(Product product);
}