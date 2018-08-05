package com.cn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.cn.bean.User;
import com.cn.dao.UserDao;

/**
 * @�����ƣ� UserServiceImpl
 * @�������� 
 * @�����ˣ� 1603254
 * @����ʱ�䣺 2016-12-2 ����11:10:33
 *
 * @�޸��ˣ� 1603254
 * @����ʱ�䣺 2016-12-2 ����11:10:33
 * @����ԭ�� 
 * 
 */
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;

	@Cacheable(value="common",key="'id_'+#id")
	public User selectByPrimaryKey(Integer id) {
		System.out.println("======================");
		System.out.println("======================");
		System.out.println("======================");
		return userDao.selectByPrimaryKey(id);
	}
	
	@CachePut(value="common",key="#user.getUserName()")
	public void insertSelective(User user) {
//		userDao.insertSelective(user);
		System.out.println("########################");
		System.out.println("########################");
		System.out.println("########################");
	}

	@CacheEvict(value="common",key="'id_'+#id")
	public void deleteByPrimaryKey(Integer id) {
//		userDao.deleteByPrimaryKey(id);
		System.out.println("******************************");
		System.out.println("******************************");
		System.out.println("******************************");
	}
}