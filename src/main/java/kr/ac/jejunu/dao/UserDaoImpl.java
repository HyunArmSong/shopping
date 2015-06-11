package kr.ac.jejunu.dao;

import java.util.List;

import kr.ac.jejunu.model.User;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDaoImpl implements UserDao {

	@Autowired
	private SqlSession sqlSession;

	public UserDaoImpl() {
		super();
	}

	@Override
	public List<User> findAll() {
		return null;
	}

	@Override
	public void insert(User user) {
		sqlSession.insert("insert", user);
	}

	@Override
	public int signUpFindById(User user) {
		return sqlSession.selectOne("findById", user);
	}

	@Override
	public String loginFindUser(User user) {
		return sqlSession.selectOne("loginFindUser", user);
	}
}
