package kr.ac.jejunu.service;

import java.util.List;

import org.springframework.stereotype.Service;

import kr.ac.jejunu.model.Product;


public interface ProductService {

	List<Product> list();

}