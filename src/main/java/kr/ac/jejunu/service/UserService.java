package kr.ac.jejunu.service;

import java.util.List;

import kr.ac.jejunu.model.User;

public interface UserService {

	List<User> user();

	void insertUser(User user);

	int signUpFindId(User user);

	String login(User user);
}
