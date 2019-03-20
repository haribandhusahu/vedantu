package com.vedantu.ecommerce.data;

import java.io.Serializable;
import java.sql.Date;

public class OrderRequest extends RequestBody implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7817478205188166342L;
	private String id;
	private String customerId;
	private int quantity;
	private Date createdDate;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	@Override
	public String toString() {
		return "OrderRequest [id=" + id + ", customerId=" + customerId + ", quantity=" + quantity + ", createdDate="
				+ createdDate + "]";
	}
	@Override
	public String log() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
