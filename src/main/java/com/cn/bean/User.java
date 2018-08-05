package com.cn.bean;

import java.io.Serializable;

/**
 * @类名称： User
 * @类描述： 
 * @创建人： 1603254
 * @创建时间： 2016-12-2 上午11:08:37
 *
 * @修改人： 1603254
 * @操作时间： 2016-12-2 上午11:08:37
 * @操作原因： 
 * 
 */
public class User  implements Serializable{

	/**  
	 * serialVersionUID:TODO（用一句话描述这个变量表示什么）  
	 */
	private static final long serialVersionUID = -6329429797618068853L;
	
	
	private String id;
	private String name;
	
	public User() {}
	
	public User(String id, String name) {
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
}
