package com.jike.entity;

public class AccountInfo {
	private Integer id;
	private String name;
	private String account;
	private String password;
	
	public AccountInfo() {
		super();
	}
	
	public AccountInfo(String account, String password) {
		super();
		this.account = account;
		this.password = password;
	}

	public AccountInfo(Integer id, String account, String password) {
		super();
		this.id = id;
		this.account = account;
		this.password = password;
	}
	public AccountInfo(Integer id, String name,String account, String password) {
		super();
		this.id = id;
		this.name=name;
		this.account = account;
		this.password = password;
	}
	public AccountInfo(String name,String account, String password) {
		super();
		this.name=name;
		this.account = account;
		this.password = password;
	}
	

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "AccountInfo [id=" + id + ", name=" + name + ", account=" + account + ", password=" + password + "]";
	}

	
}
