package com.vedantu.ecommerce.data;

import java.io.Serializable;

public class OrderResponse extends ResponseBody implements Serializable{
	private static final long serialVersionUID = 2720153903025062836L;
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String log() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
