package com.example.sqlitetest.model;

import java.util.Date;

public class ModelUser {

	private int userID; //用户ID。
	private String userName; //用户名称。
	private Date createDate; //用户创建时间。
	private int state = 1; //用户状态，1表示启用。
	
	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}

	
	

}
