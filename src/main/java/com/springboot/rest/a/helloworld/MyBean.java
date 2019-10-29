package com.springboot.rest.a.helloworld;

public class MyBean {

	private String message;

	@Override
	public String toString() {
		return "MyBean [message=" + message + "]";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public MyBean(String message) {
		super();
		this.message = message;
	}

	public MyBean() {
		// TODO Auto-generated constructor stub
	}

}
