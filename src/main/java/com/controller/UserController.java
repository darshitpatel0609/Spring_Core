package com.controller;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UserController implements InitializingBean,DisposableBean {
	private String name;
	private Integer salary;
	
	public UserController() {
		System.out.println("UserController()");
	}
	
	public void init() {
		System.out.println("XML base Init()");
	}
	
	public void destroy() {
		System.out.println("Java Based Destroy()");
	}
	
	public void destroyOne() {
		System.out.println("XML Based DestroyOne()");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("In java based initialize method is afterPropertiesSet() ");
	}

}
