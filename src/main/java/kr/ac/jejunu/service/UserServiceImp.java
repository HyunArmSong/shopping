package kr.ac.jejunu.service;

import java.util.List;

import kr.ac.jejunu.dao.UserDao;
import kr.ac.jejunu.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public List<User> user() {
		return userDao.findAll();
	}

	@Override
	public void insertUser(User user) {
		userDao.insert(user);
	}

	@Override
	public int signUpFindId(User user) {
		return userDao.signUpFindById(user);
	}

	@Override
	public User login(User user) {
		return userDao.loginFindUser(user);
	}
}
