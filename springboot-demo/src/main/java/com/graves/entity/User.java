/**
 * 
 */
package com.graves.entity;

/**  
 * <p>Title: User</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2019年7月24日  
 */
public class User {
	private Integer userId;
	private String username;
	private String password;
	private String name;
	private Integer age;
	private Integer sex;	//性别  0 女  1 男
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", name=" + name
				+ ", age=" + age + ", sex=" + sex + "]";
	}
	
}
