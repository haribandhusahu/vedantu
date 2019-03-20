package com.vedantu.ecommerce.data;

import java.io.Serializable;

public class ServiceResponse<T> implements Serializable {
	private static final long serialVersionUID = -3795830829266243574L;
	private int status;
	private String msg;
	private T data;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	

}