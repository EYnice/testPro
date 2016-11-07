package com.mymvc.entity;

/**
 *描述用户信息的实体类
 * @author Administrator
 *
 */
public class Users {

	private String uname;
	private String upwd;
	
	public Users() {
		super();
	}
	public Users(String uname, String upwd) {
		super();
		this.uname = uname;
		this.upwd = upwd;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	
}
