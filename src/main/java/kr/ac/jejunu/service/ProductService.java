package kr.ac.jejunu.service;

import java.util.List;

import org.springframework.stereotype.Service;

import kr.ac.jejunu.model.Product;
import kr.ac.jejunu.model.WishList;


public interface ProductService {

	List<Product> list();

	List<Product> boardView(Product product);

	void insertProduct(Product product);

	int getBoarderNum();

	void updateProduct(Product product);

	void deleteProduct(int boardNum);

	void insertWishList(WishList wishList);

	List<Product> wishList(String userId);

	void deleteWishList(WishList wishList);

	int findDuplicateWishList(WishList wishList);

}