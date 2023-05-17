package com.ssafy.user.model.service;

import java.sql.SQLException;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.user.model.dto.User;
import com.ssafy.user.model.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {
	
	private UserMapper userMapper;
	
	@Autowired
	public UserServiceImpl(UserMapper userMapper) {
		super();
		this.userMapper = userMapper;
	}

	@Override
	public int insert(User user) throws SQLException {
		return userMapper.insert(user);
	}

	@Override
	public User select(User user) throws SQLException {
		return userMapper.select(user);
	}

	@Override
	public User selectId(String id) throws SQLException {
		return userMapper.selectId(id);
	}

	@Override
	public User selectPwd(String id, String name) throws SQLException {
		return userMapper.selectPwd(id, name);
	}

	@Override
	public int delete(String id) throws SQLException {
		return userMapper.delete(id);
	}

	@Override
	public int update(User user) throws SQLException {
		return userMapper.update(user);
	}

	@Override
	public ArrayList<User> searchAll() throws SQLException {
		return userMapper.searchAll();
	}


}