package com.cn.service;

import com.cn.bean.User;

/**
 * @�����ƣ� UserService
 * @�������� 
 * @�����ˣ� 1603254
 * @����ʱ�䣺 2016-12-2 ����11:09:55
 *
 * @�޸��ˣ� 1603254
 * @����ʱ�䣺 2016-12-2 ����11:09:55
 * @����ԭ�� 
 * 
 */
public interface  UserService {
	
	/**
	 * @��������:  ����id��ѯ����
	 * @���ߣ� 1603254
	 * @���ڣ� 2016-12-2-����11:09:58
	 * @param id
	 * @return 
	 * @�������ͣ� User
	*/
	public User selectByPrimaryKey(Integer id);
	
	/**
	 * @��������:  �������
	 * @���ߣ� 1603254
	 * @���ڣ� 2016-12-2-����11:10:01
	 * @param user 
	 * @�������ͣ� void
	*/
	public void insertSelective(User user);

	/**
	 * @��������:  ����idɾ������
	 * @���ߣ� 1603254
	 * @���ڣ� 2016-12-2-����11:10:04
	 * @param id 
	 * @�������ͣ� void
	*/
	public void deleteByPrimaryKey(Integer id);
}


