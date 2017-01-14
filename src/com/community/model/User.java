/**
 * @Title: User.java
 * @Package: com.community.model
 * @Description: TODO
 * @author Steven Ming
 * @date 2017-1-14 ÏÂÎç12:05:38
 * @version V1.0
 */
package com.community.model;

/**
 * @author Steven Ming
 *
 */
public class User {
	private String userid;
	private String password;
	private Integer age;
	private String department;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
}
