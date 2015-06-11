package kr.ac.jejunu.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.ac.jejunu.model.User;

@Repository
public interface UserDao {

	List<User> findAll();

	void insert(User user);

	int signUpFindById(User user);

	User loginFindUser(User user);

}
