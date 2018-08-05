package com.cn.service;

import com.cn.bean.User;

/**
 * @类名称： UserService
 * @类描述： 
 * @创建人： 1603254
 * @创建时间： 2016-12-2 上午11:09:55
 *
 * @修改人： 1603254
 * @操作时间： 2016-12-2 上午11:09:55
 * @操作原因： 
 * 
 */
public interface  UserService {
	
	/**
	 * @方法描述:  根据id查询对象
	 * @作者： 1603254
	 * @日期： 2016-12-2-上午11:09:58
	 * @param id
	 * @return 
	 * @返回类型： User
	*/
	public User selectByPrimaryKey(Integer id);
	
	/**
	 * @方法描述:  插入对象
	 * @作者： 1603254
	 * @日期： 2016-12-2-上午11:10:01
	 * @param user 
	 * @返回类型： void
	*/
	public void insertSelective(User user);

	/**
	 * @方法描述:  根据id删除对象
	 * @作者： 1603254
	 * @日期： 2016-12-2-上午11:10:04
	 * @param id 
	 * @返回类型： void
	*/
	public void deleteByPrimaryKey(Integer id);
}


