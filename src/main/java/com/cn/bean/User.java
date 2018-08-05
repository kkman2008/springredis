package com.cn.bean;

import java.io.Serializable;

/**
 * @�����ƣ� User
 * @�������� 
 * @�����ˣ� 1603254
 * @����ʱ�䣺 2016-12-2 ����11:08:37
 *
 * @�޸��ˣ� 1603254
 * @����ʱ�䣺 2016-12-2 ����11:08:37
 * @����ԭ�� 
 * 
 */
public class User  implements Serializable{

	/**  
	 * serialVersionUID:TODO����һ�仰�������������ʾʲô��  
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
