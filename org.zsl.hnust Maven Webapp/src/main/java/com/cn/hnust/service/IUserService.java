package com.cn.hnust.service;

import com.cn.hnust.pojo.Person;
import com.cn.hnust.pojo.User;

public interface IUserService {
	public User getUserById(int userId);
	public int insert(User person);
	public int insertSelective(User person);
}
