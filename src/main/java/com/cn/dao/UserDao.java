package com.cn.dao;

import com.cn.bean.User;


/**
 * @�����ƣ� UserDao
 * @�������� 
 * @�����ˣ� 1603254
 * @����ʱ�䣺 2016-12-2 ����11:08:47
 *
 * @�޸��ˣ� 1603254
 * @����ʱ�䣺 2016-12-2 ����11:08:47
 * @����ԭ�� 
 * 
 */
public interface UserDao {
	/**
	 * @��������: ����������ѯ����
	 * @���ߣ� 1603254
	 * @���ڣ� 2016-12-2-����11:08:50
	 * @param id
	 * @return 
	 * @�������ͣ� User
	*/
	public User selectByPrimaryKey(Integer id); 
	/**
	 * @��������:  �������
	 * @���ߣ� 1603254
	 * @���ڣ� 2016-12-2-����11:08:53
	 * @param user 
	 * @�������ͣ� void
	*/
	public void insertSelective(User user);
	/**
	 * @��������: ��������ɾ������
	 * @���ߣ� 1603254
	 * @���ڣ� 2016-12-2-����11:08:56
	 * @param id 
	 * @�������ͣ� void
	*/
	public void deleteByPrimaryKey(Integer id);
}
