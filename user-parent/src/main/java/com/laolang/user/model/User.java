package com.laolang.user.model;

/**
 * 用户类.
 *
 * @author laolang
 * @version 0.0.1
 */
public class User {

	/**
	 * The Constructor.
	 */
	public User() {
		super();
	}

	/**
	 * The Constructor.
	 *
	 * @param id
	 *            用户ID
	 * @param name
	 *            用户名
	 * @param password
	 *            用户密码
	 * @param nickName
	 *            用户昵称
	 */
	public User(int id, String name, String password, String nickName) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.nickName = nickName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", nickName=" + nickName + "]";
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name
	 *            the name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password
	 *            the password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Gets the nick name.
	 *
	 * @return the nick name
	 */
	public String getNickName() {
		return nickName;
	}

	/**
	 * Sets the nick name.
	 *
	 * @param nickName
	 *            the nick name
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	/** 用户ID. */
	private int id;

	/** 用户名. */
	private String name;

	/** 用户密码 */
	private String password;

	/** 用户昵称. */
	private String nickName;

}
