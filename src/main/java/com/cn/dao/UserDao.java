package com.cn.dao;

import com.cn.bean.User;


/**
 * @类名称： UserDao
 * @类描述： 
 * @创建人： 1603254
 * @创建时间： 2016-12-2 上午11:08:47
 *
 * @修改人： 1603254
 * @操作时间： 2016-12-2 上午11:08:47
 * @操作原因： 
 * 
 */
public interface UserDao {
	/**
	 * @方法描述: 根据主键查询对象
	 * @作者： 1603254
	 * @日期： 2016-12-2-上午11:08:50
	 * @param id
	 * @return 
	 * @返回类型： User
	*/
	public User selectByPrimaryKey(Integer id); 
	/**
	 * @方法描述:  插入对象
	 * @作者： 1603254
	 * @日期： 2016-12-2-上午11:08:53
	 * @param user 
	 * @返回类型： void
	*/
	public void insertSelective(User user);
	/**
	 * @方法描述: 根据主键删除对象
	 * @作者： 1603254
	 * @日期： 2016-12-2-上午11:08:56
	 * @param id 
	 * @返回类型： void
	*/
	public void deleteByPrimaryKey(Integer id);
}
