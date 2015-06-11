package kr.ac.jejunu.dao;

import java.util.List;

import kr.ac.jejunu.model.Product;

import org.springframework.stereotype.Repository;

@Repository
public interface ProductDao {

	List<Product> findAll();

	List<Product> findBoard(Product product);

	void insertProduct(Product product);

	int findMaxBoardNum();

	void updateProduct(Product product);

	void deleteProduct(int boardNum);

}
