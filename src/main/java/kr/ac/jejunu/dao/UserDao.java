package kr.ac.jejunu.dao;

import java.util.List;

import kr.ac.jejunu.model.User;

public interface UserDao {

	List<User> findAll();

}
