package org.yangjie.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // 数据库实体
@Table(name="user") // 表名 和实体同名可省略
public class User {
	
	@Id // 主键
	@GeneratedValue // 自增字段
	private int id;
	@Column(name="username") // 字段映射 和字段名相同时可以省略
	private String username;
	private String password;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
}
