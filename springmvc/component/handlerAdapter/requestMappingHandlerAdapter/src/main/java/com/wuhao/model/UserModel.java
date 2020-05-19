package com.wuhao.model;

public class UserModel {

	private String username;
	
	private String password;
	
	//真实姓名
	private String realname;
	
	private cn.javass.chapter2.web.model.WorkInfoModel workInfo;
	
	private cn.javass.chapter6.model.SchoolInfoModel schoolInfo;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	
	public cn.javass.chapter6.model.SchoolInfoModel getSchoolInfo() {
		return schoolInfo;
	}
	
	public void setSchoolInfo(cn.javass.chapter6.model.SchoolInfoModel schoolInfo) {
		this.schoolInfo = schoolInfo;
	}
	
	public cn.javass.chapter2.web.model.WorkInfoModel getWorkInfo() {
		return workInfo;
	}
	
	public void setWorkInfo(cn.javass.chapter2.web.model.WorkInfoModel workInfo) {
		this.workInfo = workInfo;
	}

    @Override
    public String toString() {
        return "UserModel [username=" + username + ", password=" + password
                + ", realname=" + realname + ", workInfo=" + workInfo
                + ", schoolInfo=" + schoolInfo + "]";
    }

	
}
